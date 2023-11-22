package com.example.demo.controller;

import com.example.demo.dto.*;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.service.PostService;

@RestController
@RequiredArgsConstructor
public class PostController {

	private final PostService postService;

	// 게시글(Post) 작성
	@PostMapping("/posts")
	public Long post(
			@RequestBody PostRequest request
	) {
		return postService.post(request);
	}

	// 조회
	@GetMapping("/posts")
	public PostDto post(
			@RequestParam("id") Long postId
	) {
		return postService.getPost(postId);
	}

	// 게시글 업데이트
	@PatchMapping("/posts")
	public PostUpdateResponse post(
			@RequestBody PostUpdateRequest request
	) {
		return postService.updatePost(request);
	}

	@DeleteMapping("/posts/delete")
	public Long post(
			@RequestBody PostDeleteRequest request
	){
		return postService.deletePost(request);
	}


}
