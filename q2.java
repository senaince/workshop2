/*2-) Restoranın menüsündeki yemekleri, fiyatlarını ve popülerlik derecelendirmelerini bir dizi ile tutan algoritma yazınız.*/

public class q2 {
    public static void main(String[] args) {
        // Yemek adlarını, fiyatlarını ve popülerlik derecelendirmelerini içeren 2D dizi
        String[][] menu = {
                {"Köfte", "Pizza", "Salata"},
                {"120", "180", "75"},
                {"4.5", "4.2", "4.0"}
        };

        System.out.println("Restoran Menüsü:");
        for (int i = 0; i < menu[0].length; i++) {
            String yemek = menu[0][i];
            String fiyat = menu[1][i];
            String derecelendirme = menu[2][i];
            System.out.println(yemek + " - " + fiyat + " TL - Popülerlik: " + derecelendirme);
        }
    }
}
