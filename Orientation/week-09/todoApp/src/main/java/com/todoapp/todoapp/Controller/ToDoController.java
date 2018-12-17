package com.todoapp.todoapp.Controller;

import com.todoapp.todoapp.Model.ToDo;
import com.todoapp.todoapp.Repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    @GetMapping("/todo")
    public String listing (@RequestParam (value = "param1", required = true) String param1){

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
        ToDo entity = new ToDo("Washing-up");
        entity.setDone(true);
        repository.save(entity);
        ToDo entity1 = new ToDo("Cleaning the windows");
        entity1.setDone(true);
        repository.save(entity1);
    }
}
