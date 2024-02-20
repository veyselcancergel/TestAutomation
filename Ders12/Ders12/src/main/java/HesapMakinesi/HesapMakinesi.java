package HesapMakinesi;

public class HesapMakinesi {
    public static enum HesaplamaHata {
        BOLME_SIFIRA_BOLME,
        DURUM_BILINMIYOR
    }
    public static double toplama(double sayi1, double sayi2) {
        return sayi1 + sayi2;
    }
    public static double cikarma(double sayi1, double sayi2) {
        return sayi1 - sayi2;
    }
    public static double carpma(double sayi1, double sayi2) {
        return sayi1 * sayi2;
    }
    public static double bolme(double sayi1, double sayi2) {
        if (sayi2 == 0) {
            throw new ArithmeticException("Sıfıra bölme hatası!");
        }
        return sayi1 / sayi2;
    }
    public static HesaplamaHata hesaplaVeHataKontrolEt(double sayi1, double sayi2, String islem) {
        try {
            switch (islem) {
                case "+":
                    toplama(sayi1, sayi2);
                    break;
                case "-":
                    cikarma(sayi1, sayi2);
                    break;
                case "*":
                    carpma(sayi1, sayi2);
                    break;
                case "/":
                    bolme(sayi1, sayi2);
                    break;
                default:
                    return HesaplamaHata.DURUM_BILINMIYOR;
            }
            return null; // Başarılı hesaplama durumu
        } catch (ArithmeticException e) {
            return HesaplamaHata.BOLME_SIFIRA_BOLME;
        } catch (Exception e) {
            return HesaplamaHata.DURUM_BILINMIYOR;
        }
    }

    public static void main(String[] args) {
        double sayi1 = 10;
        double sayi2 = 1;
        String islem = "/";

        HesaplamaHata hata = hesaplaVeHataKontrolEt(sayi1, sayi2, islem);

        if (hata == null) {
            System.out.println("Hesaplama başarılı!");
        } else {
            switch (hata) {
                case BOLME_SIFIRA_BOLME:
                    System.out.println("Hata: Sıfıra bölme hatası!");
                    break;
                case DURUM_BILINMIYOR:
                    System.out.println("Hata: Geçersiz işlem!");
                    break;
            }
        }
    }
}

