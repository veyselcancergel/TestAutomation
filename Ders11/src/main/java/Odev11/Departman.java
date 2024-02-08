package Odev11;

import java.util.ArrayList;
import java.util.List;

public class Departman {
    private Personel Teamlead;
    private List<Personel> personelListesi;
    private List<String> gorevlistesi;

    public Personel getTeamlead() {
        return Teamlead;
    }

    public void setTeamlead(Personel teamlead) {
        Teamlead = teamlead;
    }

    public List<Personel> getPersonelListesi() {
        return personelListesi;
    }

    public void setPersonelListesi(List<Personel> personelListesi) {
        this.personelListesi = personelListesi;
    }

    public List<String> getGorevlistesi() {
        return gorevlistesi;
    }

    public void setGorevlistesi(List<String> gorevlistesi) {
        this.gorevlistesi = gorevlistesi;
    }

    public Departman(Personel teamlead) {
        this.Teamlead = teamlead;
        personelListesi = new ArrayList<>();
        gorevlistesi = new ArrayList<>();

    }
    public void GorevListesineEkle(String GorevIsmi){
        gorevlistesi.add(GorevIsmi);
    }
    public void GorevListesindenCikar(String GorevIsmi) {
        gorevlistesi.remove(GorevIsmi);
    }
    public void PersonelListesineEkle(Personel personel){
        personelListesi.add(personel);
    }
    public void PersonelListesindenCikar(Personel personel) {
        personelListesi.remove(personel);
    }
    public void TeamLeadDegistir(Personel personel) {
        this.Teamlead = personel;
    }
    public void PersonelDegistir(Personel personel, int index) {
        personelListesi.set(index, personel);
    }


}

