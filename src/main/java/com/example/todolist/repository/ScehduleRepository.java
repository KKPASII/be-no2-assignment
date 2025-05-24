package com.example.todolist.repository;

import com.example.todolist.dto.ScheduleResponseDto;
import com.example.todolist.entity.Schedule;

import java.util.List;
import java.util.Optional;

public interface ScehduleRepository {
    ScheduleResponseDto saveSchedule(Schedule schedule);

    List<ScheduleResponseDto> findAllSchedules();

    Optional<Schedule> findScheduleById(Long id);

    Schedule findScheduleByIdOrElseThrow(Long id);

    int updateSchedule(Long id, String writer, String title, String content);

    int deleteSchedule(Long id);
}
