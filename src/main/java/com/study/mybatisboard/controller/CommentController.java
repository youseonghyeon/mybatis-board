package com.study.mybatisboard.controller;

import com.study.mybatisboard.dto.comment.CommentSaveDto;
import com.study.mybatisboard.repository.CommentRepository;
import com.study.mybatisboard.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class CommentController {

    private final CommentRepository commentRepository;
    private final CommentService commentService;

    @PostMapping("/comment/save")
    public String saveComment(CommentSaveDto dto) {
        commentService.save(dto);
        return "redirect:/post/" + dto.getPostId();
    }


}
