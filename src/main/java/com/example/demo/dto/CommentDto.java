package com.example.demo.dto;

public class CommentDto {
    public CommentDto(Long id, String text) {
        this.id = id;
        this.text = text;
    }

    private final Long id;
    private final String text;

    public Long getId() {
        return id;
    }

    public String getText() {
        return text;
    }
}
