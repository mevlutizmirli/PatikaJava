import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int month, day;
        String horoscope = "";
        boolean isError = false;
        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz ayı giriniz: ");
        month = input.nextInt();
        System.out.print("Doğduğunuz günü giriniz: ");
        day = input.nextInt();

        if ((day >=1 && day <= 31)&& (month >=1 && month <= 12)){
            if(month == 1) {
                if(day < 22){
                    System.out.println("Oğlak burcusunuz...");
                }else {
                    System.out.println("Kova burcusunuz...");
                }

            } else if (month == 2) {
                if (day < 20){
                    System.out.println("Kova burcusunuz...");
                }else {
                    System.out.println("Balık burcusunuz");
                }

            } else if (month == 3) {
                if (day < 21){
                    System.out.println("Balık burcusunuz...");
                }else {
                    System.out.println("Koç burcusunuz...");
                }

            } else if (month == 4) {
                if (day < 21) {
                    System.out.println("Koç burcusunuz...");
                }else {
                    System.out.println("Boğa burcusunuz...");
                }

            } else if (month == 5) {
                if (day < 22){
                    System.out.println("Boğa burcusunuz...");
                }else {
                    System.out.println("İkizler burcusunuz...");
                }

            } else if (month == 6) {
                if (day < 23) {
                    System.out.println("İkizler burcusunuz...");
                }else {
                    System.out.println("Yengeç burcusunuz...");
                }

            } else if (month ==7) {
                if (day < 23 ){
                    System.out.println("Yengeç burcusunuz...");
                }else {
                    System.out.println("Aslan burcusunuz...");
                }

            } else if (month == 8) {
                if (day < 23){
                    System.out.println("Aslan burcusunuz...");
                }else {
                    System.out.println("Başak burcusunuz....");
                }

            } else if (month == 9) {
                if (day <23){
                    System.out.println("Başak burcusunuz...");
                }else {
                    System.out.println("Terazi burcusunuz...");
                }

            } else if (month == 10) {
                if (day < 23){
                    System.out.println("Terazi burcusunuz...");
                }else {
                    System.out.println("Akrep burcusunuz...");
                }

            } else if (month == 11) {
                if (day < 22){
                    System.out.println("Akrep burcusunuz...");
                }else
                    System.out.println("Yay burcusunuz...");

            } else if (month == 12) {
                if (day < 22){
                    System.out.println("Yay burcusunuz...");
                }else {
                    System.out.println("Oğlak burcusumuz...");
                }

            }

        }else {
            System.out.println("Hatalı giriş yaptınız...");
        }



    }
}