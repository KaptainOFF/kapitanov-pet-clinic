package com.kapitanov.kapitanovpetclinic.springdatajpa;

import com.kapitanov.kapitanovpetclinic.model.Owner;
import com.kapitanov.kapitanovpetclinic.repositories.OwnerRepository;
import com.kapitanov.kapitanovpetclinic.repositories.PetRepository;
import com.kapitanov.kapitanovpetclinic.repositories.PetTypeRepositoriy;
import com.kapitanov.kapitanovpetclinic.service.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class OwnerJpaService implements OwnerService {

    private final OwnerRepository ownersRepository;

    public OwnerJpaService(OwnerRepository repository) {
        this.ownersRepository = repository;
    }

    @Override
    public Owner findByLastName(String lastName) {
        return ownersRepository.findByLastName(lastName);
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners = new HashSet<>();
        ownersRepository.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public Owner findById(Long id) {
        return ownersRepository.findById(id).orElse(null);
    }

    @Override
    public Owner save(Owner owner) {
        return ownersRepository.save(owner);
    }

    @Override
    public void delete(Owner owner) {
        ownersRepository.delete(owner);
    }

    @Override
    public void deleteByID(Long id) {
        ownersRepository.deleteById(id);
    }
}
