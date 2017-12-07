package com.latam.scrumday.rest.mutation.example.controller;

import com.latam.scrumday.rest.mutation.example.MutantRepository;
import com.latam.scrumday.rest.mutation.example.domain.Mutant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class MutationController {

    @Autowired
    private MutantRepository mutantRepository;

    @RequestMapping(method = RequestMethod.GET)
    public String getMessage() {
        return "Hello World, subí código CON calidad :P !!";
    }

    @RequestMapping(path = "mutants/{id}", method = RequestMethod.GET)
    public ResponseEntity<Mutant> getMutant(@PathVariable int id) {
        Mutant mutant = mutantRepository.findOne(id);
        return mutant != null ? ResponseEntity.ok(mutant) : ResponseEntity.notFound().build();
    }

    @RequestMapping(path = "mutants", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Mutant> createMutant(@RequestBody Mutant mutant) {
        Mutant newMutant = mutantRepository.save(mutant);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{id}")
                .buildAndExpand(newMutant.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @RequestMapping(path = "mutants", method = RequestMethod.GET)
    public ResponseEntity<List<Mutant>> getAll() {
        List<Mutant> all = (List<Mutant>) mutantRepository.findAll();
        return all.size() > 0 ? ResponseEntity.ok(all) : ResponseEntity.noContent().build();
    }

    @RequestMapping(path = "mutants", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity deleteMutant(@RequestBody Mutant mutant) {
        if (mutantRepository.findOne(Integer.valueOf(mutant.getId())) != null) {
            mutantRepository.delete(mutant);
            return ResponseEntity.ok().build();
        }
        else {
            return ResponseEntity.notFound().build();
        }

    }


}
