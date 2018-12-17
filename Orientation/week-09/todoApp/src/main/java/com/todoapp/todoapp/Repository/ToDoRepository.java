package com.todoapp.todoapp.Repository;

import com.todoapp.todoapp.Model.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;


public interface ToDoRepository extends CrudRepository <ToDo, Long> {
}
