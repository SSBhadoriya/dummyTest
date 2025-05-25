package com.todo.controller;

import com.todo.model.Todo;
import com.todo.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todos")
public class HomeController {

    @Autowired
    private ToDoService toDoService;
//    CREATE LOGIC HANDLER
    @PostMapping("/create")
    public Todo createTodo(@RequestBody Todo todo)
    {
        Todo todo1 = toDoService.createData(todo);
        return todo1;
    }
//    Testing
    @PostMapping("/testing")
    public void test()
    {
        toDoService.testingMethod();
    }
}
