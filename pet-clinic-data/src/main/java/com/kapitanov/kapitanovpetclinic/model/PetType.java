package com.kapitanov.kapitanovpetclinic.model;

import java.util.Set;

public interface PetType {
    Pet findById(Long id);
    Pet save(Owner owner);
    Set<Pet> findAll();
}
