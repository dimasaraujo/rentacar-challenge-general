package com.vsoft.rentacarchallenge.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @OneToOne
    private Carro carro;

    @OneToOne
    private Vaga vaga;

    private LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;
}
