import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n,r;
        int nTotal=1;
        int rTotal=1;
        int cTotal=1;
        int y;

        Scanner input = new Scanner(System.in);
        System.out.println("Eleman sayısını giriniz (n): ");
        n = input.nextInt();

        System.out.println("Seçim sayısını giriniz: (r): ");
        r = input.nextInt();

        y = n-r;

        for (int i=1; i<=n; i++ ){
            nTotal= nTotal * i;
        }
        for (int j=1; j<=r; j++){
            rTotal= rTotal * j;
        }
        for (int k=1; k<=y; k++){
            cTotal= cTotal * k;
        }

        int combination = nTotal / (rTotal * cTotal);
        System.out.println("C("+n+","+r+") = " +combination);

    }
}