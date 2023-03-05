package blog.api.service.database.seeds;

import blog.api.service.config.FakerConfiguration;
import blog.api.service.models.Post;
import blog.api.service.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class PostSeeder {
    private final PostRepository postRepository;

    private final FakerConfiguration fakerConfiguration;

    @Autowired
    public PostSeeder(PostRepository postRepository, FakerConfiguration fakerConfiguration) {
        this.postRepository = postRepository;
        this.fakerConfiguration = fakerConfiguration;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            String name = this.fakerConfiguration.name().title();
            String description = this.fakerConfiguration.name().title();

            this.postRepository.save(new Post(name, description, new Date()));
        }
    }
}
