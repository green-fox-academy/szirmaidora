package com.todos.todos.Controller;

import com.todos.todos.Model.ToDo;
import com.todos.todos.Repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ToDoController implements CommandLineRunner {

    private ToDoRepository repository;

    @Autowired
    public ToDoController(ToDoRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/todo")
    public String main() {
        return "create";
    }


    @GetMapping("/create")
    public String newTodo() {
       // ToDo toDo =new ToDo (title);
       // repository.save(toDo);
        return "create";
    }

    @GetMapping(value = {"/", "/list"})
    public String list(Model model) {
        model.addAttribute("todo", repository.findAll());
        return "todolist";
    }

    @Override
    public void run(String... args) throws Exception {
        repository.save(new ToDo("I have to..."));
        repository.save(new ToDo("Then ..."));
    }
}
