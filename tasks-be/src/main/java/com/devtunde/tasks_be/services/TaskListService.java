package com.devtunde.tasks_be.services;

import java.util.List;

import com.devtunde.tasks_be.domain.entities.TaskList;

public interface TaskListService {

    List<TaskList> listTaskLists();

    TaskList createTaskList(TaskList taskList);
}
