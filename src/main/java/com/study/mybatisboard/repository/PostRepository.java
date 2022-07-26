package com.study.mybatisboard.repository;

import com.study.mybatisboard.domain.Post;
import com.study.mybatisboard.dto.post.SearchCond;
import com.study.mybatisboard.dto.post.UpdateDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class PostRepository {

    private final PostMapper postMapper;

    public void save(Post post) {
        postMapper.save(post);
    }

    public void update(Long id, UpdateDto updateDto) {
        postMapper.update(id, updateDto);
    }

    public List<Post> findAll(String title) {
        SearchCond cond = new SearchCond();
        cond.setTitle(title);
        return postMapper.findAll(cond);
    }

    public Optional<Post> findById(Long id) {
        return postMapper.findById(id);
    }

    public void delete(Long id) {
        postMapper.delete(id);
    }
}
