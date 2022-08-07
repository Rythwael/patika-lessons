import java.util.Scanner;

public class ucgenAlan {
    public static void main(String[] args) {
        double alan,u,birinciKnr,ikinciKnr,ucuncuKnr;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen üçgenin 1.Kenar uzunluğunu giriniz");
        birinciKnr = input.nextDouble();
        System.out.println("Lütfen üçgenin 2.Kenar uzunluğunu giriniz");
        ikinciKnr = input.nextDouble();
        System.out.println("Lütfen üçgenin 3.Kenar uzunluğunu giriniz");
        ucuncuKnr = input.nextDouble();
        u = (birinciKnr+ikinciKnr+ucuncuKnr)/2;
        alan = Math.sqrt(u*(u-birinciKnr)*(u-ikinciKnr)*(u-ucuncuKnr));
        System.out.println("Üçgenin alanı : " + alan);
    }
}
