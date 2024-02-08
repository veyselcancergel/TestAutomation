package org.example.Abstraction;

public class Dikdortgen extends Sekil{

    private int en;
    private int boy;
    public Dikdortgen(int en, int boy){

        this.en = en;
        this.boy = boy;
    }
    @Override
    void cevreHesapla() {
        System.out.println(("Dikdörtgenin Çevresi: " + 2* (en+boy)));

    }

    @Override
    void alanHesapla() {
        System.out.println("Dikdörtgenin Alanı: " + (en*boy));

    }
}
