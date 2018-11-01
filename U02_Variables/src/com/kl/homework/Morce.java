package com.kl.homework;

public class Morce {

    public String barva;
    public String typSrsti;
    public String jmenoM;
    public String pohlavi;
    public double vaha;
    public boolean hlad;

    public Morce(String barva, String typSrsti, String jmenoM, String pohlavi, double vaha){
        System.out.println("Jmeno Morcete: " + jmenoM);
        System.out.println("Barva strsti: " + barva);
        System.out.println("Typ srsti: " + typSrsti);
        System.out.println("Pohlavi: " + pohlavi);
        System.out.println("Vaha: " + vaha);
    }

    public void piskani(){
        hlad=true;
        System.out.println("Hlad:" + hlad);
        System.out.println("QUIII! QUIII! QUIII!");
    }

    public void popcorning(){
        hlad=false;
        System.out.println("Hlad:" + hlad);
        System.out.println("PU PU PU");
    }

    public void zrani(){
        hlad=false;
        System.out.println("Hlad:" + hlad);
        System.out.println("MLASK! MLASK!");
    }
}
