package com.todos.todos;

import java.util.Date;

public class Task {

    // Déclaration d'attributs
    private String name;
    private Date dueDate;
    private Boolean completed;

    // Constructeur par défaut
    public Task(String name, Boolean completed, Date dueDate){

        this.name = name;
        this.dueDate = dueDate;
        this.completed = completed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
}
