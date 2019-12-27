package com.kapitanov.kapitanovpetclinic.service;

import com.kapitanov.kapitanovpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet pet);
    Set<Vet> findAll();
}
