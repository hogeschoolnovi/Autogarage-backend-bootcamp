package com.novi.garage2.Domain;

import com.novi.garage2.Domain.enumerations.RolEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
public class Gebruiker{

    @Id
    private Long id;

    private String gebruikersnaam;

    private String wachtwoord;

    private RolEnum rollen;
}