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
        double myDouble2 = 10.001; //identifikator D je u double nepovinny

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
            Retezec (String) - řetezec - seskupení jednotlivých charu. Mezera je Whitespace
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

        double[] myDoubleArray = {10.2, 0.00};

        float[] myFloatArray = new float[0];  // zde je potrebovat velikost pole
        float[] myFloatArray2 = {}; // zde je prazdne pole
        float[] myFloatArray3 = new float[5];
            myFloatArray3[0] = 12.1F;
            myFloatArray3[1] = 14F;
            myFloatArray3[2] = 22F;
            myFloatArray3[3] = 34F;
            myFloatArray3[4] = 99F;

        System.out.println("Hodnota pole myFloatArray je :" +
                myFloatArray3[0] + ", " + myFloatArray3[1] + ", " +
                myFloatArray3[2] + ", " + myFloatArray3[3] + ", " +
                myFloatArray3[4]);

        System.out.println("Hodnota prvniho prvku pole myDoubleArray: " + myDoubleArray[1]);

        //System.out.println("Hodnota prvniho prvku pole myDoubleArray: " + 1); pro spojovani hodnot se pouziva +
        //muze se za nej psat i normalni cisla

        String[] myStringArray = {"Prvek1", "Prvek2", "Prvek3"};
        String[] myStringArray2 = new String[3];
            myStringArray2[0] = "Prvek1";
            myStringArray2[1] = "Prvek2";
            myStringArray2[2] = "Prvek3";

            /*
                primitivni datove typy objektove
             */

            int a = 1; // primitivni
            Integer b = 2; // objekt -> referekncni datovy typ s integer


        /*
        Vylet duchodcu z Albertova na prazsky hrad
         */

        // Autobus je pole. Duchodci jsou prvky

        String[] autobus1 = {"Vera", "Kveta", "Franta", "Josef"};
        String[] autobus2 = new String[3];
            autobus2[0] = "Spytihnev";
            //autobus2[1] = ""; // je mozne toto vynechat
            autobus2[2] = "Mojmir";
        System.out.println("Druhe misto autobusu: " + autobus2[1] + ".");

                //Spytihnev
        // nikdo
        // Mojmir


        /*
        ***********************************************************************************************
        *************************************** Objekty ***********************************************
        ***********************************************************************************************
         */

        /*
         Objekty
            - reprezentuji prvky realneho sveta (pes)
            - maji vlastnosti (pes ma 4 nohy, velky cerny)
            - mohou mit nejake metody ( pes nesteka, pes nekouse, ...)
          */

        // tvorba objektu
        Dog pes1 = new Dog("Hafik", "Hneda", "Doga", 130.1);

        // zmena instancni promenne
        pes1.jmeno = "Fik";
        System.out.println(pes1.jmeno);

        // pocet nohou - staticka promenna
        System.out.println("Pocet koncetin: " + pes1.pocetKoncetin);

        // Volani metody obejktu

        pes1.bark();

    }
}
