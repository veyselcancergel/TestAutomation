package Odev14Generic;

public class main {
    public static void main(String[] args) {
        VeriSaklayici<String> stringSaklayici = new VeriSaklayici<>("Merhaba Dünya");

        stringSaklayici.veriYazdir();

        VeriSaklayici<Integer> integerSaklayici = new VeriSaklayici<>(42);

        integerSaklayici.veriYazdir();
    }
}
