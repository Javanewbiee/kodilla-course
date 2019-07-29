package com.kodilla.patterns3.observer.homework;

public interface ObservableTasks {

    void addTaskObserver(TaskObserver taskObserver);
    void notifyTaskObserver();
    void removeTaskObserver(TaskObserver taskObserver);
}
