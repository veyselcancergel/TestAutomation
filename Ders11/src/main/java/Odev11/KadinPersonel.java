package Odev11;

import java.time.LocalDate;

public class KadinPersonel extends Personel {

    public KadinPersonel(String ad, String soyad, LocalDate dogumTarihi) {
        super(ad, soyad, dogumTarihi);

    }

    @Override
    public LocalDate emeklilikTarihiHesapla() {
        LocalDate kadinDogumTarihi = getDogumTarihi();
        LocalDate emeklilikTarihi = kadinDogumTarihi.plusYears(60);
        return emeklilikTarihi;
    }
}
