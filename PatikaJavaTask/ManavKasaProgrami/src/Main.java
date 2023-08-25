import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double pearCost, pearKg, pear = 2.14;
        double appleCost, appleKg, apple = 3.67;
        double tomatoesCost, tomatoesKg, tomatoes = 1.11;
        double bananaCost, bananaKg, banana = 0.95;
        double aubergineCost, aubergineKg, aubergine = 5;
        double total;



        Scanner input = new Scanner(System.in);

        System.out.println("Armut kaç kilo: ");
        pearKg = input.nextDouble();
        pearCost = pearKg * 2.14;

        System.out.println("Elma kaç kilo: ");
        appleKg = input.nextDouble();
        appleCost = appleKg * 3.67;

        System.out.println("Domates kaç kilo: ");
        tomatoesKg = input.nextDouble();
        tomatoesCost = tomatoesKg * 1.11;

        System.out.println("Muz kaç kilo: ");
        bananaKg = input.nextDouble();
        bananaCost = bananaKg * 0.95;

        System.out.println("Patlıcan kaç kilo");
        aubergineKg  =input.nextDouble();
        aubergineCost = aubergineKg * 5;

        total = (pearCost + appleCost + tomatoesCost + bananaCost + aubergineCost  );

        System.out.println("Toplam tutar: " + total);



    }
}