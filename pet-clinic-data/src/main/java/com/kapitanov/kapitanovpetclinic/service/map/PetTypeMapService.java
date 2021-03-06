package com.kapitanov.kapitanovpetclinic.service.map;

import com.kapitanov.kapitanovpetclinic.model.PetType;
import com.kapitanov.kapitanovpetclinic.service.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {

	@Override
	public Set<PetType> findAll() {
		return super.findAll();
	}

	@Override
	public PetType save(PetType petType) {
		return super.save(petType);
	}

	@Override
	public void delete(PetType object) {
		super.deleteByObject(object);
	}	

	@Override
	public void deleteByID(Long id) {
		super.deleteById(id);
	}

	@Override
	public PetType findById(Long id) {
		return super.findById(id);
	}

}
