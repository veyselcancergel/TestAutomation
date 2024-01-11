package org.example;

public class maas_hesaplama {
    public static void main(String[] args) {
        int calisilan_gun = 26;
        int gunluk_ucret = 1000;


        if (calisilan_gun > 25) {
            System.out.println((calisilan_gun * gunluk_ucret) + ((calisilan_gun - 25) * 1000));
        } else {
            System.out.println(calisilan_gun * gunluk_ucret);
        }
    }
}
