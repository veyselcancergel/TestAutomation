package org.example.Abstraction;

public class Kare extends Sekil{

    private int kenar;

    public Kare(int kenar){

        this.kenar = kenar;

    }
    @Override
    void cevreHesapla() {
        System.out.println(("Karenin Çevresi: " + 4* (kenar)));

    }

    @Override
    void alanHesapla() {
        System.out.println("Karenin Alanı: " + (kenar*kenar));

    }
}
