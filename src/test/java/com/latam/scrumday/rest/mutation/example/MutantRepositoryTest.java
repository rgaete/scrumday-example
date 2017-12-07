package com.latam.scrumday.rest.mutation.example;

import com.latam.scrumday.rest.mutation.example.domain.Mutant;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class MutantRepositoryTest {

    private MutantRepository mutantRepository;

    private void setupRepository() {
        ArrayList<Mutant> mutants = new ArrayList<>();
        mutants.add(new Mutant("m0", "super tall"));
        mutants.add(new Mutant("m1", "xray vision"));
        mutants.add(new Mutant("m2", "4 eyes"));
        mutantRepository = new MutantRepository(mutants);
    }

    @Test
    public void shouldFetchOneMutant() throws Exception {
        setupRepository();

        Mutant mutant = mutantRepository.fetch(0);

        assertEquals("m0", mutant.getName());
    }

    @Test
    public void shouldFetchAllMutants() throws Exception {
        setupRepository();

        List<Mutant> mutants = mutantRepository.fetchAll();

        assertEquals(3, mutants.size());

    }

    @Test
    public void shouldSaveOneMutant() throws Exception {
        setupRepository();

        Mutant mutant = new Mutant("m4", "super fast");

        int id = mutantRepository.save(mutant);

        assertEquals(3, id);
        assertEquals("m4", mutantRepository.fetch(id).getName());
    }

    @Test
    public void shuoldDeleteOneMutant() throws Exception {
        setupRepository();

        int size = mutantRepository.fetchAll().size();
        Mutant mutant = mutantRepository.fetch(size - 1);

        mutantRepository.delete(mutant);

        assertEquals(size -1, mutantRepository.fetchAll().size());


    }

}