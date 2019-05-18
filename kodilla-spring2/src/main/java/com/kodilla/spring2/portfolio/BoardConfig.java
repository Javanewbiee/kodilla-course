package com.kodilla.spring2.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Bean
    public TaskList taskListToDo() {
        return new TaskList();
    }

    @Bean
    public TaskList taskListInProgress() {
        return new TaskList();
    }
    @Bean
    public TaskList taskListDone() {
        return new TaskList();
    }
    @Bean
    public Board board() {
        return new Board(taskListToDo(),taskListInProgress(),taskListDone());
    }
}
