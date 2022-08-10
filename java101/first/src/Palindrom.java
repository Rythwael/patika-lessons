import java.util.Scanner;


public class Palindrom {
    static int reverse(int a){
        int revNum=0,tempNum;
        while (a!=0){
            tempNum = a%10;
            revNum*=10;
            revNum+=tempNum;
            a-=tempNum;
            a/=10;
        }

        return revNum;
    }
    public static void main(String[] args) {
        int n1,n2;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı giriniz : ");
        n1 = input.nextInt();
        n2 = reverse(n1);
        if (n1==n2){
            System.out.println(n1 + " bir palindrome sayıdır.");
        }
        else {
            System.out.println(n1 + " palindrome değildir!");
        }
    }
}
