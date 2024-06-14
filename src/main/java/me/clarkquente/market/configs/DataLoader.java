package me.clarkquente.market.configs;

import me.clarkquente.market.models.User;
import me.clarkquente.market.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private UserRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) {
        User user = new User();
        user.setUsername("hertzrafael");
        user.setPassword(passwordEncoder.encode("12345"));
        user.setRole(User.Role.ADMIN);
        repository.save(user);
    }
}
