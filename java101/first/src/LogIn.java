import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        String username = "admin",password = "pass",logInUsername,logInPassword,newPassword;
        int select;
        Scanner input = new Scanner(System.in);
                System.out.println("Kullanıcı adınız");
                logInUsername = input.next();
                System.out.println("Şifreniz");
                logInPassword = input.next();
                if(logInUsername.equals(username) && logInPassword.equals(password)){
                    System.out.println("Giriş başarılı");
                }else{
                    System.out.println("Yanlış Kullanıcı adı veya Şifre");
                    System.out.println("Şifrenizi sıfırlamak ister misiniz?\n1-Evet\n2-Hayır");
                    select = input.nextInt();
                    if (select == 1){
                        System.out.println("Yeni şifrenizi giriniz");
                        newPassword = input.next();
                        if (newPassword.equals(password)){
                            System.out.println("Yeni şifreniz eski şifrenizle aynı olamaz");
                        }else{
                            password = newPassword;
                            System.out.println("Şifre yenilendi.");
                        }
                }

        }
    }
}
