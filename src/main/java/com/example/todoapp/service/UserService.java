package com.example.todoapp.service;

import com.example.todoapp.domain.User;
import com.example.todoapp.dto.UserDTO;
import com.example.todoapp.mapper.UserMapper;
import com.example.todoapp.repository.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    private final UserMapper userMapper;

    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    public Page<UserDTO> findAll(Pageable page) {
        return userRepository.findAll(page).map(userMapper);
    }

}
