package com.NeedMoreCat.kitties.todo.controller;

import com.NeedMoreCat.kitties.todo.model.TodoItem;
import com.NeedMoreCat.kitties.todo.service.TodoItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoItemController {

    @Autowired
    TodoItemService todoItemService;

    @GetMapping("/g")
    public String test() {return "Hello";}

    @GetMapping("/getTodoItem")
    public List<TodoItem> getTodoItem() {
        return todoItemService.getTodos();
    }
}
