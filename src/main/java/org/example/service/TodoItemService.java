package org.example.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.entity.TodoItem;
import org.example.mapper.TodoItemMapper;
import org.springframework.stereotype.Service;

@Service
public class TodoItemService extends ServiceImpl<TodoItemMapper, TodoItem>{
}