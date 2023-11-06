package com.example.y.board;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardRepository boardRepository;
	
	@Override
	public void create(Map<String, Object> map , MultipartFile file) {
		//파일 이름 UUID 처리 
				String timg = file.getOriginalFilename();
				String bimg = UUID.randomUUID().toString() + "_"+ timg;
		//파일 전송
		String FTP_ADDRESS = "chandool.cafe24.com";
		String LOGIN = "chandool";
		String PSW = "rb123123!";
		
		FTPClient con = null;
		
		try {
			con = new FTPClient();
			con.connect(FTP_ADDRESS);
			
			if(con.login(LOGIN, PSW)) {
				con.enterLocalPassiveMode();
				con.setFileType(FTP.BINARY_FILE_TYPE);
				con.storeFile(bimg, file.getInputStream());
				con.logout();
				con.disconnect();
				System.out.println("success!!!");
			}
		} catch (Exception e) {
			System.out.println("fail!!!");
		}
		
		
		
		map.put("bimg",bimg);

		
		
		
		boardRepository.create(map);
	}

	@Override
	public List<Board> readlist() {
		return boardRepository.readlist();
	}

	@Override
	public Board readdetail(String bno) {
		
		return boardRepository.readdetail(bno);
	}

	@Override
	public void update(Map<String, Object> map) {
		boardRepository.update(map);

	}

	@Override
	public void delete(String bno) {
		boardRepository.delete(bno);
	}
}