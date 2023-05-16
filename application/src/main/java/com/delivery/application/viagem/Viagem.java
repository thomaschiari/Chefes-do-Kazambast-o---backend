package com.delivery.application.viagem;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

// import date
import java.util.Date;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
public class Viagem {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    @NotNull
    @NonNull
    private String origem;

    @Column
    @NotNull
    @NonNull
    private String destino;

    @Column
    @NotNull
    @NonNull
    private Date data;

    @Column
    @NotNull
    @NonNull
    private Double valor;

    @Column
    @NotNull
    @NonNull
    private Double distancia;

    @Column
    @NotNull
    @NonNull
    private Integer tempo;
    
    // default status = 0 (not confirmed)
    @Column
    private Integer status = 0;

    @Column
    private Integer idMotorista;

    @Column
    private String identifier;

    @Column
    @NotNull
    @NonNull
    private List<String> itens;
}
