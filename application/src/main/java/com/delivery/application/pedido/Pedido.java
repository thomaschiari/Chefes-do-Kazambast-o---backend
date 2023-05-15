package com.delivery.application.pedido;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pedido {
    private String nomeAlimento;
    private int quantidade;
    private double preco;
    @ManyToOne
    private Viagem viagem;
}
