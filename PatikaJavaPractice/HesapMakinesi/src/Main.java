import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       double number1, number2;
       int select;

        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        number1 = input.nextDouble();
        System.out.print("İkinci sayıyı giriniz: ");
        number2 = input.nextDouble();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        select = input.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplam: " + (number1 + number2));
                break;
            case 2:
                System.out.println("Çıkarma: " + (number1 - number2));
                break;
            case 3:
                System.out.println("Çarpma: " + (number1 * number2));
                break;
            case 4:
                System.out.println("Bölme: " + (number1 / number2));
                break;

            default:
                System.out.println("Hatalı giriş yaptınız...");

        }
    }
}