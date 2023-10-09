package com.example.restdocs.post.request;

import lombok.Data;

@Data
public class PostUpdateRequest {
    private String title;
    private String content;
}
