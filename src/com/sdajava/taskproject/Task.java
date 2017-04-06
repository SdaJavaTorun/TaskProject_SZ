package com.sdajava.taskproject;



/**
 * Created by RENT on 2017-04-06.
 */
public class Task {

    private String id;
    private String title;
    private TaskType type;

    public Task(String id, String title, TaskType type) {
        this.id = id;
        this.title = title;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public TaskType getType() {
        return type;
    }

    public void setType(TaskType type) {
        this.type = type;
    }

}
