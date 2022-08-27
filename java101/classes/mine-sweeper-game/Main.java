import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("-Mayın Tarlasına Hoşgeldiniz-");
        System.out.println("Oyun boyutunu giriniz");
        System.out.print("Satır : ");
        int row = s.nextInt();
        System.out.print("Sütun : ");
        int col = s.nextInt();
        MineSweeper m = new MineSweeper(row,col);
        m.run();
    }
}
