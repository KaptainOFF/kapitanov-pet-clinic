package com.kapitanov.kapitanovpetclinic.springdatajpa;

import com.kapitanov.kapitanovpetclinic.model.Owner;
import com.kapitanov.kapitanovpetclinic.repositories.OwnerRepository;
import com.kapitanov.kapitanovpetclinic.repositories.PetRepository;
import com.kapitanov.kapitanovpetclinic.repositories.PetTypeRepositoriy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class OwnerJpaServiceTest {

    @Mock
    OwnerRepository ownerRepository;

    @Mock
    PetRepository petRepository;

    @Mock
    PetTypeRepositoriy petTypeRepositoriy;

    @InjectMocks
    OwnerJpaService ownerJpaService;

    @BeforeEach
    void setUp() {
    }

    @Test
    void findByLastName() {
        String lastName = "Smith";
        Long ownerId = 1L;
        Owner returnOwner = Owner.builder().id(ownerId).lastName(lastName).build();
        when(ownerRepository.findByLastName(any())).thenReturn(returnOwner);
        Owner smith = ownerJpaService.findByLastName(lastName);
        assertEquals(returnOwner, smith);
    }

    @Test
    void findAll() {
    }

    @Test
    void findById() {
    }

    @Test
    void save() {
    }

    @Test
    void delete() {
    }

    @Test
    void deleteByID() {
    }
}