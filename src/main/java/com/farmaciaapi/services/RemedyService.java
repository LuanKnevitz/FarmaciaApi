package com.farmaciaapi.services;

import com.farmaciaapi.domain.Remedy;
import com.farmaciaapi.repositories.RemedyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RemedyService {

    private final RemedyRepository remedyRepository;

    @Autowired
    public RemedyService(RemedyRepository remedyRepository) {
        this.remedyRepository = remedyRepository;
    }

    public Optional<Remedy> getById(Integer id){
        return remedyRepository.findById(id);
    }

    public List<Remedy> getAll(){
        return remedyRepository.findAll();
    }

    public void updateRemedy(Remedy remedy){
        Remedy itemToBeUpdated = getById(remedy.getId()).get();
        itemToBeUpdated.setName(remedy.getName());
        itemToBeUpdated.setPrice(remedy.getPrice());
        itemToBeUpdated.setQuantity(remedy.getQuantity());
        itemToBeUpdated.setCategoryEnum(remedy.getCategoryEnum());
        remedyRepository.saveAndFlush(itemToBeUpdated);
    }
}
