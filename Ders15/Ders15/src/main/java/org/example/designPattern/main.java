package org.example.designPattern;

public class main {
    public static void main(String[] args) {
        Bilgisayar bilgisayar = Bilgisayar.BilgisayarBuilder.aBilgisayar()
                .withMarka("Casper")
                .withIslemci("intel")
                .withRam(16)
                .withDepolama(500)
                .build();


        System.out.println(bilgisayar.toString());
    }
}
