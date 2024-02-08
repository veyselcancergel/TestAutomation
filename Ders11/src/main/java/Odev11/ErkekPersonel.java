package Odev11;

import java.time.LocalDate;

public class ErkekPersonel extends Personel {

    public ErkekPersonel(String ad, String soyad, LocalDate dogumTarihi) {
        super(ad, soyad, dogumTarihi);

    }

    @Override
    public LocalDate emeklilikTarihiHesapla() {
        LocalDate erkekDogumTarihi = getDogumTarihi();
        LocalDate emeklilikTarihi = erkekDogumTarihi.plusYears(65);
        return emeklilikTarihi;
    }
}
