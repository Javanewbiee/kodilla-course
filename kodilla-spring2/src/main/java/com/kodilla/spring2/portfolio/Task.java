package com.kodilla.spring2.portfolio;

public class Task {

    private String task;
    private String stageOfTask;

    public Task(String task, String stageOfTask) {
        this.task = task;
        this.stageOfTask = stageOfTask;
    }

    public String getTask() {
        return task;
    }

    public String getStageOfTask() {
        return stageOfTask;
    }

}
