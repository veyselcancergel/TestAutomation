package Odev11;


import java.time.LocalDate;

public abstract class Personel {
    private String ad;
    private String soyad;
    private LocalDate  dogumTarihi;

    public LocalDate getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(LocalDate dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }



    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public Personel(String ad, String soyad, LocalDate dogumTarihi){
        this.ad = ad;
        this.soyad = soyad;
        this.dogumTarihi = dogumTarihi;
    }
    public abstract LocalDate emeklilikTarihiHesapla();
}




