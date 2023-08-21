import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double km, total, perKm = 2.20, startPrice = 10;

        Scanner input = new Scanner(System.in);
        System.out.println("Mesafeyi Km cinsinden giriniz: ");
        km = input.nextDouble();

        total = (km * perKm);
        total += startPrice;

        total = (total < 20) ? 20 : total;

        System.out.println("Toplam tutar : " + total);

    }
}