package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    @Test
    public void testTaskListDao() {
        //When
        TaskList taskList = new TaskList("New TaskList", "New!");
        //Then
        taskListDao.save(taskList);
        //Then
        String takenOut = taskList.getListName();
        int id = taskList.getId();
        List<TaskList> result = taskListDao.findByListName(takenOut);
        Assert.assertEquals(1, result.size());
        //CleanUp
        taskListDao.deleteById(id);

    }
}
