package com.novi.garage2.Domain;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Voorraad{

    @Id
    private Long id;
    @OneToMany
    private List<Onderdeel> onderdelenAanwezig;
}
