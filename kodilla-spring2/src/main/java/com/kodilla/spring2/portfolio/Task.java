package com.kodilla.spring2.portfolio;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
    public Board addTask() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring2");
        Board board = context.getBean(Board.class);
        if (getStageOfTask() == "TODO") {
            board.getToDoList().getTasks().add(getTask());
        } else if (getStageOfTask() == "INPROGRESS") {
            board.getInProgressList().getTasks().add(getTask());
        } else {
            board.getDoneList().getTasks().add(getTask());
        }
        return board;
    }
}
