package com.kapitanov.kapitanovpetclinic.service.map;

import com.kapitanov.kapitanovpetclinic.model.Pet;
import com.kapitanov.kapitanovpetclinic.service.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {
	
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet save(Pet pet) {
        return super.save( pet);
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
