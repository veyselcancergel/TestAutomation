package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingExample {
    public static void main(String[] args) {
        String dosyaYolu = "src/main/java/org/example/dosya.txt";

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(dosyaYolu));
            String satir;

            while ((satir = bufferedReader.readLine()) != null) {
                System.out.println(satir);
            }
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya Bulunamadı:" + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Dosya okuma hatası:" + ex.getMessage());
        } finally {
            System.out.println("Dosya okuma işleme tamamlandı.");
        }
    }
}
