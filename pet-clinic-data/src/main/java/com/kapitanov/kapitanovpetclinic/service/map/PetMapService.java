package com.kapitanov.kapitanovpetclinic.service.map;

import com.kapitanov.kapitanovpetclinic.model.Pet;
import com.kapitanov.kapitanovpetclinic.service.CrudService;

import java.util.Set;

public class PetMapService extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet save(Pet pet) {
        return super.save(pet.getId(), pet);
    }

    @Override
    public void delete(Pet object) {

    }

    @Override
    public void deleteByID(Long aLong) {

    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
