package com.example.demo.service;

import com.example.demo.domain.Comment;
import com.example.demo.domain.Member;
import com.example.demo.domain.Post;
import com.example.demo.dto.*;
import com.example.demo.repository.CommentRepository;
import com.example.demo.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class CommentService {

    private final CommentRepository commentRepository;

    private final MemberRepository memberRepository;

    @Autowired
    public CommentService(CommentRepository commentRepository, MemberRepository memberRepository) {
        this.commentRepository = commentRepository;
        this.memberRepository = memberRepository;
    }
    @Transactional
    public Long create(CommentRequest request){
        Member member = memberRepository.findById(request.getMemberId()).get();
        Comment comment = new Comment(request.getText(), member);
        Comment saveComment = commentRepository.save(comment);
        return saveComment.getId();
    }


    @Transactional
    public CommentDto getComment(Long commentId){
        Optional<Comment> optionalComment = commentRepository.findById(commentId);
        Comment comment = optionalComment.get();
        CommentDto dto = new CommentDto(comment.getId(), comment.getText());
        return dto;
    }

    @Transactional
    public CommentUpdateResponse updateComment(CommentUpdateRequest request){
        Optional<Comment> optionalComment = commentRepository.findById(request.getId());
        Comment comment = optionalComment.get();

        comment.setText(request.getText());
        return new CommentUpdateResponse(
                comment.getText()
        );
    }
    @Transactional
    public Long deleteComment(CommentDeleteRequest request){
        Optional<Comment> optionalComment = commentRepository.findById(request.getId());
        Comment comment = optionalComment.get();
        commentRepository.delete(comment);
        return request.getId();
    }
}
