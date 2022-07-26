package com.study.mybatisboard.dto.post;

import lombok.Data;

@Data
public class PostSaveDto {
    private String title;
    private String password;
    private String content;
}
