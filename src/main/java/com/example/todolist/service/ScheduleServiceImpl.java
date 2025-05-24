package com.example.todolist.service;

import com.example.todolist.dto.ScheduleRequestDto;
import com.example.todolist.dto.ScheduleResponseDto;
import com.example.todolist.entity.Schedule;
import com.example.todolist.repository.ScehduleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class ScheduleServiceImpl implements ScheduleService {
    private final ScehduleRepository scheduleRepository;
    private final JdbcTemplate jdbcTemplate;

    public ScheduleServiceImpl(ScehduleRepository scehduleRepository, JdbcTemplate jdbcTemplate) {
        this.scheduleRepository = scehduleRepository;
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public ScheduleResponseDto saveSchedule(ScheduleRequestDto dto) {
        Schedule schedule = new Schedule(dto);
        return scheduleRepository.saveSchedule(schedule);
    }

    @Override
    public ScheduleResponseDto findScheduleById(Long id) {
        Optional<Schedule> optionalSchedule = scheduleRepository.findScheduleById(id);

        if (optionalSchedule.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Does not exist id = " + id);
        }
        return new ScheduleResponseDto(optionalSchedule.get());
    }

    @Override
    public List<ScheduleResponseDto> findAllSchedules() {
        List<ScheduleResponseDto> allSchedules = scheduleRepository.findAllSchedules();
        return allSchedules;
    }

    @Transactional
    @Override
    public ScheduleResponseDto updateSchedule(Long id, String writer, String title, String content) {
        if (writer == null || title == null || content == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "writer, title, content are required values");
        }

        int updatedRow = scheduleRepository.updateSchedule(id, writer, title, content);

        if (updatedRow == 0) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No data has been modified.");
        }

        Optional<Schedule> optionalSchedule = scheduleRepository.findScheduleById(id);

        return new ScheduleResponseDto(optionalSchedule.get());
    }

    @Override
    public void deleteSchedule(Long id) {
        int deletedRow = scheduleRepository.deleteSchedule(id);

        if (deletedRow == 0) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No data has been deleted.");
        }
    }
}
