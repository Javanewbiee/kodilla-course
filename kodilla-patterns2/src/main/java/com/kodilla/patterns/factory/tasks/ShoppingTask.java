package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {

    private String taskName;
    private String whatToBuy;
    private double quantity;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public boolean executeTask() {
        boolean execute;
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
        boolean executed;
        if (executeTask() == true) {
            executed = true;
        }else {
            executed = false;
        }return executed;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }
}
