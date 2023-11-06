package com.example.resumeexam.reply;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class ReplyForm {
	
	

	
	
	@NotEmpty(message="내용은 필수로 입력하셔야 합니다.")
	@Pattern(regexp = "^(?!\\s*$).+", message = "내용은 공백만으로 구성될 수 없습니다.")
	private String content;
	
}