package com.example.demo.dto;

import lombok.Getter;

@Getter
public class CommentUpdateResponse {
    private String text;

    public CommentUpdateResponse(String text) {
        this.text = text;
    }
}
