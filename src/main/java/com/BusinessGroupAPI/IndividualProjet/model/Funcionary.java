package com.BusinessGroupAPI.IndividualProjet.model;

import lombok.*;
import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "FUNCIONARY")
@Entity
public class Funcionary {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private int age;
    private Long height;
    private Long weight;

    @ManyToOne
    @JoinColumn(name = "team_id", nullable = false)
    private Team team;
    @ManyToMany
    @JoinTable(
            name = "work_worked",
            joinColumns = @JoinColumn(name = "funcionary_id"),
            inverseJoinColumns = @JoinColumn(name = "work_id"))
    Set<Work> workWorked;
}