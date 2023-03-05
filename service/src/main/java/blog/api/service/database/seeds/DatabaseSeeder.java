package blog.api.service.database.seeds;

import blog.api.service.config.FakerConfiguration;
import blog.api.service.models.Post;
import blog.api.service.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component("seeder")
public class DatabaseSeeder {
    private final PostSeeder postSeeder;

    private final UserSeeder userSeeder;

    @Autowired
    public DatabaseSeeder(PostSeeder postSeeder, UserSeeder userSeeder) {
        this.postSeeder = postSeeder;
        this.userSeeder = userSeeder;
    }

    @Bean
    public CommandLineRunner loadData() {
        return (args) -> {
            this.postSeeder.run();
            this.userSeeder.run();
        };
    }
}
