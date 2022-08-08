import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);
        System.out.println("Yılı giriniz");
        year = input.nextInt();
        if (year%4==0){
            if (year%100==0){
                if (year%400==0){
                    System.out.println(year + " artık yıldır.");
                }else {
                    System.out.println(year + " artık yıl değildir.");
                }
            }else {
                System.out.println(year + " artık yıldır.");
            }
        } else {
            System.out.println(year + " artık yıl değildir.");
        }
    }
}
