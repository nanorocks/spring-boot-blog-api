package blog.api.service.controllers;

import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    @PostMapping("/users")
    public String createUser() {
        return "createUser";
    }

    @DeleteMapping("/users")
    public String deleteUser() {
        return "deleteUser";
    }

    @GetMapping("/users")
    public String getUsers() {
        return "getUsers";
    }

    @GetMapping("/users/{uuid}")
    public String getUser() {
        return "getUser";
    }

    @PutMapping("/users")
    public String updateUser() {
        return "updateUser";
    }
}
