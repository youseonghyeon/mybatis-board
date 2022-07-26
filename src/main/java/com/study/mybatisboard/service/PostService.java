package com.study.mybatisboard.service;

import com.study.mybatisboard.domain.Comment;
import com.study.mybatisboard.domain.Post;
import com.study.mybatisboard.dto.post.PostSaveDto;
import com.study.mybatisboard.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;


    public void savePost(PostSaveDto dto) {
        Post post = new Post(dto);
        postRepository.save(post);
    }
}
