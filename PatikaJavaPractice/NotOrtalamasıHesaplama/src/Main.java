import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //değişkenleri oluştur.
        int  matematik, fizik, kimya, turkce, tarih, muzik;

        //Scanner sıfını tanımlandı.
        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz: ");
        matematik = input.nextInt();

        System.out.println("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();

        System.out.println("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();

        System.out.println("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();

        System.out.println("Tarih notunuzu giriniz: ");
        tarih = input.nextInt();

        System.out.println("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();

        double toplam = (matematik+fizik+kimya+turkce+tarih+muzik);
        double sonuc = toplam/6;


        System.out.println("Ortalamanız: " + sonuc);
        System.out.println(sonuc >= 60 ? "Sınıfı Geçtiniz: " : "Sınıfta Kaldınız");
    }
}