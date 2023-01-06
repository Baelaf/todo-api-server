package com.todo.api.service.impl;

import com.todo.api.dao.ToDoItemDao;
import com.todo.api.service.ToDoItemService;
import com.todo.api.vo.ToDoItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToDoItemServiceImpl implements ToDoItemService {
    @Autowired
    private ToDoItemDao toDoItemDao;

    @Override
    public ToDoItem get(String id) {
        return ToDoItem.builder()
                .title("Add an id validation")
                .build();
    }

    @Override
    public void createDoToItem(ToDoItem toDoItem) {
        toDoItemDao.insertToDoItem(toDoItem);
    }
}
