package com.example.todoapp.service;

import com.example.todoapp.dto.TodoItemsDTO;
import com.example.todoapp.mapper.TodoItemsMapper;
import com.example.todoapp.repository.TodoItemsRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class TodoItemsService {

    private final TodoItemsRepository todoItemsRepository;

    public TodoItemsService(TodoItemsRepository todoItemsRepository) {
        this.todoItemsRepository = todoItemsRepository;
    }

    public Page<TodoItemsDTO> findAll(Pageable pageable) {
        return todoItemsRepository.findAll(pageable).map(TodoItemsMapper.MAPPER::fromTodoItems);
    }
}
