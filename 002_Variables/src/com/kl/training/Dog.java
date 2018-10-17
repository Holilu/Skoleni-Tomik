package com.kl.training;

public class Dog {

    // reprezentuje objekt

    /* Vlastnosti objektu */
        /* instancni promenne - bez vytvoreni objektu nelze modfikovat ani cist */
    public String jmeno;
    public String barvaSrsti;
    public String plemeno;
    public double vaha;

        /* staticke promenne - lze modifikovat a cist bez objektu. Plati pro ne
                             - ze tuto vlastnost bude mit pri vytvoreni */

    public int pocetKoncetin = 4;

    // kontruktor
    /*
     - pomoci nej pridelujeme hodnoty instancnim promennym objektu
     - ma stejny nazev jako nazev tridy
     */
    public Dog(String jmeno, String barvaSrsti, String plemeno, double vaha){
        System.out.println("Jmeno psa: " + jmeno);
        System.out.println("Barva strsti: " + barvaSrsti);
        System.out.println("Plemeno: " + plemeno);
        System.out.println("Vaha: " + vaha);
    }

    /* metoda objektu Dog */

    public void bark(){
        System.out.println("HAF!");
    }

}
