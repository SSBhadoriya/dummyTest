package com.todo.repository;

import com.todo.controller.HomeController;
import com.todo.model.Todo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class TodoRepo {
    Logger logger= LoggerFactory.getLogger(TodoRepo.class);



    public TodoRepo(@Autowired JdbcTemplate template) {
        System.out.println("Constructor calling........................");
        String createTable= "CREATE TABLE if not exist TEST(id int primary key, title varchar(100), content varchar(100), status varchar(20))";
        int update = template.update(createTable);
        logger.info("Table created: {}",update);
    }

//Creating DB data
    public void createData(Todo todo) {
    }
}
