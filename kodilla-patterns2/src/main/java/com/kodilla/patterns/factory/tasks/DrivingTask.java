package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {

    private String taskName;
    private String where;
    private String using;
    boolean execute;

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
        if (execute == true) {
            return true;
        }else {
            return false;
        }
    }
}
