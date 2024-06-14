package com.novi.garage2.Domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
public class Afspraak{

    @Id
    private Long id;
    private LocalDateTime datumTijd;
    private double totale_kosten;

    @ManyToOne
    private Auto auto;

    @ManyToOne
    private Monteur monteur;

    @OneToMany
    private List<Handeling> handelingen;


}