package com.kapitanov.kapitanovpetclinic.service.map;

import com.kapitanov.kapitanovpetclinic.model.Vet;
import com.kapitanov.kapitanovpetclinic.service.CrudService;

import java.util.Set;

public class VetMapService extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet save(Vet vet) {
        return super.save(vet.getId(), vet);
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
