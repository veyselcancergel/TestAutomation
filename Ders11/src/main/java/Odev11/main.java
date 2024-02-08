package Odev11;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        LocalDate Tarih1 = LocalDate.of(1992,1,13);
        LocalDate Tarih2 = LocalDate.of(1989,6,7);
        Personel TeamLead = new KadinPersonel("İpek","Çergel",Tarih1 );
        Personel TeamLead2 = new ErkekPersonel("Can","Çergel", Tarih2);
        Personel Junior1 = new KadinPersonel("Deniz","Çergel",LocalDate.MIN);

        Departman Yazilim = new Departman(TeamLead);
        Yazilim.TeamLeadDegistir(TeamLead2);
        Yazilim.GorevListesineEkle("silme");


        LocalDate a = TeamLead.emeklilikTarihiHesapla();
        System.out.println("Emeklilik Tarihi:" + a);
        LocalDate b = TeamLead2.emeklilikTarihiHesapla();
        System.out.println("Emeklilik Tarihi:" + b);

        Yazilim.PersonelListesineEkle(TeamLead);
        Yazilim.PersonelListesineEkle(TeamLead2);
        Yazilim.PersonelDegistir(Junior1,1);



    }
}
