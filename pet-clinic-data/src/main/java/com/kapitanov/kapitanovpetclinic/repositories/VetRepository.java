package com.kapitanov.kapitanovpetclinic.repositories;

import com.kapitanov.kapitanovpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VetRepository extends CrudRepository<Vet, Long> {
}
