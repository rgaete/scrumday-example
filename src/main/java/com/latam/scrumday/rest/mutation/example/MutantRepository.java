package com.latam.scrumday.rest.mutation.example;

import com.latam.scrumday.rest.mutation.example.domain.Mutant;

import java.util.ArrayList;
import java.util.List;

public class MutantRepository {

    private List<Mutant> mutants = new ArrayList<>();

    public MutantRepository(ArrayList<Mutant> mutants) {
        this.mutants = mutants;
    }

    public Mutant fetch(int id) {
        return mutants.get(id);
    }

    public List<Mutant> fetchAll() {
        return mutants;
    }

    public int save(Mutant mutant) {
        mutants.add(mutant);

        return mutants.indexOf(mutant);
    }

    public void delete(Mutant mutant) {
        mutants.remove(mutant);
    }

}
