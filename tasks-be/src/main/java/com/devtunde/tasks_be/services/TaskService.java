package com.devtunde.tasks_be.services;

import java.util.List;
import java.util.UUID;

import com.devtunde.tasks_be.domain.entities.Task;

public interface TaskService {
    List<Task> listTasks(UUID taskListId);
}
