package com.example.restdocs.post.request;

import lombok.Data;

@Data
public class PostCreateRequest {
    private String title;
    private String content;
}
