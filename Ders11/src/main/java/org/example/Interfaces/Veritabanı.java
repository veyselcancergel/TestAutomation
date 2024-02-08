package org.example.Interfaces;

public interface Veritabanı {
    String DATABASE_NAME = "db_veritabanı";
    int PORT = 3306;

    void baglan();
    void sorguYap();
    void baglantiKapat();

}
