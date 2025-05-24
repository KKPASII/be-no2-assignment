package com.example.todolist.dto;

import com.example.todolist.entity.Schedule;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ScheduleResponseDto {
    private Long id;
    private String writer;
    private String title;
    private String content;

    public ScheduleResponseDto(Schedule schedule) {
        this.id = schedule.getId();
        this.writer = schedule.getWriter();
        this.title = schedule.getTitle();
        this.content = schedule.getContent();
    }
}