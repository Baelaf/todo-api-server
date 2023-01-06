package com.todo.api.controller;

import com.todo.api.service.ToDoItemService;
import com.todo.api.vo.ToDoItem;
import com.todo.api.vo.adapter.ToDoItemAdapter;
import com.todo.api.vo.apiResponse.ToDoItemResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/todo")
public class ToDoItemController {
    @Autowired
    private ToDoItemService toDoItemService;

    @RequestMapping(method = RequestMethod.GET, value="/{id}")
    public @ResponseBody ToDoItemResponse get(@PathVariable(value="id") String id) {
        List<String> errors = new ArrayList<>();
        ToDoItem toDoItem = null;

        try {
            toDoItem = toDoItemService.get(id);
        } catch (final Exception e) {
            errors.add(e.getMessage());
        }

        return ToDoItemAdapter.toToDoItemResponse(toDoItem, errors);
    }

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody List<ToDoItemResponse> getAll() {
        List<String> errors = new ArrayList<>();
        List<ToDoItem> toDoItems = new ArrayList<>();
        List<ToDoItemResponse> toDoItemResponses = new ArrayList<>();

        toDoItems.stream().forEach(toDoItem -> {
            toDoItemResponses.add(ToDoItemAdapter.toToDoItemResponse(toDoItem, errors));
        });

        return toDoItemResponses;
    }

    @PostMapping()
    public @ResponseBody ToDoItemResponse create(@RequestBody final ToDoItem toDoItem) {
        List<String> errors = new ArrayList<>();

        try {
            toDoItemService.createDoToItem(toDoItem);
        } catch (final Exception e) {
            errors.add(e.getMessage());
        }

        ToDoItemResponse toDoItemResponse = ToDoItemAdapter.toToDoItemResponse(toDoItem, errors);

        return toDoItemResponse;
    }

}
