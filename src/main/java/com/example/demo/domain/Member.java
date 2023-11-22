package com.example.demo.domain;


import com.example.demo.domain.common.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

// Member의 구성요소 - id, 이름, 닉네임, 나이, 성별
@Entity
@Getter
@Setter
public class Member extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String password;

	private String name;

	private Integer age;

	@Enumerated(EnumType.STRING)
	private Gender gender;


	// DEFAULT = FetchType.LAZY
	@OneToMany(mappedBy = "member")
	private List<Post> posts = new ArrayList<>();

	@OneToMany(mappedBy = "member")
	private List<Comment> comments = new ArrayList<>();
	@Builder
	public Member(String name, Integer age, Gender gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	/**
	 * 이건 지우지말고 냅두세요
	 */
	protected Member() {
	}

}
