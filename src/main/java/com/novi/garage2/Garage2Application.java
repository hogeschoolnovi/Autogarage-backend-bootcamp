package com.novi.garage2;

import com.novi.garage2.Domain.Afspraak;
import com.novi.garage2.Domain.Auto;
import com.novi.garage2.Domain.Gebruiker;
import com.novi.garage2.Domain.Klant;
import com.novi.garage2.Domain.enumerations.RolEnum;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Garage2Application {

	public static Gebruiker ingelogdeGebruiker = new Gebruiker();
	public static Auto alleAutos = new Auto();
	public static Afspraak alleAfspraken = new Afspraak();
	public static void main(String[] args) {
		SpringApplication.run(Garage2Application.class, args);
	}
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		ingelogdeGebruiker.setRollen(RolEnum.USER);
		return "rol gebruiker op user";

	}
}
