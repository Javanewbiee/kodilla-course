package com.kodilla.patterns3.observer.homework;

public class SecondTaskChecker implements TaskObserver {
    private String name;

    public SecondTaskChecker(String name) {
        this.name = name;
    }

    @Override
    public void update(CoursantsTasks coursantsTasks, Task task) {
        System.out.println(name + " New task " +"'" + task.getName() +"'" + " has been added by " + coursantsTasks.getName());
    }
}
