package com.todoapp.todoapp.Controller;

import com.todoapp.todoapp.Model.ToDo;
import com.todoapp.todoapp.Repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class ToDoController implements CommandLineRunner {

    private ToDoRepository repository;

    @Autowired
    public ToDoController(ToDoRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/")
    public String listing(@RequestParam(value = "isActive", required = false) String param1, Model model) {
        if (param1.isEmpty()) {
            model.addAttribute("todo", repository.findAllByDone(true));
        } else if (param1.equals("true")) {
            model.addAttribute("todo", repository.findAll());
        }
        return "todolist";
    }

    @GetMapping("/create")
    public String newTodoo(Model model) {
        model.addAttribute("newToDo", new ToDo());
        return "create";
    }

    @PostMapping("/create")
    public String added(@ModelAttribute ToDo newToDo) {
        repository.save(newToDo);
        System.out.println(newToDo.getTitle());
        return "redirect:/todo/list";
    }


    @GetMapping(value = {"/list"})
    public String list(Model model) {
        model.addAttribute("todo", repository.findAll());
        return "todolist";
    }


    @Override
    public void run(String... args) throws Exception {
  /*      repository.save(new ToDo("I have to..."));
        repository.save(new ToDo("Then ..."));
        ToDo entity = new ToDo("Washing-up");
        entity.setDone(true);
        repository.save(entity);
        ToDo entity1 = new ToDo("Cleaning the windows");
        entity1.setDone(true);
        repository.save(entity1);*/
    }
}
