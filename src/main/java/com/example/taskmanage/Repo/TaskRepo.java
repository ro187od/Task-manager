package com.example.taskmanage.Repo;

import com.example.taskmanage.model.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepo extends CrudRepository<Task, Long> {

}
