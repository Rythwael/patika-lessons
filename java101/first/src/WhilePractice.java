import java.util.Scanner;

public class WhilePractice {
    public static void main(String[] args) {
        int num=0,total=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz");
        while (num%2==0){
            num = input.nextInt();
            if (num%4==0){
                total += num;
            }
        }
        System.out.println("4'ün katı olan sayıların toplamı = " + total);
    }
}
