import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklığı giriniz : ");
        heat = input.nextInt();
        if (heat<5){
            System.out.println("Kayak yapabilirsiniz.");
        } else if (heat<=15) {
            System.out.println("Sinemaya gidebilirsin.");
        } else if (heat<=25) {
            System.out.println("Pikniğe gidebilirsin.");
        } else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
