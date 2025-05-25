package com.example.todolist.dto;

import com.example.todolist.entity.Schedule;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ScheduleResponseDto {
    private Long id;
    private String writer;
    private String title;
    private String content;
    private LocalDateTime createdTime;
    private LocalDateTime updatedTime;

    public ScheduleResponseDto(Schedule schedule) {
        this.id = schedule.getId();
        this.writer = schedule.getWriter();
        this.title = schedule.getTitle();
        this.content = schedule.getContent();
        this.createdTime = schedule.getCreatedTime();
        this.updatedTime = schedule.getUpdatedTime();
    }

    public ScheduleResponseDto(long id, String writer, String title, String content, String password, LocalDateTime createdTime, LocalDateTime updatedTime) {
            this.id = id;
            this.writer = writer;
            this.title = title;
            this.content = content;
            this.createdTime = createdTime;
            this.updatedTime = updatedTime;
    }
}