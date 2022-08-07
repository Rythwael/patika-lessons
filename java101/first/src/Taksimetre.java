import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        double calcPrice,finalPrice;
        int km;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Mesafeyi KM Cinsinden Giriniz");
        km = input.nextInt();
        calcPrice = 10 + (km*2.2);
        finalPrice = calcPrice<20 ? 20 : calcPrice;
        System.out.println("Tutar : " + finalPrice);
    }
}
