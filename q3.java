/*3-) Kullanıcının seçtiği ürünleri, fiyatlarını ve sepete eklenen miktarları bir dizi ile tutan algoritma yazınız.*/

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ürünlerin adlarını, fiyatlarını ve miktarlarını içeren 2D dizi
        String[][] urunler = {
                {"Bilgisayar", "Telefon", "Tablet"},
                {"3000", "2000", "1500"},
                {"0", "0", "0"} // Başlangıçta sepete eklenen miktarlar
        };

        // Kullanıcıdan ürün seçimini al
        while (true) {
            // Ürünleri listele
            System.out.println("Ürünler:");
            for (int i = 0; i < urunler[0].length; i++) {
                System.out.println((i + 1) + ". " + urunler[0][i] + " - " + urunler[1][i] + " TL");
            }
            System.out.println("Sepete eklemek istediğiniz ürünün numarasını girin (Süreci sonlandırmak için 0):");
            int secim = scanner.nextInt();

            // Kullanıcının seçimine göre işlem yap
            if (secim == 0) {
                break; // Çıkış
            } else if (secim > 0 && secim <= urunler[0].length) {
                // Ürünün miktarını al
                System.out.println("Miktarı girin:");
                int miktar = scanner.nextInt();

                // Sepete ürünü ekle
                urunler[2][secim - 1] = String.valueOf(Integer.parseInt(urunler[2][secim - 1]) + miktar);
                System.out.println(urunler[0][secim - 1] + " sepete eklendi. Toplam: " + urunler[2][secim - 1] + " adet");
            } else {
                System.out.println("Geçersiz bir seçim yaptınız. Lütfen tekrar deneyin.");
            }
        }

        // Sepeti yazdır
        System.out.println("Sepetiniz:");
        for (int i = 0; i < urunler[0].length; i++) {
            if (!urunler[2][i].equals("0")) {
                System.out.println(urunler[0][i] + " - " + urunler[2][i] + " adet");
            }
        }
    }
}
