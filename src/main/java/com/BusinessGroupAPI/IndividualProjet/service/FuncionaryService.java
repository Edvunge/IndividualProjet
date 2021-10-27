package com.BusinessGroupAPI.IndividualProjet.service;

import com.BusinessGroupAPI.IndividualProjet.controller.request.FuncionaryRQ;
import com.BusinessGroupAPI.IndividualProjet.model.Funcionary;
import com.fasterxml.jackson.annotation.JacksonInject;

import java.util.List;

public class FuncionaryService {
    public List<Funcionary> findAll() {
        return null;
    }

    public Funcionary findById(Long id) {
        return null;
    }

    public Object deleteById(Long funcionaryId) {
        return null;
    }

    public JacksonInject.Value updatePlayerById(Long id, FuncionaryRQ funcionaryRQ, Long teamId) {
        return null;
    }

    public JacksonInject.Value createFuncionary(FuncionaryRQ funcionaryRQ, Long teamId) {
        return null;
    }
}
