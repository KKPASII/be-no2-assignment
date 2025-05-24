package com.example.todolist.entity;

import com.example.todolist.dto.ScheduleRequestDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Schedule {
    private Long id;

    private String writer;
    private String title;
    private String content;
    private String password;
    private LocalDateTime createdTime;
    private LocalDateTime updatedTime;

    public Schedule(ScheduleRequestDto dto) {
        this.writer = dto.getWriter();
        this.title = dto.getTitle();
        this.content = dto.getContent();
        this.password = dto.getPassword();
        this.createdTime = LocalDateTime.now();
        this.updatedTime = LocalDateTime.now();
    }

    public void update(ScheduleRequestDto dto) {
        this.writer = dto.getWriter();
        this.title = dto.getTitle();
        this.content = dto.getContent();
        this.updatedTime = LocalDateTime.now();
    }

    public boolean checkPassword(String inputPassword) {
        return this.password.equals(inputPassword);
    }

    public void setCreatedTime(LocalDateTime now) {
        this.createdTime = now;
    }

    public void setUpdatedTime(LocalDateTime now) {
        this.updatedTime = now;
    }
}