import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      int r,a;
      double area, perimeter, circleSlice, pi = 3.14;

      Scanner input = new Scanner(System.in);

      System.out.println("Dairenin yarıçapını giriniz: ");
      r = input.nextInt();
      System.out.println("Dairenin merkez açısını giriniz: ");
      a = input.nextInt();

      area = pi * r * r;
      perimeter = 2 * pi* r;
      circleSlice = (area * a) / 360;

      System.out.println("Dairenin Alanı: " + area);
      System.out.println("Dairenin Çevresi: " + perimeter);
      System.out.println("Dairenin Dilim Alanı: " + circleSlice);










    }
}