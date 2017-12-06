package com.latam.scrumday.rest.mutation.example;

import com.latam.scrumday.rest.mutation.example.controller.MutationController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.not;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExampleApplicationTests {

	@Autowired
	private MutationController mutationController;

	@Test
	public void contextLoads() {

		assertThat(mutationController,is(not(nullValue())));
	}

}
