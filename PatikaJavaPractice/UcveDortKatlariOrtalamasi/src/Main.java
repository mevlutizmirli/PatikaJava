import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int k, ortalama, toplam = 0, sayac = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz:");
        k = input.nextInt();

        for (int i = 1; i <= k; i++) {
            if (i % 3 == 0 && i % 4 == 0  ) {
                sayac++;
                toplam += i;
                System.out.println(i);
            }


        }
        ortalama = toplam/sayac;
        System.out.println("3 ve 4'e tam bölünen sayıların ortalamasını: " + ortalama);
    }
}