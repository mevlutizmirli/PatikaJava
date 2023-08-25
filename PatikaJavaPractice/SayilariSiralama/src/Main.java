import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double Number1, Number2, Number3;
        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayiyi giriniz: ");
        Number1 = input.nextDouble();

        System.out.print("İkinci sayiyi giriniz: ");
        Number2 = input.nextDouble();

        System.out.print("Üçüncü sayiyi giriniz: ");
        Number3 = input.nextDouble();

        if ((Number1 > Number2) && (Number1 > Number3)){
            if (Number2>Number3){
                System.out.println(Number1+ " > " +Number2+ " > " +Number3);
            }else {
                System.out.println(Number1+ " > " +Number3+ " > " +Number2);
            }

        } else if ((Number2 > Number1) && (Number2 > Number3)) {
            if (Number1 > Number3){
                System.out.println(Number2+ " > " +Number1+ " > " +Number3);
            }else {
                System.out.println(Number2+ " > " +Number1+ " > " +Number3);
            }

        } else if ((Number3 > Number1) && (Number3 > Number2)) {
            if (Number1 > Number2){
                System.out.println(Number3+ " > " +Number1+ " > " +Number2 );
            }else {
                System.out.println(Number3+ " > " +Number2+ " > " + Number1);

            }

        }


    }
}