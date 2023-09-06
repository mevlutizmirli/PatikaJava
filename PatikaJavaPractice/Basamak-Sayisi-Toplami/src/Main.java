import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int counter=0,result = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int k = input.nextInt();

        while (k != 0) {
            counter=k%10;
            k=k/10;
            result=result+counter;



        }

        System.out.println("Basamakları toplamı: " +result);




    }
}