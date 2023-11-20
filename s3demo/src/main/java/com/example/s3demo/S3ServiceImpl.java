package com.example.s3demo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.S3Object;

@Service
public class S3ServiceImpl implements S3Service {
	
	@Autowired
	private AmazonS3 amazonS3;
	
	@Autowired
	private S3Repository s3Repository;
	
	@Value("chandol")
	private String bucketName;

	@Override
	public void uploadFile(S3 s3,@RequestParam("file") MultipartFile file) throws IOException {
		
		File sfile = new File(file.getOriginalFilename());
		
		//aws s3 mulpartfile을 막바로 올리수 없게 되어있다 
		//따라서 파일을 일단 저장한 후에 그 파일을 aws로 올리고 삭제한다. 
		
		try (FileOutputStream fos = new FileOutputStream(sfile)) {
			fos.write(file.getBytes());
		}
		
		//역시 보안등의 이유로 uuid 를 사용해도 좋지만 이번엔 다른 방법을 사용해 보자 
		
		String fileName = System.currentTimeMillis() + "_" + file.getOriginalFilename();
		amazonS3.putObject(new PutObjectRequest(bucketName, fileName, sfile));
		
		//파일을 s3로 올리고 서버에 저장했던 파일은 이제 완전히 삭제한다. 
		//file.delete();
		s3.setSfile(fileName);
		s3.setCreateDate(LocalDateTime.now());
		
		s3Repository.save(s3);

	}
	
	@Override
	public S3Object downloadFile(String keyName) {
	    S3Object object = amazonS3.getObject(new GetObjectRequest(bucketName, keyName));
	    return object;
	}

	@Override
	public List<S3> readlist() {
		
		return s3Repository.findAll();
	}

	@Override
	public S3 readdetail(Integer sid) {
		Optional<S3> sp = s3Repository.findById(sid);
		S3 s3 = sp.get();
		
		return s3;
	}

}