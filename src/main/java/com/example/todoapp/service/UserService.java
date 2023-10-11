package com.example.todoapp.service;

import com.example.todoapp.dto.UserDTO;
import com.example.todoapp.mapper.UserMapper;
import com.example.todoapp.repository.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Page<UserDTO> findAll(Pageable page) {
        return userRepository.findAll(page).map(UserMapper.MAPPER::fromUser);
    }

    public UserDTO create(UserDTO userDTO) {
        return UserMapper.MAPPER.fromUser(userRepository.save(UserMapper.MAPPER.toUser(userDTO)));
    }

}
