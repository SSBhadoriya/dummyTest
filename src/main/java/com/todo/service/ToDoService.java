package com.todo.service;

import com.todo.model.Todo;
import org.springframework.stereotype.Component;

//@Component
public interface ToDoService {

    Todo createData(Todo todo);
}
