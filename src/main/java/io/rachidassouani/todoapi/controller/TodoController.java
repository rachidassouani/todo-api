package io.rachidassouani.todoapi.controller;

import io.rachidassouani.todoapi.model.Todo;
import io.rachidassouani.todoapi.service.HardCodedTodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TodoController {

    @Autowired
    private HardCodedTodoService hardCodedTodoService;

    @GetMapping("/users/{username}/todos")
    public List<Todo> findAllTodosByUsername(@PathVariable("username") String username) {
        return hardCodedTodoService.findAllTodosByUsername(username);
    }
}
