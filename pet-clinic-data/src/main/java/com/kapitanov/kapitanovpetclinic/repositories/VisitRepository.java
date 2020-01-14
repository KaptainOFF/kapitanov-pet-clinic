package com.kapitanov.kapitanovpetclinic.repositories;

import com.kapitanov.kapitanovpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitRepository extends CrudRepository<Visit, Long> {
}
