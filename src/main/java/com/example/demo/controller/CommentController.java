package com.example.demo.controller;

import com.example.demo.dto.*;
import com.example.demo.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class CommentController {
    private final CommentService commentService;

    @PostMapping("/comments/create")
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

    @DeleteMapping("/comments/delete")
    public Long delete(
            @RequestBody CommentDeleteRequest request
    ){
        return commentService.deleteComment(request);
    }
}
