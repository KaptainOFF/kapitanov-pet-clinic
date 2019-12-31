package com.kapitanov.kapitanovpetclinic.service.map;

import com.kapitanov.kapitanovpetclinic.model.Vet;
import com.kapitanov.kapitanovpetclinic.service.VetService;

import java.util.Set;

import org.springframework.stereotype.Service;

@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {
	
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet save(Vet vet) {
        return super.save(vet);
    }

    @Override
    public void delete(Vet object) {

    }

    @Override
    public void deleteByID(Long aLong) {

    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
