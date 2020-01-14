package com.kapitanov.kapitanovpetclinic.service.map;

import com.kapitanov.kapitanovpetclinic.model.Visit;
import com.kapitanov.kapitanovpetclinic.service.VisitService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public Visit findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Visit save(Visit object) {
        if(object.getPet() == null || object.getPet().getOwner() == null
                || object.getPet().getId() == null
                || object.getPet().getOwner().getId() == null) {
            throw new RuntimeException("Invalid visit");
        }
        return super.save(object);
    }

    @Override
    public void delete(Visit object) {
        super.deleteByObject(object);
    }

    @Override
    public void deleteByID(Long aLong) {
        super.deleteById(aLong);
    }
}
