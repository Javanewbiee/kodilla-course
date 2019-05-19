package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {

    private String taskName;
    private String color;
    private String whatToPaint;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public boolean isTaskExecuted() {
        boolean executed;
        if (executeTask() == true) {
            executed = true;
        }else {
            executed = false;
        }return executed;
    }

    @Override
    public boolean executeTask() {
        boolean execute;
        if (this.taskName != null && this.color != null && this.whatToPaint != null) {
            System.out.println("Task is beeing executed");
            execute = true;
        }else {
            System.out.println("Task cannot be executed");
            execute = false;
        }return execute;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }
}
