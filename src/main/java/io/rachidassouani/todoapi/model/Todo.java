package io.rachidassouani.todoapi.model;

import java.util.Date;

public class Todo {
    private Long id;
    private String description;
    private String username;
    private Date targetDate;
    private boolean completed;

    public Todo() {
    }

    public Todo(Long id, String description, String username, Date targetDate, boolean completed) {
        this.id = id;
        this.description = description;
        this.username = username;
        this.targetDate = targetDate;
        this.completed = completed;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
