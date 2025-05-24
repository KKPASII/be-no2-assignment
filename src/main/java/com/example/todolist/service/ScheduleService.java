package com.example.todolist.service;

import com.example.todolist.dto.ScheduleRequestDto;
import com.example.todolist.dto.ScheduleResponseDto;

import java.util.List;

public interface ScheduleService {
    ScheduleResponseDto saveSchedule(ScheduleRequestDto scheduleRequestDto);

    List<ScheduleResponseDto> findAllSchedules();

    ScheduleResponseDto findScheduleById(Long id);

    ScheduleResponseDto updateSchedule(Long id, String writer, String title, String content);

    void deleteSchedule(Long id);
}
