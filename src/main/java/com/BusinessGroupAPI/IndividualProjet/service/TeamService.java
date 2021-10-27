package com.BusinessGroupAPI.IndividualProjet.service;

import com.BusinessGroupAPI.IndividualProjet.controller.request.TeamRQ;
import com.BusinessGroupAPI.IndividualProjet.model.Team;
import com.fasterxml.jackson.annotation.JacksonInject;

import java.util.List;

public class TeamService {
    public List<Team> findAll() {
        return null;
    }

    public Team findById(Long id) {
        return null;
    }

    public JacksonInject.Value createTeam(TeamRQ teamRQ) {
        return null;
    }

    public JacksonInject.Value updateTeamById(Long id, TeamRQ teamRQ) {
        return null;
    }

    public void deleteById(Long teamId) {

    }
}
