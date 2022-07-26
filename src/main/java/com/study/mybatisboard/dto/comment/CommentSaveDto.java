package com.study.mybatisboard.dto.comment;

import lombok.Data;

@Data
public class CommentSaveDto {
    
    private String nickname;
    private String content;
    private Long postId;
    private Long parentCommentId;
    private Long depth;
}
