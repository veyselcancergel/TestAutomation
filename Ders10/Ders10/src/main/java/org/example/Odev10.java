package org.example;

public class Odev10 {
    public enum Gezegenler {
        MERKUR(1, 57000000, 4884, 0.2),

        VENUS(2, 110000000, 12346, 0.6),
        DUNYA(3, 148000000, 12709, 1),
        MARS(4, 230000000, 6767, 1.8),
        JUPITER(5, 780000000, 142647, 11.6),
        SATURN(6, 1438000000, 124309, 29.5),
        URANUS(7, 297000000, 51767, 84.1),
        NEPTUN(8, 456800000, 49138, 164.8);

        private int siraNo;
        private int uzaklik;
        private int cap;
        private double yil;

        Gezegenler(int siraNo, int uzaklik, int cap, double yil) {
            this.siraNo = siraNo;
            this.uzaklik = uzaklik;
            this.cap = cap;
            this.yil = yil;
        }
    }

    public static void main(String[] args) {
        for (Gezegenler gezo : Gezegenler.values()) {

            System.out.println(gezo);
            System.out.println("Sıra No:" + gezo.siraNo);
            System.out.println("Güneşe olan uzaklık:" + gezo.uzaklik);
            System.out.println("Çap:" + gezo.cap);
            System.out.println("Yıl uzunluğu:"+ gezo.yil);
        }


    }
}



