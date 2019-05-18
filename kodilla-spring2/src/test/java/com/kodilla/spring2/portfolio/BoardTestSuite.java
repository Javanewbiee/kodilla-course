package com.kodilla.spring2.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testTaskAdd(){
        //Given
        Task taskToDo = new Task("This has to be done!","TODO");
        Task taskInProgress = new Task("This is still in progress","INPROGRESS");
        Task taskDone = new Task("This one is finally done!","DONE");
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring2");
        Board context1= context.getBean(Board.class);
        //When
        context1.addTask(taskDone);
        context1.addTask(taskInProgress);
        context1.addTask(taskToDo);
        //Then
        System.out.println(context1.getToDoList().getTasks().get(0));
        System.out.println(context1.getDoneList().getTasks().get(0));
        System.out.println(context1.getInProgressList().getTasks().get(0));
        System.out.println("List to do " + context1.getToDoList());
        System.out.println("List in progress " + context1.getInProgressList());
        System.out.println("Done list " + context1.getDoneList());
    }
}
