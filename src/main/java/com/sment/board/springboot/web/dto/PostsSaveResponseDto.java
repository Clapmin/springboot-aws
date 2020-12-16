package com.sment.board.springboot.web.dto;

import com.sment.board.springboot.domain.posts.Posts;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsSaveResponseDto {
    private String title;
    private String content;
    private String author;

    public PostsSaveResponseDto(Posts posts) {
        this.title = posts.getTitle();
        this.content = posts.getContent();
        this.author = posts.getAuthor();
    }
}
