package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {

    private String taskName;
    private String where;
    private String using;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean executeTask() {
        boolean execute;
        if (this.where != null && this.using != null && this.taskName != null) {
            System.out.println("Task is beeing executed");
            execute = true;
        }else {
            System.out.println("Task cannot be executed");
            execute = false;
        }
        return execute;
    }

    @Override
    public boolean isTaskExecuted() {
        boolean executed;
        if (executeTask() == true) {
            executed = true;
        }else {
            executed = false;
        } return executed;
    }
}
