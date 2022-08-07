import java.util.Scanner;

public class KDVCalculate {
    public static void main(String[] args) {
        double kdv,price,kdvPrice;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Ürünün Fiyatını Giriniz");
        price = input.nextDouble();
        kdv = price>1000 ? 0.08 : 0.18;
        kdvPrice = price*(1+kdv);
        System.out.println("Ürünün KDV'siz tutarı : " + price);
        System.out.println("Ürünün KDV Değeri : " + kdv);
        System.out.println("Ürünün KDV'li tutarı : " + kdvPrice);
    }
}
