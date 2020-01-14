package com.kapitanov.kapitanovpetclinic.repositories;

import com.kapitanov.kapitanovpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetTypeRepositoriy extends CrudRepository<PetType, Long> {
}
