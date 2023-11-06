package com.example.boot3mybatis.notice;

import java.util.List;
import java.util.UUID;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class NoticeServiceImpl implements NoticeService {

	@Autowired
	private NoticeRepository noticeRepository;
	
	@Override
	public void create(Notice notice,MultipartFile file) {
		
		String uuid = UUID.randomUUID().toString();
		
		String filename = uuid + "_" + file.getOriginalFilename();
		
		String FTP_ADDRESS = "iup.cdn1.cafe24.com";
		String LOGIN = "chandool";
		String PSW = "rb123123!";
		
			FTPClient con = null;
		
		try {
			con = new FTPClient();
			con.connect(FTP_ADDRESS);
			
			if(con.login(LOGIN, PSW)) {
				con.enterLocalPassiveMode();
				con.setFileType(FTP.BINARY_FILE_TYPE);
				con.storeFile(filename, file.getInputStream());
				con.logout();
				con.disconnect();
				System.out.println("success!!!");
			}
		} catch (Exception e) {
			System.out.println("fail!!!");
		}
		
		
		
		notice.setNfile(filename);
		noticeRepository.create(notice);
	}


	@Override
	public List<Notice> readlist() {
		return noticeRepository.readlist();
	}

	@Override
	public Notice readdetail(String nid) {
		return noticeRepository.readdetail(nid);
	}

	@Override
	public void update(Notice notice,MultipartFile file) {
		String filecheck = file. getOriginalFilename();
		String uuid = UUID.randomUUID().toString();
		String filename = uuid + "_" + file.getOriginalFilename();	
		
		if (filecheck != null && !filecheck.trim().isEmpty()) {
			//사진 수정이 없을때 (즉 기존 사진 그대로 사용)	
			//사진 수정이 있을때(즉 기존사진 변경)
			
			

			
			String FTP_ADDRESS = "iup.cdn1.cafe24.com";
			String LOGIN = "chandool";
			String PSW = "rb123123!";
			
	FTPClient con = null;
			
			try {
				con = new FTPClient();
				con.connect(FTP_ADDRESS);
				
				if(con.login(LOGIN, PSW)) {
					con.enterLocalPassiveMode();
					con.setFileType(FTP.BINARY_FILE_TYPE);
					con.storeFile(filename, file.getInputStream());
					con.logout();
					con.disconnect();
					System.out.println("success!!!");
				}
			} catch (Exception e) {
				System.out.println("fail!!!");
			}
			
			notice.setNfile(filename);
			
		}
		
		noticeRepository.update(notice);

	}

		
		
	

	@Override
	public void delete(String nid) {
		noticeRepository.delete(nid);


	}

}