package com.myProject.springboot.myFirstWeb.todoService;

import com.myProject.springboot.myFirstWeb.todo.ToDo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoService {

    private static List<ToDo> todos = new ArrayList<>();
    static {
        todos.add(new ToDo(1, "learning", "Learn Spring MVC", LocalDate.now().plusDays(1), false));
        todos.add(new ToDo(2, "learning", "Learn Struts", LocalDate.now().plusDays(2), false));
        todos.add(new ToDo(3, "learning", "Learn Hibernate", LocalDate.now().plusDays(3), false));
    }

    public List<ToDo> retrieveTodosByName(String userName) {
        List<ToDo> filteredTodos = new ArrayList<ToDo>();
        for (ToDo todo : todos) {
            if (todo.getUserName().equals(userName)) {
                filteredTodos.add(todo);
            }
        }
        return filteredTodos;
    }

}
