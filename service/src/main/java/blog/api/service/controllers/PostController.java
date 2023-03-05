package blog.api.service.controllers;

import blog.api.service.models.Post;
import blog.api.service.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class PostController {

    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping("/posts")
    public String createPost() {
        return "createPost";
    }

    @DeleteMapping("/posts")
    public String deletePost() {
        return "delete post";
    }

    @GetMapping("/posts")
    @ResponseBody
    public ResponseEntity<List<Post>> getPosts() {
        return ResponseEntity.ok().body(this.postService.getPosts());
    }

    @GetMapping("/posts/{uuid}")
    public String getPost() {
        return "getPost";
    }

    @PutMapping("/posts")
    public String updatePost() {
        return "updatePost";
    }
}
