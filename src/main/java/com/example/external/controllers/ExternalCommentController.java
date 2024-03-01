package com.example.external.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class ExternalCommentController {
    @GetMapping("/topic/{topicId}")
    boolean validateComment(@RequestParam("text") String text, @RequestParam("author") String author, @PathVariable Long topicId) {
        return true;
    }
}
