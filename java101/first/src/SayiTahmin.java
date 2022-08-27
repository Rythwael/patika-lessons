import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahmin {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int number = rand.nextInt(100);
        int life = 0;
        int selected;
        int[] wrongAns = new int[5];
        System.out.println("-Sayı Tahmin Oyununa Hoşgeldiniz-");
        while (life<5){
            System.out.print("Sayıyı giriniz : ");
            selected = input.nextInt();
            if (selected<0 || selected>100){
                System.out.println("0 ve 100 arasında bir değer giriniz!");
            } else {
                if (selected!=number){
                    wrongAns[life]=selected;
                    life++;
                    if (life==5){
                        System.out.println("Kaybettiniz. Doğru sayı : " + number);
                        System.out.println("Verdiğiniz Cevaplar :");
                        System.out.println(Arrays.toString(wrongAns));
                        break;
                    }
                    if (selected<number){
                        System.out.println("Tahmininiz " + selected + " gizli sayıdan küçüktür.");
                    } else {
                        System.out.println("Tahmininiz " + selected + " gizli sayıdan büyüktür.");
                    }
                    System.out.println("Yanlış tahminde bulundunuz. Kalan Hakkınız : " + (5-life));
                }else {
                    System.out.println("Tebrikler, doğru tahmin ettiniz. Tahmininiz : " + selected);
                    break;
                }
            }



        }

    }
}
