package org.example;

public class maas_hesaplama {
    public static int hesapla(Integer calisilan_gun, Integer gunluk_ucret) {
        if (calisilan_gun > 25) {
            return (calisilan_gun * gunluk_ucret) + ((calisilan_gun - 25) * 1000);
        } else {
            return calisilan_gun * gunluk_ucret;
        }
    }
}
