package com.jetbrains;

import Pracownicy.Pielegniarka;
import Pracownicy.Lekarz;

public class Main {

    private String imie;
    private String nazwisko;
    private double wyplata;

    public Main (String imie, String nazwisko, double wyplata){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wyplata = wyplata;
        System.out.println("Imie to " + getImie() + " Imie to " + imie + " wyplata " +getWyplata() + " wyplata " + wyplata );
    }

    String getImie()
    { return imie; }
    String getNazwisko()
    { return nazwisko; }
    double getWyplata()
    { return wyplata; }

    public static void main(String[] args) {

        Pielegniarka pielegniarka = new Pielegniarka("Asia", "Kowalska", 2000);
        Lekarz lekarz = new Lekarz("Andrzej", "Kowalski", 4000);

pielegniarka.setNadgodziny(10);
pielegniarka.getNadgodziny();

    }
}
