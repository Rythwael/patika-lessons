import java.util.Scanner;

public class DaireDilimAlani {
    public static void main(String[] args) {
        double r,a,area;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Yarıçapı CM Cinsinden Giriniz");
        r = input.nextDouble();
        System.out.println("Lütfen Merkez Açı Ölçüsünü Giriniz");
        a = input.nextDouble();
        area = (3.14*Math.pow(r,2)*a)/360;
        System.out.println("Daire Diliminin Alanı : " + area);
    }
}
