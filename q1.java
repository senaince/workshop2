/*1-) Bir mağazanın günlük satış miktarını, ürün adı ve fiyatını bir dizi olarak tutan ve toplam satış gelirini hesaplayan bir algoritma yazınız.*/

public class q1 {
    public static void main(String[] args) {
        // Ürün adı, fiyatı ve günlük satış miktarını içeren diziler
        String[] urunler = {"Kalem", "Defter", "Kalemtraş"};
        double[] fiyatlar = {12.50, 37.0, 8.75};
        int[] satisMiktari = {200, 50, 200};

        // Toplam satış gelirini hesaplamak için
        double toplamSatisGeliri = 0;
        for (int i = 0; i < urunler.length; i++) {
            double satisGeliri = fiyatlar[i] * satisMiktari[i];
            toplamSatisGeliri += satisGeliri;
            System.out.println(urunler[i] + " satış geliri: " + satisGeliri + " TL");
        }

        System.out.println("Toplam satış geliri: " + toplamSatisGeliri + " TL");
    }
}