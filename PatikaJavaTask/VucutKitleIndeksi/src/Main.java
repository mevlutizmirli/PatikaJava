import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double height, kilo, indeks;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
        height = input.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz: ");
        kilo = input.nextDouble();

        indeks = kilo / (height* height);

        System.out.println("Vücut Kitle İndeksiniz :" + indeks);








    }
}