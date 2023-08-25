import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       String userName, password, select,newPassword ;

       Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adını giriniz: ");
        userName = input.nextLine();
        System.out.print("Şifreyi giriniz: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java101")){

            System.out.println("Giriş yapıldı...");
        } else if (!(userName.equals("patika")) && !(password.equals("java101"))) {
            System.out.println("Kullanıcı adı veya şifte hatalı. Tekrar deneyiniz...");
        } else if (!(userName.equals("patika")) && (password.equals("java101"))) {
            System.out.println("Kullanıcı adı hatalı tekrar deneyiniz... ");

        }else if ((userName.equals("patika")) && !(password.equals("java101"))){
            System.out.println("Şifre hatalı. Şifreyi sıfırlamak istermisiniz..\n1-Evet\n2-Hayır");
            select = input.nextLine();
            if (select.equals("1")){
                System.out.print("Yeni şifre giriniz:");
                newPassword = input.nextLine();
            if (!(newPassword.equals("java101"))){
                System.out.println("Şifreniz değiştirilmiştir.");
            }else {
                System.out.println("Şifreniz eski şifre ile aynı olamaz. Tekrar deneyiniz.");
            }

            }else  {
                System.out.println("Giriş sayfasına yönlendiriliyorsunuz...");

        }

        }

        }

    }

