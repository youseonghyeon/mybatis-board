package com.study.mybatisboard.controller;

import com.study.mybatisboard.domain.Comment;
import com.study.mybatisboard.domain.Post;
import com.study.mybatisboard.dto.post.PostSaveDto;
import com.study.mybatisboard.repository.CommentRepository;
import com.study.mybatisboard.repository.PostRepository;
import com.study.mybatisboard.service.CommentService;
import com.study.mybatisboard.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class BoardController {

    private final PostRepository postRepository;
    private final PostService postService;
    private final CommentService commentService;

    @GetMapping("/post") // 글 리스트
    public String boardList(Model model, @RequestParam(name = "title", required = false) String title) {
        List<Post> posts = postRepository.findAll(title);
        model.addAttribute("postList", posts);
        return "list";
    }

    @GetMapping("/write")
    public String writePost() {
        return "write";
    }

    @PostMapping("/save")
    public String savePost(@ModelAttribute PostSaveDto saveDto, RedirectAttributes attributes) {
        postService.savePost(saveDto);
        attributes.addAttribute("message", "저장 성공");
        return "redirect:/post";
    }

    @GetMapping("/post/{postId}")
    public String getBoard(@PathVariable Long postId, Model model) {
        Optional<Post> post = postRepository.findById(postId);
        if (post.isEmpty()) {
            throw new IllegalStateException();
        }

        List<Comment> comments = commentService.findAllByPostId(postId);
        model.addAttribute("commentList", comments);
        model.addAttribute("post", post.get());
        return "post";
    }
}
