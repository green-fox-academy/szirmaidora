package com.todoapp.todoapp.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ToDo {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    private boolean urgent;
    private boolean done;
    public ToDo () {
        urgent = false;
        done = false;
    }
    public ToDo (String title) {
        this.title = title;
    }

    public void setUrgent(boolean urgent) {
        this.urgent = urgent;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean getUrgent() {
        return urgent;
    }

    public boolean getDone() {
        return done;
    }
}
