package blog.api.service.database.seeds;

import blog.api.service.config.FakerConfiguration;
import blog.api.service.models.User;
import blog.api.service.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class UserSeeder {
    private final UserRepository userRepository;

    private final FakerConfiguration fakerConfiguration;

    @Autowired
    public UserSeeder(UserRepository userRepository, FakerConfiguration fakerConfiguration) {
        this.userRepository = userRepository;
        this.fakerConfiguration = fakerConfiguration;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            String name = this.fakerConfiguration.name().title();
            String email = this.fakerConfiguration.name().username() + "@gmail.com";
            String password = new BCryptPasswordEncoder().encode("secret");
            Boolean isActive = true;

            this.userRepository.save(new User(name, email, password, isActive));
        }

    }

}
