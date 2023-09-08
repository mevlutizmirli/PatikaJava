import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, password;
        Scanner input = new Scanner(System.in);
        int right =3;
        int balance = 1500;
        int select;

        while (right >0){
            System.out.print("Kullanıcı adını giriniz: ");
            userName = input.nextLine();
            System.out.print("Şifreyi giriniz: ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")){
                System.out.println("** Patika Bankasına Hoşgeldiniz ** ");
               do {

                   System.out.println("1-Para yatırma \n" +
                           "2-Para çekme\n" +
                           "3-Bakiye sorgulama\n" +
                           "4-Çıkış yap");
                   System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                   select = input.nextInt();

                  switch (select){
                      case 1:
                          System.out.print("Yatırmak istediğiniz tutarı giriniz: ");
                          int price = input.nextInt();
                          balance+=price;
                          break;
                      case 2:
                          System.out.print("Çekmek istediğiniz tutarı giriniz: ");
                          int price2 = input.nextInt();
                          if (price2 > balance){
                              System.out.println("Yetersiz bakiye");

                          }else {
                              balance-=price2;
                          }break;
                      case 3:
                          System.out.println("Bakiyeniz: " + balance);
                          break;
                  }

               }while (select !=4);
                System.out.println("Çıkış yaptınız...");
               break;
            }
            else{
                right--;
                System.out.println("Hatalı giriş yaptınız.Tekrar deneyiniz.");
                if (right ==0) {
                    System.out.println("Hesabınız bloke olmuştur.");
                }
                else {
                    System.out.print("Kalan hakkınız: "+ right +"\n");
                }

            }

        }


    }
}