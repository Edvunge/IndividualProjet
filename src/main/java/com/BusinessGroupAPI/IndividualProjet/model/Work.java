package com.BusinessGroupAPI.IndividualProjet.model;

import lombok.*;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "Work")
@Entity
public class Work {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDateTime localDateTime;
    @ManyToMany(mappedBy = "workWorked")
    Set<Funcionary> funcionaries;
}
