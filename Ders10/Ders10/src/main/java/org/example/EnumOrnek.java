package org.example;
public class EnumOrnek {
    public enum Gunler{

        PAZARTESI, SALI, CARSAMBA, PERSEMBE, CUMA, CUMARTESI, PAZAR
    }

    public static void main(String[] args) {

        System.out.println("Bugün günlerden " + Gunler.PERSEMBE);

        System.out.println("--------");

        for (Gunler gun : Gunler.values()) {
            System.out.println(gun);
        }

        Gunler secilenGun = Gunler.valueOf("CUMA");
        System.out.println("Seçilen Gün:" + secilenGun);


    }



}
