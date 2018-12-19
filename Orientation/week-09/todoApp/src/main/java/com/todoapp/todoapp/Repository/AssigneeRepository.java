package com.todoapp.todoapp.Repository;

import com.todoapp.todoapp.Model.Assignee;
import org.springframework.data.repository.CrudRepository;

public interface AssigneeRepository extends CrudRepository <Assignee, Long> {
}
