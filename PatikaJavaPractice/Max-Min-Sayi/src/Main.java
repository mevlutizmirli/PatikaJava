import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        int totalNumber = input.nextInt();


        int max = 0;
        int min = totalNumber;


        for(int i = 1; i<=totalNumber; i++){
            System.out.println("Sayı değerini giriniz: ");
            int number = input.nextInt();

            if (number > max){
                max = number;
            }

            else if (number <min){
                min = number;
            }

        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçün sayı: " + min);
    }
}