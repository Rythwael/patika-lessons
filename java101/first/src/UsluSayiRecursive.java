import java.util.Scanner;

public class UsluSayiRecursive {

    static int pow(int a,int b){
        if (b==0){
            return 1;
        }
        return a*pow(a,b-1);
    }
    public static void main(String[] args) {
        int num,power;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı giriniz : ");
        num = input.nextInt();
        System.out.print("Kuvveti giriniz : ");
        power = input.nextInt();
        System.out.println(pow(num,power));

    }
}
