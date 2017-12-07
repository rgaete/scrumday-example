package com.latam.scrumday.rest.mutation.example.domain;

public class Mutant {

    private String name;
    private String superPower;

    public Mutant(String name, String superPower) {
        this.name = name;
        this.superPower = superPower;
    }

    public String getSuperPower() {
        return superPower;
    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
