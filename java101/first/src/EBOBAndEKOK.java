import java.util.Scanner;

public class EBOBAndEKOK {
    public static void main(String[] args) {
        int a,b,ebob=1,ekok=1,ebobCount=1;
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz");
        a = input.nextInt();
        System.out.println("İkinci sayıyı giriniz");
        b = input.nextInt();
        if (a<b){
            while (ebobCount<a){
                ebobCount++;
                if (a%ebobCount==0 && b%ebobCount==0){
                    ebob = ebobCount;
                    ekok = a*b/ebob;
                }
            }
        } else if (a==b) {
            System.out.println("Ebob ve Ekok : " + a);
        } else {
            while (ebobCount<b){
                ebobCount++;
                if (a%ebobCount==0 && b%ebobCount==0){
                    ebob = ebobCount;
                    ekok = a*b/ebob;
                }
            }
        }
        System.out.println("Ebob : " + ebob + "\nEkok : " + ekok);
    }
}
