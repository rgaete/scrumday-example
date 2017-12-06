package com.latam.scrumday.rest.mutation.example.unit.controller;

import com.latam.scrumday.rest.mutation.example.controller.MutationController;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MutationControllerTest {

    @Test
    public void shouldReturnHello() throws Exception {

        MutationController mutationController = new MutationController();
        assertThat(mutationController.getMessage(),is("Hello Mundo !!"));

    }
}