package com.rizwan.authapi.config;

import com.rizwan.authapi.entity.Role;
import com.rizwan.authapi.entity.User;
import com.rizwan.authapi.repository.RoleRepository;
import com.rizwan.authapi.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final RoleRepository roleRepository;
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) {

        // Create Roles if not exists
        Role userRole = roleRepository.findByName("USER")
                .orElseGet(() -> roleRepository.save(
                        Role.builder().name("USER").build()
                ));

        Role adminRole = roleRepository.findByName("ADMIN")
                .orElseGet(() -> roleRepository.save(
                        Role.builder().name("ADMIN").build()
                ));

        // Create Admin User if not exists
        if (!userRepository.existsByEmail("admin@gmail.com")) {

            User admin = User.builder()
                    .firstname("Super")
                    .lastname("Admin")
                    .email("admin@gmail.com")
                    .password(passwordEncoder.encode("admin123"))
                    .roles(Set.of(adminRole))
                    .build();

            userRepository.save(admin);
        }
    }
}
