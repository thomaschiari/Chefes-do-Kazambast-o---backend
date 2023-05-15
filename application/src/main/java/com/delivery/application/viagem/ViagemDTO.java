package com.delivery.application.viagem;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.Date;

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
    private String identifier;
}