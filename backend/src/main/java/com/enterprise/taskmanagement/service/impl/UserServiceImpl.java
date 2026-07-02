package com.enterprise.taskmanagement.service.impl;

import com.enterprise.taskmanagement.dto.auth.RegisterRequest;
import com.enterprise.taskmanagement.dto.auth.RegisterResponse;
import com.enterprise.taskmanagement.entity.User;
import com.enterprise.taskmanagement.entity.UserRole;
import com.enterprise.taskmanagement.repository.UserRepository;
import com.enterprise.taskmanagement.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public RegisterResponse register(RegisterRequest request) {
        User user = User.builder()
                .email(request.getEmail())
                .password(request.getPassword())
                .fullName(request.getFullName())
                .role(UserRole.MEMBER)
                .build();

        User savedUser = userRepository.save(user);

        return RegisterResponse.builder()
                .id(savedUser.getId())
                .email(savedUser.getEmail())
                .fullName(savedUser.getFullName())
                .role(savedUser.getRole().name())
                .build();
    }
}
