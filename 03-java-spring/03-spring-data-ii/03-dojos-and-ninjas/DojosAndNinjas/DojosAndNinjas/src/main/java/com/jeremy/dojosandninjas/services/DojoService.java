package com.jeremy.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jeremy.dojosandninjas.models.Dojo;
import com.jeremy.dojosandninjas.repositories.DojoRepo;

@Service
public class DojoService {
    private final DojoRepo dojoRepo;

    public DojoService(DojoRepo dojoRepo){
        this.dojoRepo = dojoRepo;
    }

    public List<Dojo> allDojos(){
        return (List<Dojo>)dojoRepo.findAll();
    }

    public Dojo createDojo(Dojo d){
        return this.dojoRepo.save(d);
    }

    public Dojo findDojo(Long id){
        Optional<Dojo> optionalDojo = dojoRepo.findById(id);
        if(optionalDojo.isPresent()){
            return optionalDojo.get();
        }
        return null;
    }

    public Dojo updateDojo(Dojo d){
        return dojoRepo.save(d);
    }

    public void deleteDojo(Long id){
        dojoRepo.deleteById(id);
    }
}