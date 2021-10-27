package com.BusinessGroupAPI.IndividualProjet.controller;

import com.BusinessGroupAPI.IndividualProjet.controller.request.FuncionaryRQ;
import com.BusinessGroupAPI.IndividualProjet.model.Funcionary;
import com.BusinessGroupAPI.IndividualProjet.service.FuncionaryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

public class FuncionaryController {


    FuncionaryService funcionaryService;

    public FuncionaryController(FuncionaryService funcionaryService) {
        this.funcionaryService = funcionaryService;
    }

    @GetMapping("/players")
    public List<Funcionary> getPlayers() {return funcionaryService.findAll();}

    @GetMapping("/players/{id}")
    public Funcionary getFuncionaryById(@PathVariable(value = "funcionaryName") Long id) {return funcionaryService.findById(id);}

    //Create
    @PostMapping(value ="/funcionary", consumes = "application/json", produces = "application/json")
    public ResponseEntity createFuncionary(@RequestBody FuncionaryRQ funcionaryRQ, @RequestParam Long teamId){
        Long playerId = (Long) funcionaryService.createFuncionary(funcionaryRQ, teamId).getId();
        String funcionaryId = null;
        return ResponseEntity.created(URI.create("/funcionary/" + funcionaryId )).body("funcionary Created");
    }

    //Update
    @PutMapping(value ="/funcionary/{id}", consumes = "application/json", produces = "application/json")
    public ResponseEntity updatePlayerByID(@RequestParam Long id, @RequestBody FuncionaryRQ funcionaryRQ,  @RequestParam Long teamId){
        Long funcinaryId = (Long) funcionaryService.updatePlayerById(id, funcionaryRQ, teamId).getId();
        return ResponseEntity.created(URI.create("/funcionary/" + funcinaryId)).body("funcionary Updated");
    }

    @DeleteMapping(path = "/delete-funcionary/{id}")
    public ResponseEntity deleteFuncionary(@PathVariable(value = "id") Long funcionaryId) {
        funcionaryService.deleteById(funcionaryId);
        return ResponseEntity.created(URI.create("/funcionary" + funcionaryId)).body("funcionary was deleted");
    }

}

