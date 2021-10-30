package com.BusinessGroupAPI.IndividualProjet.service;

import com.BusinessGroupAPI.IndividualProjet.controller.request.WorkRQ;
import com.BusinessGroupAPI.IndividualProjet.model.Work;
import com.BusinessGroupAPI.IndividualProjet.repository.WorkRepository;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class WorkService {

    private final WorkRepository workRepository;

    public WorkService(WorkRepository workRepository) {
        this.workRepository = workRepository;
    }

    public Work createWork(WorkRQ workRQ) {
        int year = workRQ.getScheduleYear2021to3000();
        int month = workRQ.getScheduleMonth1to12();
        int day = workRQ.getScheduleDay1to31();
        int hour = workRQ.getScheduleHour0to23();
        LocalDateTime workDay = LocalDateTime.of(year, month, day, hour,00,00);
        Work newWork = Work
                .builder()
                .localDateTime(workDay)
                .build();
        return workRepository.save(newWork);
    }

    public Work updateWorkById(Long workId, WorkRQ workRQ) throws ResourceNotFound {
        int year = workRQ.getScheduleYear2021to3000();
        int month = workRQ.getScheduleMonth1to12();
        int day = workRQ.getScheduleDay1to31();
        int hour = workRQ.getScheduleHour0to23();
        LocalDateTime workDay = LocalDateTime.of(year, month, day, hour,00,00);
        if(!workRepository.existsById(workId)){
            throw new ResourceNotFound("You need to add an existing Work ID");
        }
        Work workToBeUpdated = workRepository.findById(workId).get();
        workToBeUpdated.setLocalDateTime(workDay);
        return workRepository.save(workToBeUpdated);
    }

    public void deleteById(Long id) throws ResourceNotFound {
        if (!workRepository.existsById(id)) {
            throw new ResourceNotFound("You need to add an existing Game");
        }
        workRepository.deleteById(id);
    }

    public List<Work> findAll() {
        return workRepository.findAll();
    }

    public Work findById(Long id) {
        return workRepository.findById(id).get();
    }

}