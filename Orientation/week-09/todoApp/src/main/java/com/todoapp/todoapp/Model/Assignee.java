package com.todoapp.todoapp.Model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Assignee {
    private String name;
    private String email;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST, mappedBy = "assignee")
    private List<ToDo> todos;

    public Assignee(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public Assignee(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<ToDo> getTodoList () {
        return todos;
    }
    public void setTodoList (List<ToDo> todos) {
        this.todos = todos;
    }
}
