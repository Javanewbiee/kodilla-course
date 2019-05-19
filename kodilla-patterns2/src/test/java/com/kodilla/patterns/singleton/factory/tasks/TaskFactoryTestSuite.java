package com.kodilla.patterns.singleton.factory.tasks;

import com.kodilla.patterns.factory.tasks.Task;
import com.kodilla.patterns.factory.tasks.TaskFactory;
import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task task = taskFactory.makeTask(taskFactory.drivingTask);
        //Then
        Assert.assertEquals(true, task.executeTask());
        Assert.assertEquals(true, task.isTaskExecuted());
        Assert.assertEquals("Close Drive", task.getTaskName());
    }
    @Test
    public void testShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task task = taskFactory.makeTask(taskFactory.shoppingTask);
        //Then
        Assert.assertEquals(true, task.executeTask());
        Assert.assertEquals(true, task.isTaskExecuted());
        Assert.assertEquals("Small shopping", task.getTaskName());
    }
    @Test
    public void testPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task task = taskFactory.makeTask(taskFactory.paintingTask);
        //Then
        Assert.assertEquals(true, task.executeTask());
        Assert.assertEquals(true, task.isTaskExecuted());
        Assert.assertEquals("First Painting", task.getTaskName());
    }
}
