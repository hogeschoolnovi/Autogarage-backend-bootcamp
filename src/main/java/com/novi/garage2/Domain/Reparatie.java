package com.novi.garage2.Domain;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Reparatie extends Afspraak{
    @Id
    private Long id;

    private double kosten;



}
