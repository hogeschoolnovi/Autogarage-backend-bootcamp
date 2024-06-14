package com.novi.garage2.controllers;

import com.novi.garage2.Domain.Auto;
import com.novi.garage2.Garage2Application;
import com.novi.garage2.repositories.AutoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("api/auto")
public class AutoController {
    final AutoRepository AutoRepository;

    public AutoController(AutoRepository AutoRepository) {
        this.AutoRepository = AutoRepository;
    }

    @GetMapping
    public String getAuto(){

        return Garage2Application.alleAutos.getKenteken();
    }

}
