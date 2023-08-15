import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int year;
        String zodiac;

        Scanner input = new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz: ");
        year = input.nextInt();

        year= year % 12;

        switch (year){
            case 0:
                zodiac = "Maymun";
                System.out.println("Çin Zodyağı Burcunuz: " +zodiac);
                break;
            case 1:
                zodiac = "Horoz";
                System.out.println("Çin Zodyağı Burcunuz: " +zodiac);
                break;
            case 2:
                zodiac = "Köpek";
                System.out.println("Çin Zodyağı Burcunuz: " +zodiac);
                break;
            case 3:
                zodiac = "Domuz";
                System.out.println("Çin Zodyağı Burcunuz: " +zodiac);
                break;
            case 4:
                zodiac = "Fare";
                System.out.println("Çin Zodyağı Burcunuz: " +zodiac);
                break;
            case 5:
                zodiac = "Öküz";
                System.out.println("Çin Zodyağı Burcunuz: " +zodiac);
                break;
            case 6:
                zodiac = "Kaplan";
                System.out.println("Çin Zodyağı Burcunuz: " +zodiac);
                break;
            case 7:
                zodiac = "Tavşan";
                System.out.println("Çin Zodyağı Burcunuz: " +zodiac);
                break;
            case 8:
                zodiac = "Ejderha";
                System.out.println("Çin Zodyağı Burcunuz: " +zodiac);
                break;
            case 9:
                zodiac = "Yılan";
                System.out.println("Çin Zodyağı Burcunuz: " +zodiac);
                break;
            case 10:
                zodiac = "At";
                System.out.println("Çin Zodyağı Burcunuz: " +zodiac);
                break;
            case 11:
                zodiac = "Koyun";
                System.out.println("Çin Zodyağı Burcunuz: " +zodiac);
                break;
            default:


        }
    }
}