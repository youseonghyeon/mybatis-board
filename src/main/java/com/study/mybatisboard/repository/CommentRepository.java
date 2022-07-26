package com.study.mybatisboard.repository;

import com.study.mybatisboard.domain.Comment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class CommentRepository {

    private final CommentMapper commentMapper;

    public void save(Comment comment) {
        commentMapper.save(comment);
    }

    public List<Comment> findAllByPostId(Long id) {
        return commentMapper.findAllByPostId(id);
    }
}
