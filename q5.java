/*5-) Öğrenci adlarının ve notlarının olduğu bir Arraylist kullanarak belirli not aralığı altında kalan öğrenciyi listeden silme algoritması yazınız.*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class q5 {
    public static void main(String[] args) {
        List<HashMap<String, Object>> ogrenciBilgi = new ArrayList<>();


        HashMap<String,Object> ogrenci1 = new HashMap<>();
        ogrenci1.put("ogrenciAd","Sena Ince");
        ogrenci1.put("Not1",80);
        ogrenci1.put("Not2",95);
        ogrenci1.put("Not3",75);
        ogrenciBilgi.add(ogrenci1);

        HashMap<String,Object> ogrenci2 = new HashMap<>();
        ogrenci2.put("ogrenciAd","Ekin Karadag");
        ogrenci2.put("Not1",100);
        ogrenci2.put("Not2",70);
        ogrenci2.put("Not3",65);
        ogrenciBilgi.add(ogrenci2);

        HashMap<String,Object> ogrenci3 = new HashMap<>();
        ogrenci3.put("ogrenciAd","Emel Yenier");
        ogrenci3.put("Not1",70);
        ogrenci3.put("Not2",60);
        ogrenci3.put("Not3",100);
        ogrenciBilgi.add(ogrenci3);

        double ortalama = 0.0;
        List<HashMap<String, Object>> silinecekler = new ArrayList<>();
        for (var ogrenci:ogrenciBilgi){
            ortalama =(((Integer) ogrenci.get("Not1"))+((Integer) ogrenci.get("Not2"))
                    +((Integer) ogrenci.get("Not3")))/3;
            System.out.println("Ogrenci:"+ogrenci.get("ogrenciAd")+"\nOgrenci Ortalama:"+ortalama);
            System.out.println("----------------------------------");
            if (ortalama<80){
                silinecekler.add(ogrenci);
            }

        }
        ogrenciBilgi.removeAll(silinecekler);
        for (var ogrenci : ogrenciBilgi){
            System.out.println("Geçenler:"+ogrenci.get("ogrenciAd"));
        }
    }
}