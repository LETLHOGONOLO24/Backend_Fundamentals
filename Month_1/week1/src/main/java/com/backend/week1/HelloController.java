package com.backend.week1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final UserRepository userRepository;

    public HelloController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public String createUser(@RequestParam String name) {
        User user = new User(name);
        userRepository.save(user);
        return "Saved user with id " + user.getId();
    }

    @GetMapping("/count")
    public long countUsers() {
        return userRepository.count();
    }

}
