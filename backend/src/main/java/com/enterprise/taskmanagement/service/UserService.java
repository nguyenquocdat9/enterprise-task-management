package com.enterprise.taskmanagement.service;

import com.enterprise.taskmanagement.dto.auth.RegisterRequest;
import com.enterprise.taskmanagement.dto.auth.RegisterResponse;

public interface UserService {

    RegisterResponse register(RegisterRequest request);
}