package com.example.demo.dto;

import lombok.Getter;

@Getter
public class PostRequest {
	private String title;
	private String text;
	private Long memberId;
}
