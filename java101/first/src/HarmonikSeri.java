import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        double num,total=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayıyı giriniz");
        num = input.nextInt();
        for (double i=1;i<=num;i++){
            total+=(1/i);
        }
        System.out.println("Sonuç : " + total);
    }
}
