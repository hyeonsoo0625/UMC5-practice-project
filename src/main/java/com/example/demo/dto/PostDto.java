package com.example.demo.dto;

import lombok.Getter;

@Getter
public class PostDto {

	private Long id;
	private String title;
	private String text;

	public PostDto(Long id, String title, String text) {
		this.id = id;
		this.title = title;
		this.text = text;
	}
}
