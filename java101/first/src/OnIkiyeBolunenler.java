import java.util.Scanner;

public class OnIkiyeBolunenler {
    public static void main(String[] args) {
        int number,count=0,total=0;
        double avg;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayıyı giriniz");
        number = input.nextInt();
        for (int i=0;i<=number;i++){
            if (i%12==0){
                count++;
                total += i;
            }
        }
        avg = total/count;
        System.out.print("12'ye bölünün sayıların ortalaması : " + avg);
    }
}
