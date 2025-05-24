package com.example.todolist.dto;

import com.example.todolist.entity.Schedule;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ScheduleRequestDto {
    private String writer;
    private String title;
    private String content;
    private String password;


    public ScheduleRequestDto(Schedule schedule) {
        this.writer = schedule.getWriter();
        this.title = schedule.getTitle();
        this.content = schedule.getContent();
        this.password = schedule.getPassword();
    }
}