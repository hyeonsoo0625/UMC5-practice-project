package com.example.demo.dto;

import lombok.Getter;

@Getter
public class CommentRequest {
    private String text;
    private Long memberId;
    private Long postId;
}
