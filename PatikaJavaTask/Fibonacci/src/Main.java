import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç elemanlı fibonacci dizisi istiyorsunuz : ");
        int n = input.nextInt();

        int firstNumber = 0;
        int secondNumber = 1;


        for (int i = 1; i <= n; i++){
            System.out.print(firstNumber+" ");
            int total = firstNumber+secondNumber;
            firstNumber=secondNumber;
            secondNumber=total;

        }

    }
}