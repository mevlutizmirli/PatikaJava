import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double maths, physical, turkish, chemistry, music, avarage;
        double valid= 0, validNumber =0;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        maths = input.nextDouble();
        if (maths>=0 && maths<=100){
            valid += maths;
            ++validNumber;
        }

        System.out.print("Fizik notunuzu giriniz: ");
        physical = input.nextDouble();
        if (physical>=0 && physical<=100){
            valid += physical;
            ++validNumber;
        }

        System.out.print("Türkçe notunuzu giriniz: ");
        turkish = input.nextDouble();
        if (turkish>=0 && turkish<=100){
            valid += turkish;
            ++validNumber;
        }

        System.out.print("Kimya notunuzu giriniz: ");
        chemistry = input.nextDouble();
        if (chemistry>=0 && chemistry<=100){
            valid += chemistry;
            ++validNumber;
        }

        System.out.print("Müzik notunuzu giriniz: ");
        music = input.nextDouble();
        if (music>=0 && music<=100){
            valid += music;
            ++validNumber;
        }

        avarage = valid/validNumber;

            if (avarage >= 55){
                System.out.println("Ortalamanız: " + avarage);
                System.out.println("Dersi geçtiniz...");
            }else {
                System.out.println("Dersten kaldınız..");
            }

        }
    }
