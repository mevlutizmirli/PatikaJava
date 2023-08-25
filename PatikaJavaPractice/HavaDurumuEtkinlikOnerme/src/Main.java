import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double heat;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen hava sıcaklığını giriniz: ");
        heat = input.nextDouble();

        if (heat < 5){
            System.out.println("Kayak yapmaya gidebilirsiniz");
        }
        else if (heat <= 25){
            if (heat <= 15 ){
                System.out.println("Sinemaya gidebilirsiniz");
            }if (heat >= 10){
                System.out.println("Pikniğe gidebilirsiniz");
            }
        }else {
            System.out.println("Yüzmeye gidebilirsiniz");
        }

    }
}