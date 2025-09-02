package com.devtunde.tasks_be.mappers.impl;

import org.springframework.stereotype.Component;

import com.devtunde.tasks_be.domain.dto.TaskDto;
import com.devtunde.tasks_be.domain.entities.Task;
import com.devtunde.tasks_be.mappers.TaskMapper;

@Component
public class TaskMapperImpl implements TaskMapper {

    @Override
    public Task fromDto(TaskDto taskDto) {
        return new Task(
                taskDto.id(),
                taskDto.title(),
                taskDto.description(),
                taskDto.dueDate(),
                taskDto.status(),
                taskDto.priority(),
                null,
                null,
                null);
    }

    @Override
    public TaskDto toDto(Task task) {
        return new TaskDto(
                task.getId(),
                task.getTitle(),
                task.getDescription(),
                task.getDueDate(),
                task.getPriority(),
                task.getStatus());
    }

}
