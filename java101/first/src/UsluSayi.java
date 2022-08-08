import java.sql.SQLOutput;
import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        int num,pow,result=1;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayıyı giriniz");
        num = input.nextInt();
        System.out.println("Kuvveti giriniz");
        pow = input.nextInt();
        for (int i=0;i<pow;i++){
            result *= num;
        }
        System.out.println(num + " üzeri " + pow + " = " + result);
    }
}
