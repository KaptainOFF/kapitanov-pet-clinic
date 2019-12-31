package com.kapitanov.kapitanovpetclinic.service.map;

import java.util.Set;

import com.kapitanov.kapitanovpetclinic.model.Specialty;
import com.kapitanov.kapitanovpetclinic.service.SpecialityService;

public class SpecialityMapService extends AbstractMapService<Specialty, Long> implements SpecialityService {

	@Override
	public Set<Specialty> findAll() {
		return super.findAll();
	}

	@Override
	public Specialty save(Specialty speciality) {
		return super.save(speciality);
	}

	@Override
	public void delete(Specialty object) {
		super.deleteByObject(object);
	}

	@Override
	public void deleteByID(Long id) {
		super.deleteById(id);
	}

	@Override
	public Specialty findById(Long id) {
		return super.findById(id);
	}
}
