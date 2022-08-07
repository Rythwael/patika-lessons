import java.util.Scanner;

public class VücutKitleEndeksi {
    public static void main(String[] args) {
        double m,kg,endeks;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Kilonuzu Giriniz");
        kg = input.nextDouble();
        System.out.println("Lütfen Boyunuzu Metre Cinsinden Giriniz");
        m = input.nextDouble();
        endeks = kg/Math.pow(m,2);
        System.out.println("Vücut Kitle Endeksiniz : " + endeks);
    }
}
