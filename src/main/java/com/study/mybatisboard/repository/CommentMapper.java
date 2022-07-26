package com.study.mybatisboard.repository;

import com.study.mybatisboard.domain.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentMapper {

    void save(Comment comment);

    List<Comment> findAllByPostId(Long postId);
}
