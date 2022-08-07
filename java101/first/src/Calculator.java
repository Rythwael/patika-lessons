import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int select;
        double n1,n2,result;
        Scanner input = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz");
        n1 = input.nextDouble();
        System.out.println("İkinci sayıyı giriniz");
        n2 = input.nextDouble();
        System.out.println("Yapmak istediğiniz İşlemi Seçiniz\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        select = input.nextInt();
        switch (select){
            case 1:
                result = n1+n2;
                System.out.println("Toplamın sonucu : " + result);
                break;
            case 2:
                result = n1-n2;
                System.out.println("Çıkarmanın sonucu : " + result);
                break;
            case 3:
                result = n1*n2;
                System.out.println("Çarpımın sonucu : " + result);
                break;
            case 4:
                result = n1/n2;
                System.out.println("Bölümün sonucu : " + result);
                break;
            default:
                System.out.println("Yanlış tuşlama yaptınız.");
        }
    }
}
