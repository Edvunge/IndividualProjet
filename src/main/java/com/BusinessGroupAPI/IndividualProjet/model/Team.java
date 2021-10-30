package com.BusinessGroupAPI.IndividualProjet.model;

import lombok.*;
import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "TEAM",indexes = @Index(columnList = "teamName"))
@Entity
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Enumerated
    private TeamType teamType;
    private String teamName;
    @OneToMany(mappedBy = "team")
    private List<Funcionary> funcionaries;

}
