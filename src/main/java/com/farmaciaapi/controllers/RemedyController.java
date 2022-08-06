package com.farmaciaapi.controllers;

import com.farmaciaapi.domain.Remedy;
import com.farmaciaapi.services.RemedyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/farmacia")
public class RemedyController {
    private final RemedyService remedyService;

    @Autowired
    public RemedyController(RemedyService remedyService) {
        this.remedyService = remedyService;
    }
    @GetMapping()
    public ResponseEntity<List<Remedy>> getAll(){
        return ResponseEntity.ok(remedyService.getAll());
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Remedy> getById(@PathVariable Integer id){
        return ResponseEntity.ok(remedyService.getById(id).get());
    }
    @PutMapping(value = "/update")
    public ResponseEntity updateRemedy(@RequestBody Remedy remedy){
        remedyService.updateRemedy(remedy);
        return ResponseEntity.ok("Item Atualizado! :D");
    }
}
