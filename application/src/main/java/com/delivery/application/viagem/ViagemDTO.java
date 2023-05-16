package com.delivery.application.viagem;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.Date;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ViagemDTO {

    private Integer id;
    private String origem;
    private String destino;
    private Date data;
    private Double valor;
    private Double distancia;
    private Integer tempo;
    private Integer status;
    private Integer idMotorista;
    private List<String> itens;
    private String identifier;
}