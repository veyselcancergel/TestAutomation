package org.example;

public enum HaftaGunleri {

    PAZARTESI(1),
    SALI(2),
    CARSAMBA(3),
    PERSEMBE(4),
    CUMA(5),
    CUMARTESI(6),
    PAZAR(7);

    private int gunNo;

    public int getGunNo() {
        return gunNo;
    }

    HaftaGunleri(int gunNo) {
        this.gunNo = gunNo;

    }

    public String isHaftaIci() {
        if( gunNo >= 1 && gunNo <=5) {
            return "Hafta İçi";
        } else {
            return "Hafta Sonu";
        }
    }

}
