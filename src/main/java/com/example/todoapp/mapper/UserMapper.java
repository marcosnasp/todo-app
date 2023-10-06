package com.example.todoapp.mapper;

import com.example.todoapp.domain.User;
import com.example.todoapp.dto.UserDTO;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class UserMapper implements Function<User, UserDTO> {
    @Override
    public UserDTO apply(User user) {
        return new UserDTO(user.getUsername(), user.getEmail());
    }
}
