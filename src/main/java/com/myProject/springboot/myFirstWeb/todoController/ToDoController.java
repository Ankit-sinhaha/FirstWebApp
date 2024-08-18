package com.myProject.springboot.myFirstWeb.todoController;

import com.myProject.springboot.myFirstWeb.todo.ToDo;
import com.myProject.springboot.myFirstWeb.todoService.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class ToDoController {


    private ToDoService toDoService ;


    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    @RequestMapping("lists-todos")
    public String showAllToDos(ModelMap modelMap) {
       List<ToDo> todos =  toDoService.retrieveTodosByName("learning");
       modelMap.addAttribute("todos", todos); // (key, value ) pair
        return "listTodos";
    }
}
