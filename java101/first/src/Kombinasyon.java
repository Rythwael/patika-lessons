import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        int n,r,nFac=1,rFac=1,nrFac=1;
        double result;
        Scanner input = new Scanner(System.in);
        System.out.println("N değerini belirleyiniz");
        n=input.nextInt();
        System.out.println("r değerini belirleyiniz");
        r=input.nextInt();

        for (int i=1;i<=n;i++){
            nFac *= i;
        }
        for (int x=1;x<=r;x++){
            rFac *= x;
        }
        for (int y=1;y<=(n-r);y++){
            nrFac *= y;
        }
        result = nFac/(rFac*nrFac);
        System.out.println("Sonuç : " + result);
    }
}
