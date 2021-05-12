package com.example.taskmanage.controller;

import com.example.taskmanage.Repo.TaskRepo;
import com.example.taskmanage.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class TaskContreoller {
    @Autowired
    private TaskRepo taskRepo;

    @GetMapping
    public String list(Map<String, Object> model){
        Iterable<Task> tasks = taskRepo.findAll();
        model.put("messages", tasks);
        return "listTasks";
    }

    @PostMapping
    public String createTask(@RequestParam String text, Map<String, Object> model){
        Task task = new Task(text);
        taskRepo.save(task);
        Iterable<Task> tasks = taskRepo.findAll();
        model.put("tasks", tasks);
        return "listTasks";
    }
}
