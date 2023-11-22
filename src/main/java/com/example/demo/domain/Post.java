package com.example.demo.domain;

import com.example.demo.domain.common.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Post extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;
    private String title;

    // DEFAULT = FetchType.EAGER
    @ManyToOne(fetch = FetchType.LAZY)
    private Member member;

    public Post(String text, String title, Member member) {
        this.text = text;
        this.title = title;
        this.member = member;
    }

    protected Post() {
    }
}
