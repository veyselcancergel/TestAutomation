package org.example;

public class DebugExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) { // mantıksal hata; <= yerine < olmalı
            sum += numbers[i];
        }
        System.out.println("Dizideki elemanların toplamı:" + sum);
    }
}

