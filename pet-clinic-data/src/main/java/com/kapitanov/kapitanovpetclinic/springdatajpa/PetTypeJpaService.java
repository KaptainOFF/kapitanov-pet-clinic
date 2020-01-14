package com.kapitanov.kapitanovpetclinic.springdatajpa;

import com.kapitanov.kapitanovpetclinic.model.PetType;
import com.kapitanov.kapitanovpetclinic.repositories.PetTypeRepositoriy;
import com.kapitanov.kapitanovpetclinic.service.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class PetTypeJpaService implements PetTypeService {

    private final PetTypeRepositoriy petTypeRepositoriy;

    public PetTypeJpaService(PetTypeRepositoriy petTypeRepositoriy) {
        this.petTypeRepositoriy = petTypeRepositoriy;
    }

    @Override
    public Set<PetType> findAll() {
        Set<PetType> petTypes = new HashSet<>();
        petTypeRepositoriy.findAll().forEach(petTypes::add);
        return petTypes;
    }

    @Override
    public PetType findById(Long aLong) {
        return petTypeRepositoriy.findById(aLong).orElse(null);
    }

    @Override
    public PetType save(PetType object) {
        return petTypeRepositoriy.save(object);
    }

    @Override
    public void delete(PetType object) {
        petTypeRepositoriy.delete(object);
    }

    @Override
    public void deleteByID(Long aLong) {
        petTypeRepositoriy.deleteById(aLong);
    }
}
