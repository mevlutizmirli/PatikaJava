import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int k, toplam = 0;

        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Sayı giriniz: ");
            k = input.nextInt();

                if (k % 2 == 0 && k % 4 == 0){
                    toplam+=k;
                }


        }while (k % 2 != 1 && k > 0);

        System.out.println("Toplam: " + toplam);

        }

    }

