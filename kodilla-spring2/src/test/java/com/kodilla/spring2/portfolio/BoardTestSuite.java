package com.kodilla.spring2.portfolio;

import org.junit.Test;

public class BoardTestSuite {

    @Test
    public void testTaskAdd(){
        //Given
        Task taskToDo = new Task("This has to be done!","TODO");
        Task taskInProgress = new Task("This is still in progress","INPROGRESS");
        Task taskDone = new Task("This one is finally done!","DONE");
        //When
        Board board = taskDone.addTask();
        Board board1 = taskInProgress.addTask();
        Board board2 = taskToDo.addTask();
        //Then
        System.out.println(board2.getToDoList().getTasks().get(0));
        System.out.println(board.getDoneList().getTasks().get(0));
        System.out.println(board1.getInProgressList().getTasks().get(0));
        System.out.println("List to do " + board2.getToDoList());
        System.out.println("List in progress " + board1.getInProgressList());
        System.out.println("Done list " + board.getDoneList());
    }
}
