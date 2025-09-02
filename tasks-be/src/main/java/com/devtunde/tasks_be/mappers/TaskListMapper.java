package com.devtunde.tasks_be.mappers;

import com.devtunde.tasks_be.domain.dto.TaskListDto;
import com.devtunde.tasks_be.domain.entities.TaskList;

public interface TaskListMapper {
    
    TaskList fromDto(TaskListDto taskListDto);

    TaskListDto toDto(TaskList taskList);
}
