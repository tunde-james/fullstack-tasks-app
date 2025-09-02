package com.devtunde.tasks_be.mappers;

import com.devtunde.tasks_be.domain.dto.TaskDto;
import com.devtunde.tasks_be.domain.entities.Task;

public interface TaskMapper {

    Task fromDto(TaskDto taskDto);

    TaskDto toDto(Task task);
}
