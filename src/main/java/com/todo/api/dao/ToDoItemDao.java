package com.todo.api.dao;

import com.todo.api.vo.ToDoItem;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ToDoItemDao {
    public void insertToDoItem(ToDoItem toDoItem);
}
