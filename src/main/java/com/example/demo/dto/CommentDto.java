package com.example.demo.dto;

import lombok.Getter;

@Getter
public class CommentDto {
    public CommentDto(Long id, String text, Long postId) {
        this.id = id;
        this.text = text;
        this.postId = postId;
    }

    private final Long id;
    private final String text;
    private final Long postId;
}
