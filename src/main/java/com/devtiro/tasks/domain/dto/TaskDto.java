package com.devtiro.tasks.domain.dto;

import com.devtiro.tasks.domain.entities.TaskPriority;
import com.devtiro.tasks.domain.entities.TaskStatus;

import java.time.LocalDateTime;
import java.util.UUID;

public record TaskDto(
        // no created, updated, tasklist conference
        // that is handled in rest api later
        // no jpa, since its a dto, just a carrier
        // using record automatically:
        // constructor, getters, equals, toString,immutability (no setters)!
        UUID id,
        String title,
        String description,
        LocalDateTime dueDate,
        TaskPriority priority,
        TaskStatus status
) {

}
