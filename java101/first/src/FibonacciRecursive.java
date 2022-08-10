import java.util.Scanner;

public class FibonacciRecursive {

    static int fibonacci(int a){
        if (a==1||a==2){
            return 1;
        }
        return fibonacci(a-1)+fibonacci(a-2);
    }
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Elemena sayısını giriniz");
        num=input.nextInt();
        System.out.print(fibonacci(num));

    }
}
