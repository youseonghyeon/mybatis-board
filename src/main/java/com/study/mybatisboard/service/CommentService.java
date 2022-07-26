package com.study.mybatisboard.service;

import com.study.mybatisboard.domain.Comment;
import com.study.mybatisboard.dto.comment.CommentSaveDto;
import com.study.mybatisboard.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;

    public void save(CommentSaveDto dto) {
        Comment comment = new Comment(dto);
        commentRepository.save(comment);
    }

    public List<Comment> findAllByPostId(Long postId) {
        List<Comment> comments = commentRepository.findAllByPostId(postId);
        // 변환 로직
        return comments;
    }
}
