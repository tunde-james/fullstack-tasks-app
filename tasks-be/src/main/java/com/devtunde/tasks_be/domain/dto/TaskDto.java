package com.devtunde.tasks_be.domain.dto;

import java.time.LocalDateTime;
import java.util.UUID;

import com.devtunde.tasks_be.domain.entities.TaskPriority;
import com.devtunde.tasks_be.domain.entities.TaskStatus;

public record TaskDto(
        UUID id,
        String title,
        String description,
        LocalDateTime dueDate,
        TaskPriority priority,
        TaskStatus status) {
}
