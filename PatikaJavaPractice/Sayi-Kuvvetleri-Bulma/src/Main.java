import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int i = 1, j =1;
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        num = input.nextInt();

        System.out.println("4 ün kuvvetleri: ");
        while (i<=num){

            System.out.println(i);
            i*=4;

        }
        System.out.println("5 in kuvvetleri");
        while (j<=num){
            System.out.println(j);
            j*=5;
        }




}
}