package com.BusinessGroupAPI.IndividualProjet.controller;

import com.BusinessGroupAPI.IndividualProjet.controller.request.WorkRQ;
import com.BusinessGroupAPI.IndividualProjet.model.Work;
import com.BusinessGroupAPI.IndividualProjet.service.ResourceNotFound;
import com.BusinessGroupAPI.IndividualProjet.service.WorkService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
public class WorkController {

    WorkService workService;

    public WorkController(WorkService workService) {
        this.workService = workService;
    }

    @GetMapping("/works")
    public List<Work> getWork(){
        return workService.findAll();
    }

    @GetMapping("/works/{id}")
    public Work getWorkById(@PathVariable(value = "id") Long id) {
        return workService.findById(id);
    }

    //Create
    @PostMapping(value ="/work", consumes = "application/json", produces = "application/json")
    public ResponseEntity createWork(@RequestBody WorkRQ workRQ){
        String workDay = workService.createWork(workRQ).getLocalDateTime().toString();
        return ResponseEntity.created(URI.create("/work/" + workDay )).body("Work Created");
    }

    //Update
    @PutMapping(value ="/work/{id}", consumes = "application/json", produces = "application/json")
    public ResponseEntity updateWorkByID(@RequestParam Long id, @RequestBody WorkRQ workRQ) throws ResourceNotFound {
        workService.updateWorkById(id, workRQ);
        return ResponseEntity.created(URI.create("/work/" + id)).body("Date Updated");
    }

    @DeleteMapping(path = "/delete-game/{id}")
    public ResponseEntity deleteWork(@PathVariable(value = "id") Long workId) throws ResourceNotFound {
        workService.deleteById(workId);
        return ResponseEntity.created(URI.create("/work")).body("work was deleted");
    }

}
