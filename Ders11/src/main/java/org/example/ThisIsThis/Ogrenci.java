package org.example.ThisIsThis;

public class Ogrenci {
    private String isim;

    public void setIsim(String isim) {
       this.isim = isim; // Alan ile parametreyi ayırır.
    }
    public void yazdirOgrenci(){
        System.out.println("Öğrenci: " + this.isim);
    }
}
