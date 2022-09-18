import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner veri = new Scanner(System.in);
        System.out.println("Hello Java!\n");

        System.out.println("----------------------------------------------");
        System.out.println("variables variables2 conditionals recapdemo1");
        System.out.println("switchdemo loopdemo arraysdemo recapdemo2");
        System.out.println("multiarraydemo stringdemo asalsayi sesliharf");
        System.out.println("mukemmelsayi arkadassayi sayibulma");
        System.out.println("Yukarida belirtilmis olan konu basliklarindan secin!");
        System.out.println("----------------------------------------------");
        System.out.print("Lutfen secim belirtin: ");
        String veriGirdisi = veri.next();

        switch (veriGirdisi) {
            case "variables" -> Variables();
            case "variables2" -> Variables2();
            case "conditionals" -> Conditionals();
            case "recapdemo1" -> RecapDemo1();
            case "switchdemo" -> SwitchDemo();
            case "loopdemo" -> LoopDemo();
            case "arraysdemo" -> ArraysDemo();
            case "recapdemo2" -> RecapDemo2();
            case "multiarraydemo" -> MultiArrayDemo();
            case "stringdemo" -> StringsDemo();
            case "asalsayi" -> miniProjeAsalSayi();
            case "sesliharf" -> sesliHarfler();
            case "mukemmelsayi" -> MukemmelSayi();
            case "arkadassayi" -> ArkadasSayi();
            case "sayibulma" -> SayiBulma();
            default -> System.out.println("Yanlis veri girisi!");
        }

    }

    public static void Variables() {
        int ogrenciSayisi = 12;
        String mesaj = "Ogrenci Sayisi: ";

        System.out.println(mesaj + ogrenciSayisi);
        System.out.println(mesaj + ogrenciSayisi);
        System.out.println(mesaj + ogrenciSayisi);
        System.out.println(mesaj + ogrenciSayisi);
        System.out.println(mesaj + ogrenciSayisi);

    }

    public static void Variables2() {
        int sayi = 12;
        double ucret = 15.5;
        char karakter = 'A';
        String metin = "Hello World";
        boolean sonuc = false;

        System.out.println(sayi);
        System.out.println(ucret);
        System.out.println(karakter);
        System.out.println(metin);
        System.out.println(sonuc);
    }

    public static void Conditionals() {
        int sayi = 24;

        if (sayi < 20) {
            System.out.println("sayi kucuktur 20den.");
        } else if (sayi == 20) {
            System.out.println("sayi 20ye esittir.");
        } else {
            System.out.println("Sayi 20den buyuktur");
        }
    }

    public static void RecapDemo1() {
        int sayi1, sayi2, sayi3, enBuyuk;

        sayi1 = 24;
        sayi2 = 25;
        sayi3 = 2;
        enBuyuk = sayi1;

        if (enBuyuk < sayi2) {
            enBuyuk = sayi2;
        }
        if (enBuyuk < sayi3) {
            enBuyuk = sayi3;
        }

        System.out.println("En buyuk sayi: " + enBuyuk);
    }

    public static void SwitchDemo() {
        char grade = 'B';

        switch (grade) {
            case 'A' -> System.out.println("Mukemmel : Gectiniz!");
            case 'B', 'C' -> System.out.println("Iyi : Gectiniz!");
            case 'D' -> System.out.println("Fena Degil : Gectiniz!");
            case 'F' -> System.out.println("Maalesef Kaldiniz!");
            default -> System.out.println("Yanlis bir not girdiniz!");
        }
    }

    public static void LoopDemo() {
        System.out.println("Birden 10a kadar..");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("For Dongusu bitti!");
        System.out.println("-----------------------------------");

        System.out.println("2er 2er sayma..");
        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("For Dongusu bitti!");
        System.out.println("-----------------------------------");

        System.out.println("While dongusu basladi!");
        int j = 0;
        while (j < 10) {
            System.out.println(j);
            j++;
        }
        System.out.println("While dongusu bitti!");
        System.out.println("-----------------------------------");

        System.out.println("Do While dongusu basladi!");
        int k = 100;
        do {
            System.out.println(k);
            k++;
        } while (k < 10);
    }

    public static void ArraysDemo() {
        String ogrenci1 = "Engin";
        String ogrenci2 = "Derin";
        String ogrenci3 = "Salih";
        String ogrenci4 = "Ahmet";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("-----------------------------");

        String[] ogrenciler = new String[4];

        ogrenciler[0] = "Engin";
        ogrenciler[1] = "Derin";
        ogrenciler[2] = "Salih";
        ogrenciler[3] = "Ahmet";

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }

        System.out.println("--------------------------------");

        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }

    }

    public static void RecapDemo2() {
        double[] myList = {1.2, 1.3, 4.3, 5.6};
        double total = 0;
        double max = myList[0];

        for (double number : myList) {
            if (max < number) {
                max = number;
            }
            total = total + number;
            System.out.println(number);
        }

        System.out.println("Toplam: " + total);
        System.out.println("Max Sayi: " + max);
    }

    public static void MultiArrayDemo() {
        String[][] sehirler = new String[3][3];

        sehirler[0][0] = "Istanbul";
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Bilecik";
        sehirler[1][0] = "Ankara";
        sehirler[1][1] = "Konya";
        sehirler[1][2] = "Kayseri";
        sehirler[2][0] = "Diyarbakir";
        sehirler[2][1] = "Sanliurfa";
        sehirler[2][2] = "Gaziantep";

        for (int i = 0; i <= 2; i++) {
            System.out.println("-----------------");
            for (int j = 0; j <= 2; j++) {
                System.out.println(sehirler[i][j]);
            }
        }
    }

    public static void StringsDemo() {
        String mesaj = "Bugun hava cok guzel.";
        System.out.println(mesaj);

        System.out.println("Eleman sayisi: " + mesaj.length());
        System.out.println("5. Eleman: " + mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yasasin."));
        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.endsWith("."));
        System.out.println(mesaj.indexOf('a'));
        System.out.println(mesaj.lastIndexOf('a'));

        char[] karakterler = new char[mesaj.length()];
        mesaj.getChars(0,mesaj.length(), karakterler, 0);
        System.out.println(karakterler);

        System.out.println("-----------------------------");
        for (char karakter: karakterler) {
            System.out.print(karakter + "\t");
        }
        System.out.println("");
        System.out.println("---------------------------------");
        System.out.println(mesaj.replace(' ', '_'));
        System.out.println(mesaj.substring(2,5));

        for (String kelime : mesaj.split(" ")) {
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());

    }

    public static void miniProjeAsalSayi() {
        int number = 23;

        boolean isPrime = true;

        if (number == 1) {
            System.out.println("Asal sayi degildir!");
            return;
        }
        if (number < 1) {
            System.out.println("Negatif sayi giremezsin!");
            return;
        }

        for (int i = 2; i < number; i++ ) {
            if (number % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime) {
            System.out.println("Sayi asaldir!");
        } else {
            System.out.println("Sayi asal degildir!");
        }
    }

    public static void sesliHarfler() {
        char harf = 'A';

        switch (harf) {
            case 'A', 'I', 'O', 'U' -> System.out.println("Kalin sesli harf!");
            default -> System.out.println("Ince sesli harf");
        }
    }

    public static void MukemmelSayi() {
        //6 --> 1,2,3
        //28 --> 1,2,4,7,14

        int number = 28;
        int total = 0;

        for (int i = 1; i <number; i++) {
            if (number % i == 0)
                total = total + i;
        }

        if (total == number)
            System.out.println("Mukemmel sayidir!");
        else System.out.println("Mukemmel sayi degildir!");
    }

    public static void ArkadasSayi() {
        //220 - 284

        int sayi1 = 220;
        int sayi2 = 284;
        int toplam1 = 0;
        int toplam2 = 0;

        for (int i = 1; i< sayi1; i++) {
            if (sayi1 % i == 0)
                toplam1 = toplam1 + i;
        }

        for (int i = 1; i < sayi2; i++) {
            if (sayi2 % i == 0)
                toplam2 = toplam2 + i;
        }

        if (sayi1 == toplam2 && sayi2 == toplam2)
            System.out.println("Arkadas sayidir!");
        else
            System.out.println("Arkadas sayi degildir!");
    }

    public static void SayiBulma() {
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
            System.out.println("Sayiyi buldun!");
        else
            System.out.println("Sayiyi bulamadın");

    }
}