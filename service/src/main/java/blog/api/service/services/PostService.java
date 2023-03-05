package blog.api.service.services;

import blog.api.service.models.Post;
import blog.api.service.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class PostService {
    private final PostRepository postRepository;
    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public String createPost() {
        return "createPost";
    }

    public String deletePost() {
        return "delete post";
    }

    public List<Post> getPosts() {
        return this.postRepository.findAll();
    }

    public String getPost() {
        return "getPost";
    }

    public String updatePost() {
        return "updatePost";
    }
}
