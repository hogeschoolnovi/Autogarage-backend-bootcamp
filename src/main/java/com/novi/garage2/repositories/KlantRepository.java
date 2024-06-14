package com.novi.garage2.repositories;

import com.novi.garage2.Domain.Klant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KlantRepository extends JpaRepository<Klant,Long> {
}
