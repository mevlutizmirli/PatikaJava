import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Double x,y,z,u,alan;

        System.out.println("Üçgenin Kenar Uzunluğunu Giriniz: ");
        Scanner input = new Scanner(System.in);
        x = input.nextDouble();
        System.out.println("Üçgenin Kenar Uzunluğunu Giriniz: ");
        y = input.nextDouble();
        System.out.println("Üçgenin Kenar Uzunluğunu Giriniz: ");
        z = input.nextDouble();

        u = (x+y+z)/2;

        alan = Math.sqrt(u*(u-x)*(u-y)*(u-z));

        System.out.println("Üçgenin Alanı: " + alan);













    }
}