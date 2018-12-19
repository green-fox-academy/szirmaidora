package com.todoapp.todoapp.Controller;

import com.todoapp.todoapp.Repository.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/assignee")
public class AssigneeController {
    private AssigneeRepository assigneeRepository;

    @Autowired
    public AssigneeController(AssigneeRepository assigneeRepository) {
        this.assigneeRepository = assigneeRepository;
    }

    @GetMapping("/listassignees")
    public String list(Model model) {
        model.addAttribute("assigneelist", assigneeRepository.findAll());
        return "assigneelist";
    }
}
