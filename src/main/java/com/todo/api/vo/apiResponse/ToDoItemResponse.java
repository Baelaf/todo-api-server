package com.todo.api.vo.apiResponse;

import com.todo.api.common.response.ApiResponse;
import com.todo.api.vo.ToDoItem;
import lombok.Builder;
import lombok.NonNull;

import java.util.List;

public class ToDoItemResponse extends ApiResponse<ToDoItem> {

    @Builder
    public ToDoItemResponse(final ToDoItem toDoItem, final List<String> errors) {
        super(toDoItem);
        this.setErrors(errors);
    }
}
