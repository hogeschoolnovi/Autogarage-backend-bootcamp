package com.novi.garage2.controllers;

import com.novi.garage2.Domain.Klant;
import com.novi.garage2.Garage2Application;
import com.novi.garage2.repositories.KlantRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("api/klant")
public class KlantController {

    final KlantRepository klantRepository;

    public KlantController(KlantRepository klantRepository) {
        this.klantRepository = klantRepository;
    }

    @GetMapping
    //Haalt  klantgegevens op
    public String getKlant(){

        return Garage2Application.ingelogdeGebruiker.getRollen().toString();
    }


    @PostMapping
    //Maakt nieuwe klant aan
    private ResponseEntity<?> postKlant(@RequestBody Klant klant){
        if(!Objects.equals(klant.getNaam(), "")){
            Klant newKlant = new Klant();
            newKlant.setNaam(klant.getNaam());
            postKlant(newKlant);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.badRequest().build();
    }
}
