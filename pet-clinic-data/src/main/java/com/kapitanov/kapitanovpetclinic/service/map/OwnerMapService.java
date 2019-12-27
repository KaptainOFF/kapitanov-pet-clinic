package com.kapitanov.kapitanovpetclinic.service.map;

import com.kapitanov.kapitanovpetclinic.model.Owner;
import com.kapitanov.kapitanovpetclinic.service.CrudService;

import java.util.Set;

public class OwnerMapService extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner.getId(), owner);
    }

    @Override
    public void delete(Owner object) {

    }

    @Override
    public void deleteByID(Long aLong) {

    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
}
