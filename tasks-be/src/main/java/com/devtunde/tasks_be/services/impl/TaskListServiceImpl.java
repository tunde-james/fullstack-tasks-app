package com.devtunde.tasks_be.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.devtunde.tasks_be.domain.entities.TaskList;
import com.devtunde.tasks_be.repositories.TaskListRepository;
import com.devtunde.tasks_be.services.TaskListService;

@Service
public class TaskListServiceImpl implements TaskListService {

    private final TaskListRepository taskListRepository;

    public TaskListServiceImpl(TaskListRepository taskListRepository) {
        this.taskListRepository = taskListRepository;
    }

    @Override
    public List<TaskList> listTaskLists() {
        return taskListRepository.findAll();
    }
}
