package com.NeedMoreCat.kitties.todo.service;

import com.NeedMoreCat.kitties.todo.model.TodoItem;
import com.NeedMoreCat.kitties.todo.model.TodoItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoItemService {
    @Autowired
    private TodoItemRepository todoRepo;

    public List<TodoItem> getTodos() {
        List<TodoItem> todos = todoRepo.findAll();

        if(!todos.isEmpty()) return todoRepo.findAll();
        else throw new IllegalArgumentException("no such data");
    }

    public TodoItem getTodoById(final Long id) {
        return todoRepo.findById(id).orElseThrow(()->new IllegalArgumentException("no such data"));
    }

    public TodoItem createTodo(final TodoItem createTodoItem) {
        if(createTodoItem == null) throw new IllegalArgumentException("todo item cannot be null");
        return todoRepo.save(createTodoItem);
    }

    public TodoItem updateTodo(final long id, final TodoItem updateTodoItem) {
        TodoItem todoItem = getTodoById(id);
        todoItem.setTitle(updateTodoItem.getTitle());
        todoItem.setDone(updateTodoItem.isDone());

        return todoRepo.save(todoItem);
    }

    public void deleteTodoById(final Long id) {
        todoRepo.deleteById(id);
    }
}
