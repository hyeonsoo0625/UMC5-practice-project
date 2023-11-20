package com.example.demo.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
public class CommentUpdateResponse {
    private String text;

    @Builder
    public CommentUpdateResponse(String text) {
        this.text = text;
    }
}
