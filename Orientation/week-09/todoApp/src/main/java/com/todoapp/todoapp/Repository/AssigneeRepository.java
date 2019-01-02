package com.todoapp.todoapp.Repository;

import com.todoapp.todoapp.Model.Assignee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AssigneeRepository extends CrudRepository <Assignee, Long> {
    Assignee findByName(String assignee);
    Assignee findAssigneeById (Long id);
}
