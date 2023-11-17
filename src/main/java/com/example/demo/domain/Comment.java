package com.example.demo.domain;

import jakarta.persistence.*;

public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;

    @ManyToOne(fetch = FetchType.LAZY)
    private Member member;

    public Comment(String text, Member member) {
        this.text = text;
        this.member = member;
    }
}
