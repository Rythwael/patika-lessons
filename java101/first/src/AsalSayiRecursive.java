import java.util.Scanner;

public class AsalSayiRecursive {

    static int asalSayi(int a,int b){
        if (a==2){
            return 0;
        } else if (a%b==0){
            if (b<2) {
                return 1;
            }
            return 0;
        }

        return asalSayi(a,b-1);

    }
    public static void main(String[] args) {
        int num,div,con;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayıyı giriniz");
        num=input.nextInt();
        div=num-1;
        con = asalSayi(num,div);
        if (con == 0) {
            System.out.println(num + " bir asal sayı değildir.");
        } else {
            System.out.println(num+ " bir asal sayıdır.");
        }

    }
}
