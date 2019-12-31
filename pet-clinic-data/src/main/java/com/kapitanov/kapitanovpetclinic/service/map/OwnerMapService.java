package com.kapitanov.kapitanovpetclinic.service.map;

import com.kapitanov.kapitanovpetclinic.model.Owner;
import com.kapitanov.kapitanovpetclinic.service.OwnerService;

import java.util.Set;

import org.springframework.stereotype.Service;

@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner);
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

	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}
}
