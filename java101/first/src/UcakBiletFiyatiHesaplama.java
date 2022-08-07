import java.util.Scanner;

public class UcakBiletFiyatiHesaplama {
    public static void main(String[] args) {
        int distance,age,type;
        double distancePrice,finalPrice;
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi KM cinsinden giriniz :");
        distance = input.nextInt();
        System.out.print("Yaşınız : ");
        age = input.nextInt();
        System.out.println("Yolculuk tipini seçiniz\n1-Tek yön\n2-Gidiş-Dönüş");
        type = input.nextInt();
        if (distance<0 || age<0 || type<=0 || type>2){
            System.out.println("Hatalı veri girdiniz");
        } else {
            distancePrice = 0.1*distance;
            if (age<12){
                distancePrice *= 0.5;
            } else if (age<=24) {
                distancePrice *= 0.9;
            } else if (age>=65) {
                distancePrice *= 0.7;
            }
            if (type==2){
                finalPrice = distancePrice*0.8*2;
            }else {
                finalPrice = distancePrice;
            }
            System.out.print("Bilet tutarınız : " + finalPrice + " TL");
        }
    }
}
