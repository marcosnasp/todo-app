package com.example.todoapp.controller;

import com.example.todoapp.dto.TodoItemsDTO;
import com.example.todoapp.service.TodoItemsService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/todos")
public class TodoItemsController {

    private final TodoItemsService todoItemsService;

    public TodoItemsController(TodoItemsService todoItemsService) {
        this.todoItemsService = todoItemsService;
    }

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Page<TodoItemsDTO>> findAll(Pageable pageable) {
        return ResponseEntity.status(HttpStatus.OK).body(todoItemsService.findAll(pageable));
    }

}
