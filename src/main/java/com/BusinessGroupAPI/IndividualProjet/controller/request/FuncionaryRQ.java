package com.BusinessGroupAPI.IndividualProjet.controller.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FuncionaryRQ {
    private String name;
    private int age;
    private Long height;
    private Long weight;
}
