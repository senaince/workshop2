/*4-) Kullanıcının username, email, firstname, lastname ve password bilgilerini tutan bir ArrayList kullanarak giriş yapma algoritması yazınız.*/

import java.util.*;

public class q4 {
    public static void main(String[] args) {
        List<HashMap<String, String>> kullaniciBilgi = new ArrayList<>();


        HashMap<String,String> kullanici1 = new HashMap<>();
        kullanici1.put("username","yagizcandelibas");
        kullanici1.put("email","yagizcandelibas@gmail.com");
        kullanici1.put("firstname","Yagiz");
        kullanici1.put("lastname","Delibas");
        kullanici1.put("password","yagiz123");
        kullaniciBilgi.add(kullanici1);

        HashMap<String,String> kullanici2 = new HashMap<>();
        kullanici2.put("username","benguseker");
        kullanici2.put("email","benguseker@gmail.com");
        kullanici2.put("firstname","Bengu");
        kullanici2.put("lastname","Seker");
        kullanici2.put("password","bengu123");
        kullaniciBilgi.add(kullanici2);

        HashMap<String,String> kullanici3 = new HashMap<>();
        kullanici3.put("username","kubrabozalp");
        kullanici3.put("email","kubrabozalp@gmail.com");
        kullanici3.put("firstname","Kubra");
        kullanici3.put("lastname","Bozalp");
        kullanici3.put("password","kubra123");
        kullaniciBilgi.add(kullanici3);


        Scanner scanner = new Scanner(System.in);
        System.out.print("Kullanici Adi giriniz:");
        String kullaniciAdi = scanner.next();
        System.out.print("Sifre giriniz:");
        String sifre = scanner.next();
        System.out.println();


        boolean girisBasarili = false;
        for (HashMap<String, String> kullanici : kullaniciBilgi) {
            String username = kullanici.get("username");
            String password = kullanici.get("password");

            if (sifre.equals(password) && kullaniciAdi.equals(username)) {
                girisBasarili = true;
                System.out.println("Giris basarili\nHoş Geldin " +
                        kullanici.get("firstname") + " " + kullanici.get("lastname")+"\n"+
                        "Email:"+ kullanici.get("email"));
                break;
            }
        }

        if (!girisBasarili) {
            System.out.println("Giris basarisiz");
        }
    }
}