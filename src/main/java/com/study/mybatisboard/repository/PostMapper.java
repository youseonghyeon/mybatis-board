package com.study.mybatisboard.repository;

import com.study.mybatisboard.domain.Post;
import com.study.mybatisboard.dto.post.SearchCond;
import com.study.mybatisboard.dto.post.UpdateDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface PostMapper {

    void save(Post post);

    void update(@Param("id") Long id, @Param("updateDto") UpdateDto updateDto);

    void delete(Long id);

    List<Post> findAll(SearchCond cond);

    Optional<Post> findById(Long id);

}
