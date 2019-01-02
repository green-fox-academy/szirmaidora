package com.todoapp.todoapp.Controller;

import com.todoapp.todoapp.Model.Assignee;
import com.todoapp.todoapp.Model.ToDo;
import com.todoapp.todoapp.Repository.AssigneeRepository;
import com.todoapp.todoapp.Repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/assignee")
public class AssigneeController {
    private AssigneeRepository assigneeRepository;
    private ToDoRepository toDoRepository;

    @Autowired
    public AssigneeController(AssigneeRepository assigneeRepository, ToDoRepository toDoRepository) {
        this.assigneeRepository = assigneeRepository;
        this.toDoRepository = toDoRepository;
    }

    @GetMapping("/listassignees")
    public String list(Model model) {
        model.addAttribute("assigneelist", assigneeRepository.findAll());
        return "assigneelist";
    }

    @GetMapping("/addassignee")
    public String newAssignee(Model model) {
        model.addAttribute("newassignee", new Assignee());
        return "newassignee";
    }

    @PostMapping("/addassignee")
    public String added(@ModelAttribute Assignee newAssignee) {
        assigneeRepository.save(newAssignee);
        return "redirect:/assignee/listassignees";
    }
    @GetMapping("/{id}/delete")
    public String delete(@PathVariable Long id) {
        assigneeRepository.deleteById(id);
        return "redirect:/assignee/listassignees";
    }
    @GetMapping("/{id}/edit")
    public String editGet(@PathVariable Long id, Model model) {
        model.addAttribute("modelEdit", assigneeRepository.findById(id).get());
        return "AssigneeEdit";
    }

    @PostMapping("/edit")
    public String editPost(@ModelAttribute(name = "modelEdit")Assignee assignee) {
        assigneeRepository.save(assignee);
        return "redirect:listassignees";
    }
    @GetMapping("/{id}/show-todos")
    public String showTodosForAssignee(@PathVariable Long id,
                                       Model model) {
        model.addAttribute("assignee", assigneeRepository.findAssigneeById(id));
        return "assignee-todos";
    }
}
