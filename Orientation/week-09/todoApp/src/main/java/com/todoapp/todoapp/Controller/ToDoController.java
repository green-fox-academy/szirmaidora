package com.todoapp.todoapp.Controller;

import com.todoapp.todoapp.Model.ToDo;
import com.todoapp.todoapp.Repository.AssigneeRepository;
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
    private AssigneeRepository assigneeRepository;

    @Autowired
    public ToDoController(ToDoRepository repository, AssigneeRepository assigneeRepository) {
        this.repository = repository;
        this.assigneeRepository = assigneeRepository;
    }

    @GetMapping("/")
    public String listing(@RequestParam(name = "isActive", required = false) Boolean isActive, Model model) {
        if (isActive == null) {
            model.addAttribute("todo", repository.findAll());
        } else if (isActive) {
            model.addAttribute("todo", repository.findAllByDone(!isActive));
        }
        return "todolist";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable Long id) {
        repository.deleteById(id);
        return "redirect:/todo/list";
    }

    @GetMapping("/{id}/edit")
    public String editGet(@PathVariable Long id, Model model) {
        model.addAttribute("modelEdit", repository.findById(id).get());
        model.addAttribute("assigneelist",assigneeRepository.findAll());
        return "ToDoEdit";
    }

    @PostMapping("/edit")
    public String editPost(@ModelAttribute(name = "modelEdit") ToDo toDo, @ModelAttribute(value = "assig") String assig) {
        toDo.setAssignee(assigneeRepository.findByName(assig));
        repository.save(toDo);
        return "redirect:list";
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

    @GetMapping("/list")
    public String list(@RequestParam(name = "searchItem", required = false) String searchItem, Model model) {
        if (searchItem == null) {
            model.addAttribute("todo", repository.findAll());
            return "todolist";
        } else {
            model.addAttribute("todo",repository.findAllByTitleByDescription(searchItem));
            return "todolist";
        }
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
