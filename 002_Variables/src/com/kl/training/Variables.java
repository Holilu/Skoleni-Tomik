package com.kl.training;

/**
 * @author Lucka
 *
 * Tohle je nejaky popis
 * 09.10.2018
 *
 * */

public class Variables {

    /**
     * Toto je metoda ktera startuje program
     * @param args - vtupni argument */ //tohle popisuje co vstupuje a vystupuje z metody

    public static void main(String[] args) {

        // Jednoradkovy komentar
        /* viceradkovy komentar
         * komentar
         * komentar */

        /*
            Byte
                - cele cislo
                - velikost 8 bitu (1 byte)
                - minimalni hodnota = -128
                - maximalni hodnota = 127 (je zde zapocitana kladna nula)
        */
        byte myByte = 1;
        /* byte myByte2 = 150; */ // nelze pouzit z duvodu maximalni hodnoty


        /*
            Short
                - cele cislo
                - velikost 16 bitu (2 byte)
                - minimalni hodnota = -32 768
                - maximalni hodnota = 32 767  (je zde zapocitana kladna nula)
         */

        short myShort = 10000; // cisla se pisou dohromady bez mezer v tisicovkach

        /*
            Integer
                - cele cislo
                - velikost 32 bitu (4 byte)
                - minimalni hodnota = -2 147 483 648
                - maximalni hodnota = 2 147 483 647  (je zde zapocitana kladna nula)
         */

        int myInt = 2000000;

        /*
            Long
             - cele cislo
             - velikost 64 bite (8 byte)
             - minimalni hodnota = -9 223 372 036 854 775 608
             - maximalno honota = 9 223 372 036 854 775 607  (je zde zapocitana kladna nula)
         */

        long mzLong = 0;  // vice prikazu na jeden radek NEPOUZIVAT!!!


        /*
            Float
                - realne cislo
                - velikost 64 bitu (4 bity)
                - minimalni hodnota = -3.40282e+38
                - maximalni hodnota = 3.40282e+38
         */

        float myFloat = 10.001F; //float potrebuje na konci cifry identifikator F

        /*
            Double
             - realne cislo
             - velikost 64 bite (6 byte)
             -minimalni hodnota = -1.79769e308
             -maximalno hodnota = 1.79769e308
         */

        double myDouble = 10.001D;
        double myDouble = 10.001; //identifikator D je u double nepovinny

        /*
            Char
                - znak UNICODE
                - velikost 16 bite (2 byty)
                - minimalni hodnota /u0000
                - maximalni hodnota /uFFFF
         */

        char myChar = 'A'; // jen pro jeden znak a pise se do jednoduchych uvozovek

        /*
            Boolean
                - logicka hodnota
                - velikost 1 bit
                - nabyvahodnot tru nebo false (1 nebo 0)
         */
        boolean myBoolean = true; // musi se psat pouze slovne


        /*
        ********************************************************************************************
        * ******************************************************************************************
                                        Referencni datove typy
         */

        /*
            Retezec (String)
         */

        String myString = "Hello World";

        /*
            Pole (Array) - musi byt urciteho datoveho typu
         */

        int[] myIntArray = {1, 2}; // jedna se o vektor. Jsou staticke, nelze pak menit velikost. { nulty prvek, prvni prvek) zde jsou rovnou definovane hodnoty
        int[] myIntArray2 = new int[2];
        myIntArray2[0] = 10;
        myIntArray2[1] = 20;
        // je to same jako int[] myIntArray = {10, 20}
        String[] myStringArray = {"Prvek1", "Prvek2", "Prvek3"};
        String[] myStringArray2 = new String[3];
            myStringArray2[0] = "Prvek1";
            myStringArray2[1] = "Prvek2";
            myStringArray2[3] = "Prvek3";

            /*
                primitivni datove typy objektove
             */

            int a = 1; // primitivni
            Integer b = 2; // objekt -> referekncni datovy typ s integer
    }
}
