package com.example.todoapp.mapper;

import com.example.todoapp.domain.User;
import com.example.todoapp.dto.UserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper MAPPER = Mappers.getMapper(UserMapper.class);

    User toUser(UserDTO userDTO);

    UserDTO fromUser(User user);
}