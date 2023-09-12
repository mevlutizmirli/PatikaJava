import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num, sum=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayını giriniz: ");
        num = input.nextInt();

        for (int i =1; i < num; i++){
            if(num%i ==0){
                sum+=i;
            }
        }

        if(sum==num){
            System.out.println("Bu sayı mükemmel sayıdır");
        }else {
            System.out.println("Buu sayı mükemmel sayı değildir.");
        }




    }
}