package io.rachidassouani.todoapi.service;

import io.rachidassouani.todoapi.model.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class HardCodedTodoService {

    private static List<Todo> todos = new ArrayList<>();
    private static long idCounter = 0;

    static {
        todos.add(new Todo(++idCounter, "learn Java", "rachid", new Date(), true));
        todos.add(new Todo(++idCounter, "learn JavaScript", "rachid", new Date(), true));
        todos.add(new Todo(++idCounter, "learn Angular", "rachida", new Date(), false));
    }

    public List<Todo> findAllTodosByUsername(String username) {
        List<Todo> todosByUsername = new ArrayList<>();

        for (Todo t: todos) {
            if (t.getUsername().equals(username))
                todosByUsername.add(t);
        }
        return todosByUsername;
    }
}
