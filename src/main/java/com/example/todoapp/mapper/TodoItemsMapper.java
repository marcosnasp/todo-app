package com.example.todoapp.mapper;

import com.example.todoapp.domain.TodoItems;
import com.example.todoapp.dto.TodoItemsDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TodoItemsMapper {

    TodoItemsMapper MAPPER = Mappers.getMapper(TodoItemsMapper.class);

    TodoItems toToDoItems(TodoItemsDTO todoItemsDTO);

    TodoItemsDTO fromTodoItems(TodoItems todoItems);

}
