package com.example.taskmanage;

import com.example.taskmanage.model.Task;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskTest {

    @Test
    public void createTaskTest(){
        String text = "To do plan";
        Task task = new Task(text);
        assertEquals(text, task.getDescription());
    }

}
