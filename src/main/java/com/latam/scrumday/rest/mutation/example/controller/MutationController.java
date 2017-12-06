package com.latam.scrumday.rest.mutation.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MutationController {

    @RequestMapping(method = RequestMethod.GET)
    public String getMessage() {
        return "Hello";
    }
}