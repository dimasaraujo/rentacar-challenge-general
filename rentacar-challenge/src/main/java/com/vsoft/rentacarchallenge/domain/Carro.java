package com.vsoft.rentacarchallenge.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Carro {

    private Long id;
    private String nome;
    private String placa;
    private boolean ativo;


}
