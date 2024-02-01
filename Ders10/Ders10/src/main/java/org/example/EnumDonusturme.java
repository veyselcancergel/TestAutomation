package org.example;

public class EnumDonusturme {
    public static void main(String[] args) {

        String donusturulenGun = HaftaGunleri.PAZARTESI.name();

        System.out.println(donusturulenGun.toLowerCase());


        String gun = "SALI";
        HaftaGunleri guneDonustur = HaftaGunleri.valueOf(gun);
        System.out.println("Haftanın günü: " + guneDonustur);
    }
}
