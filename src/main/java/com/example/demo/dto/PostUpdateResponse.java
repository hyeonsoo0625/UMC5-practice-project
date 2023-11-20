package com.example.demo.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
public class PostUpdateResponse {
	private String text;
	private String title;

	@Builder
	public PostUpdateResponse(String text, String title) {
		this.text = text;
		this.title = title;
	}
}
