package com.todo.serviceImpl;

import com.todo.model.Todo;
import com.todo.repository.TodoRepo;
import com.todo.service.ToDoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class ToDoServiceImpl implements ToDoService {
    Logger logger= LoggerFactory.getLogger(ToDoService.class);

    List<Todo> todoList=new ArrayList<>();
    @Autowired
    TodoRepo todoRepo;

    @Override
    public Todo createData(Todo todo) {

        todoRepo.createData(todo);
//        todoList.add(todo);
//        logger.info("DATA Created {}",todoList);
        return todo;
    }
}
