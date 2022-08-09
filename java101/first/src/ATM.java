import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        String username="patika",password="dev123",inputUsername,inputPassword;
        int failCount=3,balance=1500,select,deposit,withdraw;
        boolean session=false;
        Scanner input = new Scanner(System.in);
        while (failCount>0){
            System.out.print("Kullanıcı Adınız : ");
            inputUsername = input.next();
            System.out.print("Şifreniz : ");
            inputPassword = input.next();
            if (inputUsername.equals(username) && inputPassword.equals(password)){
                session = true;
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz");
                while (session){
                    System.out.println("Yapmak istediğiniz işlemi seçiniz\n" +
                            "1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgulama\n" +
                            "4-Çıkış Yap");
                    select = input.nextInt();
                    switch (select){
                        case 1:
                            System.out.println("Bakiyeniz : " + balance);
                            System.out.print("Yatırmak istediğiniz miktarı giriniz : ");
                            deposit = input.nextInt();
                            if (deposit<0){
                                System.out.println("Hatalı değer girdiniz.");
                            }else {
                                balance += deposit;
                                System.out.println("Yeni Bakiyeniz : " + balance);
                            }
                            break;
                        case 2:
                            System.out.println("Bakiyeniz : " + balance);
                            System.out.print("Çekmek istediğiniz miktarı giriniz : ");
                            withdraw = input.nextInt();
                            if (withdraw>balance){
                                System.out.println("Yetersiz Bakiye!");
                            }else {
                                balance -=withdraw;
                                System.out.println("Kalan bakiyeniz : " + balance);
                            }
                            break;
                        case 3:
                            System.out.println("Mevcut Bakiyeniz : " + balance);
                            break;
                        case 4:
                            System.out.println("Bizi tercih ettiğiniz için teşekkürler");
                            session = false;
                            break;
                        default:
                            System.out.println("Yanlış tuşlama yaptınız");
                    }
                }

            }
            else {
                failCount--;
                System.out.println("Yanlış kullanıcı adı veya şifre girdiniz. Tekrar deneyiniz");
                if (failCount==0){
                    System.out.println("Hesabınız bloke olmuştur.");
                }else {
                    System.out.println("Kalan hakkınız : " + failCount);
                }
            }
        }


    }
}
