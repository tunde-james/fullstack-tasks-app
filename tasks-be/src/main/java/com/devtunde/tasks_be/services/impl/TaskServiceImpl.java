package com.devtunde.tasks_be.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.devtunde.tasks_be.domain.entities.Task;
import com.devtunde.tasks_be.repositories.TaskRepository;
import com.devtunde.tasks_be.services.TaskService;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
    
    @Override
    public List<Task> listTasks(UUID taskListId) {
        return taskRepository.findByTaskListId(taskListId);
    }
}
