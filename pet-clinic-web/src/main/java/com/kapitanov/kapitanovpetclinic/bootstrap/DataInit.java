package com.kapitanov.kapitanovpetclinic.bootstrap;

import com.kapitanov.kapitanovpetclinic.model.Owner;
import com.kapitanov.kapitanovpetclinic.model.Pet;
import com.kapitanov.kapitanovpetclinic.model.PetType;
import com.kapitanov.kapitanovpetclinic.model.Vet;
import com.kapitanov.kapitanovpetclinic.service.OwnerService;
import com.kapitanov.kapitanovpetclinic.service.PetTypeService;
import com.kapitanov.kapitanovpetclinic.service.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInit implements CommandLineRunner {
	
	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;

	@Autowired
	public DataInit(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
	}

	@Override
	public void run(String... args) throws Exception {
		PetType dog = new PetType();
		dog.setName("Dog");
		
		PetType cat = new PetType();
		cat.setName("Cat");
		
		PetType dogPetType = petTypeService.save(dog);
		PetType catPetType = petTypeService.save(cat);

		petTypeService.save(dogPetType);
		petTypeService.save(catPetType);
		
		Owner owner = new Owner();
		owner.setFirstName("Yani");
		owner.setLastName("Kapitanov");
		owner.setAddress("Bul Bulgaria 49");
		owner.setCity("Harmanli");
		owner.setTelephone("1234345");
		
		Pet gugi = new Pet();
		gugi.setPetType(cat);
		gugi.setOwner(owner);
		gugi.setName("Gugi");
		owner.getPets().add(gugi);
		
		ownerService.save(owner);
		
		Vet vet = new Vet();
		vet.setFirstName("Zhivko");
		vet.setLastName("Zhelev");
		vetService.save(vet);
	}
	
}
