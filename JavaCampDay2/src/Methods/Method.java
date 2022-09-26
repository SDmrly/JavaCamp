package Methods;

public class Method {
    //Pascal Casing
    public void sayiBulma() {
        int[] sayilar = new int[]{1,2,3,4,5,6,7,8,9,0};
        int aranicakSayi = 5;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == sayi) {
                varMi = true;
                break;
            }
        }
        if (varMi)
            mesajVer("Sayi mevcuttur: " + aranicakSayi);
        else
            mesajVer("Sayi mevcut degildir: " + +aranicakSayi);
    }

    public void mesajVer(String mesaj) {
        System.out.println(mesaj);
    }

    //Parametreli Method
    public void toplamaIslemi() {
        int sonuc = islemYap(15, 7);
        System.out.println("Sonuc: " + sonuc);
    }

    public int islemYap(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public void toplama() {
        int sayi = topla(1,2,3,4,5,6,7,8,9,10);
        System.out.println("Toplam sayi: " + sayi);
    }
    public int topla(int... sayilar) {
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        return toplam;
    }
}
