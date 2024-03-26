package Odev14Generic;

public class VeriSaklayici<T> {
    private T veri;
    public VeriSaklayici(T veri) {
        this.veri = veri;

    }
    public void veriYazdir() {
        System.out.println("Data: " + veri);
    }
    public T getVeri() {
        return veri;
    }


    }


