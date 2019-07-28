package com.kodilla.patterns3.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class CoursantsTasks implements ObservableTasks {

    private TaskObserver taskObserver;
    private String name;
    private List<Task>tasks = new ArrayList<>();
    private Task tempTask;

    public CoursantsTasks(String name) {
        this.name = name;
    }

    public void addTask(Task task) {
        tasks.add(task);
        tempTask = task;
        notifyTaskObserver();
    }

    @Override
    public void addTaskObserver(TaskObserver taskObserverNew) {
        taskObserver = taskObserverNew;
    }

    @Override
    public void notifyTaskObserver() {
        taskObserver.update(this,tempTask);
    }

    @Override
    public void removeTaskObserver() {

    }

    public List<Task> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }
}
