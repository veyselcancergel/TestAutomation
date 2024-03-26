package Odev14OgeBul;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class OgeBul {
    public static <T> T ogeBul(Collection<T> koleksiyon, T aranan) {
        Optional<T> sonuc = koleksiyon.stream()
                                      .filter(eleman -> eleman.equals(aranan))
                                      .findFirst();

        return sonuc.orElse((T)(String.valueOf(-1)));
    }

    public static void main(String[] args) {
        List<String> liste = Arrays.asList("elma", "armut", "kiraz");
        String sonuc1 = ogeBul(liste, "armut");
        System.out.println("Sonuç 1 : " + sonuc1    );

        String sonuc2 = ogeBul(liste, "karpuz");
        System.out.println("Sonuç 2: " + sonuc2 );
    }
}
