package com.todo.api.service;

import com.todo.api.vo.ToDoItem;
import org.springframework.stereotype.Service;

@Service
public interface ToDoItemService {
    public ToDoItem get(final String id);

    public void createDoToItem(final ToDoItem toDoItem);
}
