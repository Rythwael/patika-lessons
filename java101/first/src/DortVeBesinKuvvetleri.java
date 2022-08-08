import java.util.Scanner;

public class DortVeBesinKuvvetleri {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayıyı giriniz");
        num = input.nextInt();
        for (int i=0;i<num;i++){
            if (i%5==0 || i%4==0){
                System.out.print(i + " ");
            }
        }
    }
}
