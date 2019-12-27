package com.kapitanov.kapitanovpetclinic.service;

import com.kapitanov.kapitanovpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
