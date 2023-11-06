package com.example.thymeleafexam.users;

import java.util.List;

import lombok.Data;


@Data
public class User {
	
	private String userid;
	
	private String[] friendarray;
	private List<String> friendlist;
}
