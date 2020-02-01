package com.company;

import java.util.List;

public class Fam {
    private List<Person> person;

    public Fam(List<Person> person) {
        this.person = person;
    }

    public List<Person> getPerson() {
        return person;
    }

    public void setPerson(List<Person> person) {
        this.person = person;
    }
}
