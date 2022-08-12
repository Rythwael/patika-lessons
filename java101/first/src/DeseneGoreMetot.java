import java.util.Scanner;

public class DeseneGoreMetot {
    static void desen(int a,int b,int c){
            if (b<=-5) {
                c = 1;
                b+=10;
            }
            if (c==1){
                System.out.print(b + " ");
                if (a==b){
                    System.out.println("");
                }else {
                    desen(a, b + 5, c);
                }
            }else {
                System.out.print(b + " ");
                desen(a,b-5,c);
            }

    }
    public static void main(String[] args) {
        int n1,n2,count=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayıyı giriniz");
        n1 = input.nextInt();
        n2=n1;
        desen(n1,n2,count);
    }
}
