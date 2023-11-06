package com.example.resumeexam.board;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class BoardForm {
	
	
	@NotEmpty(message="제목은 빈칸을 허용하지 않습니다. ")
	@Size(max=200)
  @Pattern(regexp = "^(?!\\s*$).+", message = "제목은 공백만으로 구성될 수 없습니다.")

	private String subject;
	
	
	@NotEmpty(message="내용은 필수로 입력하셔야 합니다.")
  @Pattern(regexp = "^(?!\\s*$).+", message = "내용은 공백만으로 구성될 수 없습니다.")

	private String content;
	
}