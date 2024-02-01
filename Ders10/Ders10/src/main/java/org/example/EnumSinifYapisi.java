package org.example;

public class EnumSinifYapisi {

    public static void main(String[] args) {
        HaftaGunleri bugun = HaftaGunleri.PERSEMBE;

        System.out.println("Gün numarası: " + bugun.getGunNo());
        System.out.println("Günün durumu: " + bugun.isHaftaIci());

        HaftaGunleri seçilenGun = HaftaGunleri.PAZAR;

        System.out.println("Seçilen Gün numarası: " + seçilenGun.getGunNo());
        System.out.println("Seçilen Günün durumu: " + seçilenGun.isHaftaIci());
    }
}
