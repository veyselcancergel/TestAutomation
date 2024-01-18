package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Ik_Data {
    public static void main(String[] args) {
        Employee personel1 = new Employee();
        Employee personel2 = new Employee();
        Employee personel3 = new Employee();

        personel1.name = "Can";
        personel1.surname = "Cergel";
        personel1.Department = "Quality";
        personel1.email = "cancergel@gmail.com";
        personel1.title = "Laboratory Specialist";
        personel1.phoneNumber = 123456;

        personel2.name = "Veysel";
        personel2.surname = "Cergel";
        personel2.Department = "Quality";
        personel2.email = "veyselcergel@gmail.com";
        personel2.title = "Laboratory Manager";
        personel2.phoneNumber = 654321;

        personel3.name = "Ana";
        personel3.surname = "List";
        personel3.Department = "Quality";
        personel3.email = "analist@gmail.com";
        personel3.title = "Analist";
        personel3.phoneNumber = 98765;

        personel1.isim();
        personel2.isim();
        personel3.isim();
        personel1.mail();
        personel2.mail();
        personel3.mail();
        personel1.bolum();
        personel2.bolum();
        personel3.bolum();






        }
    }
