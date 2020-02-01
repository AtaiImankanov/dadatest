package com.company;

import java.util.List;

public class Appart implements Livingble {
    private String adress;
    private List<Fam> fam ;

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public List<Fam> getFam() {
        return fam;
    }

    public void setFam(List<Fam> fam) {
        this.fam = fam;
    }

    @Override
    public void payforLiv() {
        System.out.println("12$");
    }

    @Override
    public void live() {
        System.out.println(adress);
    }

    @Override
    public Integer PplCount() {
        return null;
    }
}
