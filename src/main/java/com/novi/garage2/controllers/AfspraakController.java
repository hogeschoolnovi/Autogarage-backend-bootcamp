package com.novi.garage2.controllers;

import com.novi.garage2.Domain.Afspraak;
import com.novi.garage2.Garage2Application;
import com.novi.garage2.repositories.AfspraakRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;
@RestController
@RequestMapping ("api/afspraak")

public class AfspraakController {

    final AfspraakRepository Afspraakrepository;

    public AfspraakController(AfspraakRepository Afspraakrepository) {
        this.Afspraakrepository = Afspraakrepository;
    }

    @GetMapping
    public String getAfspraak(){

        return Garage2Application.alleAfspraken.getId().toString();
    }

}
