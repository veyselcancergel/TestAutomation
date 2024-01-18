package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        String[] metin = {"ben","bugun","eve","gittim"};
        ArrayList<String> yeniMetin = new ArrayList<String>();

        for(int i=0; i < metin.length; i++)
        {
            for (int j=0; j < metin[i].length()-1; j++)
            {
                if (metin[i].charAt(j)==metin[i].charAt(j+1)) {
                    yeniMetin.add(metin[i]);
                    break;
                }

            }
        }
    }
}