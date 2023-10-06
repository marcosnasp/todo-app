package com.example.todoapp.repository;

import com.example.todoapp.domain.TodoItems;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoItemsRepository extends JpaRepository<TodoItems, Integer> {
}
