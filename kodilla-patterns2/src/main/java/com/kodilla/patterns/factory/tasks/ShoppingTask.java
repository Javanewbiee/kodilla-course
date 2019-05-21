package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {

    private String taskName;
    private String whatToBuy;
    private double quantity;
    boolean execute;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public boolean executeTask() {
        if (this.quantity != 0 && this.taskName != null && this.whatToBuy != null) {
            System.out.println("Task is beeing executed");
            execute = true;
        }else {
            System.out.println("Task cannot be executed");
            execute = false;
        } return execute;
    }

    @Override
    public boolean isTaskExecuted() {
        if (execute == true) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String getTaskName() {
        return taskName;
    }
}
