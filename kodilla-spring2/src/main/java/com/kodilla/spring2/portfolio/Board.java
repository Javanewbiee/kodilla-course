package com.kodilla.spring2.portfolio;

public class Board {

    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;
    private Task task;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }
    public void addTask(Task task) {
        if (task.getStageOfTask() == "TODO") {
            getToDoList().getTasks().add(task.getTask());
        } else if (task.getStageOfTask() == "INPROGRESS") {
            getInProgressList().getTasks().add(task.getTask());
        } else {
            getDoneList().getTasks().add(task.getTask());
        }
    }
}
