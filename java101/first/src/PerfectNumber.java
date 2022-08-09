import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int num,total=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayıyı giriniz");
        num = input.nextInt();
        for (int i=1;i<num;i++){
            if (num%i==0){
                total+=i;
            }
        }
        if (num==total){
            System.out.println(num + " mükemmel bir sayıdır.");
        } else {
            System.out.println(num + " mükemmel bir sayı değildir.");
        }
    }
}
