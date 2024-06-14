package com.novi.garage2.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Table(name = "keuring")
public class Keuring extends Afspraak {

    @Id
    private Long id;
    private double kosten;

}
