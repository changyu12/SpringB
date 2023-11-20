package com.example.s3demo;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.amazonaws.services.s3.model.S3Object;

public interface S3Service {

	void uploadFile(S3 s3 ,MultipartFile file) throws IOException;
	 S3Object downloadFile(String keyName);
	 
	 List<S3> readlist();
	 
	 S3 readdetail(Integer sid);
	
}
