package com.kodilla.patterns3.observer.homework;

public class FirstTaskChecker implements TaskObserver {

    private String name;

    public FirstTaskChecker(String name) {
        this.name = name;
    }

    @Override
    public void update(CoursantsTasks coursantsTasks, Task task) {
        System.out.println(name +  " New task " +"'" + task.getName() +"'" + " has been added by " + coursantsTasks.getName());
    }
}
