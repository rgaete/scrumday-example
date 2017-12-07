package com.latam.scrumday.rest.mutation.example;

import com.latam.scrumday.rest.mutation.example.domain.Mutant;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MutantRepository extends PagingAndSortingRepository<Mutant, Integer> {


}
