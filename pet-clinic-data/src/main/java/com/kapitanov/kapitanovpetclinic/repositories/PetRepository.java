package com.kapitanov.kapitanovpetclinic.repositories;

import com.kapitanov.kapitanovpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends CrudRepository<Pet, Long> {
}
