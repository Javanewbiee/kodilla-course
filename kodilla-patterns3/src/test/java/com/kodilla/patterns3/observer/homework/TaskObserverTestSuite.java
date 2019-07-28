package com.kodilla.patterns3.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class TaskObserverTestSuite {

    @Test
    public void testAddTask() {
        //Given
        Task task = new Task("Collections");
        Task task1 = new Task("Stream");
        Task task2 = new Task("Hibernate");
        Task task3 = new Task("MySQL");
        Task task4 = new Task("Spring");
        CoursantsTasks johnTasks = new CoursantsTasks("Jhon tasks");
        CoursantsTasks ameliaTasks = new CoursantsTasks("Amelia tasks");
        CoursantsTasks michaelTasks = new CoursantsTasks("Michael tasks");
        TaskObserver taskCheckerOne = new FirstTaskChecker("Adam");
        TaskObserver taskCheckerTwo = new SecondTaskChecker("Natalia");
        johnTasks.addTaskObserver(taskCheckerOne);
        ameliaTasks.addTaskObserver(taskCheckerTwo);
        michaelTasks.addTaskObserver(taskCheckerTwo);
        //When
        johnTasks.addTask(task);
        ameliaTasks.addTask(task1);
        michaelTasks.addTask(task2);
        ameliaTasks.addTask(task3);
        michaelTasks.addTask(task4);
        //Then
        Assert.assertEquals(1,johnTasks.getTasks().size());
        Assert.assertEquals(2,ameliaTasks.getTasks().size());
        Assert.assertEquals(2,michaelTasks.getTasks().size());
    }
}
