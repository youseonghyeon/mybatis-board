package com.study.mybatisboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    @GetMapping("/") // 글 리스트
    public String boardList(Model model) {
        model.addAttribute("content", "리스트");
        return "list";
    }

    @GetMapping("/write")
    public String writePost(Model model) {
        return "write";
    }
}
