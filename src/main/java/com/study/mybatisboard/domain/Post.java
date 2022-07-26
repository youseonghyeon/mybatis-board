package com.study.mybatisboard.domain;

import com.study.mybatisboard.dto.post.PostSaveDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Post {

    private Long id;
    private String title;
    private String password;
    private String content;


    public Post(PostSaveDto dto) {
        this.title = dto.getTitle();
        this.password = dto.getPassword();
        this.content = dto.getContent();
    }
}
