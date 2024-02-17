package org.example.controller;

import org.example.entity.TodoItem;
import org.example.service.TodoItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todo")
@CrossOrigin
public class TodoItemController {

    @Autowired
    private TodoItemService todoItemService;

    @GetMapping
    public List<TodoItem> getAllTodoItems() {
        return todoItemService.list();
    }

    @PostMapping
    public TodoItem createTodoItem(@RequestBody TodoItem todoItem) {
        todoItemService.save(todoItem);
        return todoItem;
    }

    @GetMapping("/{id}")
    public TodoItem getTodoItemById(@PathVariable Long id) {
        return todoItemService.getById(id);
    }

    @PutMapping("/{id}")
    public TodoItem updateTodoItem(@PathVariable Long id, @RequestBody TodoItem todoItem) {
        todoItem.setId(id);
        todoItemService.updateById(todoItem);
        return todoItem;
    }

    @DeleteMapping("/{id}")
    public void deleteTodoItem(@PathVariable Long id) {
        todoItemService.removeById(id);
    }

}
