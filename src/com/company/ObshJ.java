package com.company;

public class ObshJ implements Livingble {
private String adress;
private Fam[] fam ;

    public ObshJ(String adress, Fam[] fam) {
        this.adress = adress;
        this.fam = fam;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Fam[] getFam() {
        return fam;
    }

    public void setFam(Fam[] fam) {
        this.fam = fam;
    }

    @Override
    public void payforLiv() {
        System.out.println("10$");
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
