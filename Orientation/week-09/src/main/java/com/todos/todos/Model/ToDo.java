package com.todos.todos.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ToDo {
    @Id
            @GeneratedValue (strategy = GenerationType.AUTO)
    Long id;

    String title;

    boolean urgent;
    boolean done;
    public ToDo () {
        urgent = false;
        done = false;
    }
    public ToDo (String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isUrgent() {
        return urgent;
    }

    public boolean isDone() {
        return done;
    }
}
