package com.kapitanov.kapitanovpetclinic.repositories;

import com.kapitanov.kapitanovpetclinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
