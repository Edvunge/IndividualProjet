package com.BusinessGroupAPI.IndividualProjet.service;

import com.BusinessGroupAPI.IndividualProjet.controller.request.FuncionaryRQ;
import com.BusinessGroupAPI.IndividualProjet.model.Funcionary;
import com.fasterxml.jackson.annotation.JacksonInject;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FuncionaryService {
    public List<Funcionary> findAll() {
        return null;
    }

    public Funcionary findById(Long id) {
        return null;
    }

    public void deleteById(Long funcionaryId) {
    }

    public Funcionary updatePlayerById(Long id, FuncionaryRQ funcionaryRQ, Long teamId) {
        return null;
    }

    public Funcionary createFuncionary(FuncionaryRQ funcionaryRQ, Long teamId) {
        return null;
    }
}
