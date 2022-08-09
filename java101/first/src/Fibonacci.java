import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int tempSum,num,first=0,second=1;
        System.out.print("Eleman sayısını giriniz : ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        System.out.print("\n0 1 ");
        for (int i=0;i<num-1;i++){
            tempSum=first+second;
            System.out.print(tempSum + " ");
            first = second;
            second = tempSum;
        }
    }
}
