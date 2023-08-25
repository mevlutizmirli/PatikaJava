import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double cost, km, costPerKm= 0.10;
        int age, typeOfTrip;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: ");
        km = input.nextDouble();

        System.out.print("Yaşınızı giriniz: ");
        age = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş): ");
        typeOfTrip = input.nextInt();

        cost = km * costPerKm;

        if ((age>0) && (km >0 )&& (typeOfTrip ==1 || typeOfTrip==2)){
            if (age < 12){
                cost -= cost*0.5;

            } else if (age >= 12 && age < 24) {
                cost -= cost*0.1;
                
            } else if (age > 65) {
                cost -= cost*0.3;

            }if (typeOfTrip == 2){
                cost -= cost*0.2;
                cost *=2;
            }
            System.out.println("Toplam Tutar: " +cost+ "Tl");

        }else {
            System.out.println("Hatalı Veri Girdiniz !");
        }



    }
}