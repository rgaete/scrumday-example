package com.latam.scrumday.rest.mutation.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MutationController {

    @RequestMapping(method = RequestMethod.GET)
    public String getMessage() {
        return "Hello World, subí código CON calidad :P !!";
    }

    public String getMessage2() {
        return "Hello World, subí código CON calidad :P !!";
    }

    public String getMessage3() {
        return "Hello World, subí código CON calidad :P !!";
    }

    public String getMessage4() {
        return "Hello World, subí código CON calidad :P !!";
    }
}
