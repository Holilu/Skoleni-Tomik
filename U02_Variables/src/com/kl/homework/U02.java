package com.kl.homework;

public class U02 {

    public static void main(String[] args) {

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("VAGONY VLAKU");
        System.out.println(" ");
        //Jake jsou vagony u vlaku
        String[] vlak1 = {"Cerveny", "Hnedy", "Modry", "Cerny"};
        String[] vlak2 = new String[3];
        vlak2[0] = "Cerny";
        vlak2[2] = "Utrzeny";
        System.out.println("Prvni vagon vlak1: " + vlak1[0] + ".");
        System.out.println("Druhy vagon vlak1: " + vlak1[1] + ".");
        System.out.println("Treti vagon vlak1: " + vlak1[2] + ".");
        System.out.println("Ctvrty vagon vlak1: " + vlak1[3] + ".");
        System.out.println("Prvni vagon vlak2: " + vlak2[0] + ".");
        System.out.println("Druhy vagon vlak2: " + vlak2[1] + ".");
        System.out.println("Treti vagon vlak2: " + vlak2[2] + ".");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("PRVNI MORCE");
        System.out.println(" ");

        Morce morce1 = new Morce("Hnedo bila", "Hladkosrste", "Bobina", "Ona", 600);
        morce1.piskani();
        morce1.zrani();
        morce1.popcorning();
        System.out.println(" ");
        System.out.println(" DRUHE MORCE");
        System.out.println(" ");
        Morce morce2 = new Morce("Hneda", "Teddy", "Hugo", "On",700);
        morce2.piskani();
        morce2.popcorning();
        morce2.zrani();
    }
}
