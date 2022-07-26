package com.study.mybatisboard.domain;

import com.study.mybatisboard.dto.comment.CommentSaveDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Comment {

    private Long id;
    private String nickname;
    private String content;
    private Long postId;
    private Long parentCommentId;
    private Long depth;

    public Comment(CommentSaveDto dto) {
        this.nickname = dto.getNickname();
        this.content = dto.getContent();
        this.postId = dto.getPostId();
        this.parentCommentId = dto.getParentCommentId();
        this.depth = dto.getDepth();
    }
}
