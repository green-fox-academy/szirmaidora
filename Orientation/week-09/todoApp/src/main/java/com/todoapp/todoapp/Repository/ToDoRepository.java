package com.todoapp.todoapp.Repository;

import com.todoapp.todoapp.Model.ToDo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ToDoRepository extends CrudRepository <ToDo, Long> {
    List<ToDo> findAllByDone(Boolean done);
    @Query("select t from ToDo t where t.title like %?1% or t.description like %?1%")
    List<ToDo> findAllByTitleByDescription(String s);
}
