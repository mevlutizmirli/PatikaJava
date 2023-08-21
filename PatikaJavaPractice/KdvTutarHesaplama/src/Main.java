import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double tutar  ;


        System.out.println("Ürün tutarını giriniz: ");
        tutar =input.nextDouble();
        double kdvOran = tutar <1000 ? 0.08 : 0.18;
        double kdvTutar = tutar * kdvOran;
        double kdvliTutar = tutar + kdvTutar;

        System.out.println("Kdv'siz Tutar: " + tutar);
        System.out.println("Kdv Oranı: " + kdvOran);
        System.out.println("Kdv Tutarı: " + kdvTutar);
        System.out.println("Kdv'li Tutarı: "+kdvliTutar);




    }
}