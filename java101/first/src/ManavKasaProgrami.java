import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        double armut = 2.14,elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00,totalPrice;
        int aKilo,eKilo,dKilo,mKilo,pKilo;
        Scanner input = new Scanner(System.in);
        System.out.println("Armut kilo : ");
        aKilo = input.nextInt();
        System.out.println("Elma kilo : ");
        eKilo = input.nextInt();
        System.out.println("Domates kilo : ");
        dKilo = input.nextInt();
        System.out.println("Muz kilo : ");
        mKilo = input.nextInt();
        System.out.println("Patlıcan kilo : ");
        pKilo = input.nextInt();
        totalPrice = (armut*aKilo) + (elma*eKilo) + (domates*dKilo) + (muz*mKilo) + (patlican*pKilo);
        System.out.println("Armut Kaç Kilo ? : "+aKilo);
        System.out.println("Elma Kaç Kilo ? : "+eKilo);
        System.out.println("Domates Kaç Kilo ? : "+dKilo);
        System.out.println("Muz Kaç Kilo ? : "+mKilo);
        System.out.println("Patlıcan Kaç Kilo ? : "+pKilo);
        System.out.println("Toplam Tutar : "+totalPrice);


    }
}
