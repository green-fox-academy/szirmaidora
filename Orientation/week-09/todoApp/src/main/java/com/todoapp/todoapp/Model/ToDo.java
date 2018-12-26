package com.todoapp.todoapp.Model;

import javax.persistence.*;

@Entity
public class ToDo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String description;
    private String title;
    private String content;

    private boolean urgent;
    private boolean done;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Assignee assignee;

    public ToDo() {
        urgent = false;
        done = false;
    }

    public ToDo(String title) {

    }

    public ToDo(String title, String content, String description) {
        this.title = title;
        this.content = content;
        this.description = description;
    }

    public void setUrgent(boolean urgent) {
        this.urgent = urgent;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Assignee getAssignee() {
        return assignee;
    }

    public void setAssignee(Assignee assignee) {
        this.assignee = assignee;
    }

}
