package com.BusinessGroupAPI.IndividualProjet.controller.request;

import com.BusinessGroupAPI.IndividualProjet.model.TeamType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TeamRQ {
    private TeamType teamType;
    private String teamName;
}

