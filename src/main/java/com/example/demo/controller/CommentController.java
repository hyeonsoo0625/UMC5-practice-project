package com.example.demo.controller;

import com.example.demo.dto.*;
import com.example.demo.service.CommentService;
import org.springframework.web.bind.annotation.*;

public class CommentController {
    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping("/comments")
    public Long comment(
            @RequestBody CommentRequest request) {
        return commentService.create(request);
    }

    @GetMapping("/comments")
    public CommentDto comment(
            @RequestParam("id") Long commentId
    ){
        return commentService.getComment(commentId);
    }


    @PatchMapping("/comments")
    public CommentUpdateResponse comment(
            @RequestBody CommentUpdateRequest request
    ){
        return commentService.updateComment(request);
    }
}
