import java.util.Scanner;

public class AvgNote {
    public static void main(String[] args) {
        double phy,chem,tr,his,mus;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Fizik notunu giriniz");
        phy = input.nextInt();
        System.out.println("Lütfen Kimya notunu giriniz");
        chem = input.nextInt();
        System.out.println("Lütfen Türkçe notunu giriniz");
        tr = input.nextInt();
        System.out.println("Lütfen Tarih notunu giriniz");
        his = input.nextInt();
        System.out.println("Lütfen Müzik notunu giriniz");
        mus = input.nextInt();
        double avg = (phy+chem+tr+his+mus)/5;
        System.out.println("Ortalamanız : " + avg);
        String result = avg>=60 ? "Sınıf Geçtiniz!" : "Sınıfta Kaldınız!";
        System.out.println(result);
    }
}
