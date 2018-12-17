package com.todos.todos.Repository;

import com.todos.todos.Model.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;


public interface ToDoRepository extends CrudRepository <ToDo, Long> {
}
