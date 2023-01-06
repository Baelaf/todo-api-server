package com.todo.api.vo.adapter;

import com.todo.api.vo.ToDoItem;
import com.todo.api.vo.apiResponse.ToDoItemResponse;

import java.util.List;

public class ToDoItemAdapter {
    public static ToDoItem toToDoItem(final ToDoItem toDoItemRequest) {
        return ToDoItem.builder().id(toDoItemRequest.getId()).title(toDoItemRequest.getTitle()).done(toDoItemRequest.isDone()).build();
    }

    public static ToDoItemResponse toToDoItemResponse(final ToDoItem toDoItem, final List<String> errors) {
        return ToDoItemResponse.builder().toDoItem(toDoItem).errors(errors).build();
    }
}
