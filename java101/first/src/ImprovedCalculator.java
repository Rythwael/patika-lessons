import java.util.Scanner;

public class ImprovedCalculator {
    static int sum(int a,int b){
        return a+b;
    }
    static int sub(int a,int b){
        return a-b;
    }
    static int mul(int a,int b){
        return a*b;
    }
    static int div(int a,int b){
        return a/b;
    }
    static int mod(int a,int b){
        return a%b;
    }
    static int pow(int a,int b){
        int res=1;
        for (int i=0;i<b;i++){
            res*=a;
        }
        return res;
    }
    static int fac(int a){
        if (a==1 || a==0){
            return 1;
        }
        return a*fac(a-1);
    }
    static void rec(int a,int b){
        System.out.println("Alan : " + (a*b));
        System.out.println("Çevre : " + (2*(a+b)));
    }

    public static void main(String[] args) {
        int select,n1,n2;
        Scanner input= new Scanner(System.in);
        System.out.println("Yapmak istediğiniz işlemi seçiniz\n1-Toplama\n2-Çıkarma" +
                "\n3-Çarpma\n4-Bölme\n5-Mod Alma\n6-Üs hesaplama\n7-Dikdörtgen Alan ve Çevresi\n8-Faktoriyel");
        select = input.nextInt();
        switch (select){
            case 1:
                System.out.print("Birinci Sayı : ");
                n1=input.nextInt();
                System.out.print("İkinci Sayı : ");
                n2=input.nextInt();
                System.out.println(sum(n1,n2));
                break;
            case 2:
                System.out.print("Birinci Sayı : ");
                n1=input.nextInt();
                System.out.print("İkinci Sayı : ");
                n2=input.nextInt();
                System.out.println(sub(n1,n2));
                break;
            case 3:
                System.out.print("Birinci Sayı : ");
                n1=input.nextInt();
                System.out.print("İkinci Sayı : ");
                n2=input.nextInt();
                System.out.println(mul(n1,n2));
                break;
            case 4:
                System.out.print("Birinci Sayı : ");
                n1=input.nextInt();
                System.out.print("İkinci Sayı : ");
                n2=input.nextInt();
                System.out.println(div(n1,n2) );
                break;
            case 5:
                System.out.print("Birinci Sayı : ");
                n1=input.nextInt();
                System.out.print("İkinci Sayı : ");
                n2=input.nextInt();
                System.out.println(mod(n1,n2));
                break;
            case 6:
                System.out.print("Birinci Sayı : ");
                n1=input.nextInt();
                System.out.print("İkinci Sayı : ");
                n2=input.nextInt();
                System.out.println(pow(n1,n2));
                break;
            case 7:
                System.out.print("Birinci Sayı : ");
                n1=input.nextInt();
                System.out.print("İkinci Sayı : ");
                n2=input.nextInt();
                rec(n1,n2);
                break;
            case 8:
                System.out.print("Sayıyı girin : ");
                n1=input.nextInt();
                System.out.println(fac(n1));
                break;
            default:
                System.out.println("Yanlış tuşlama yaptınız");
        }
    }
}
