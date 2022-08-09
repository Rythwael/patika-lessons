import java.util.Scanner;

public class MinMaxDeger {
    public static void main(String[] args) {
        int n,min=0,max=0,tempMax=0,tempMin=0,count=1,curr=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç sayı gireceksiniz");
        n = input.nextInt();
        while (count<=n){
            System.out.print("Sayıyı giriniz : ");
            curr=input.nextInt();
            count++;
            if (curr < tempMin ){
                if (tempMax == 0){
                    tempMax = curr;
                }
                tempMin = curr;

            } else if (curr > tempMax) {
                if (tempMin == 0){
                    tempMin = curr;
                }
                tempMax = curr;
            }

        }
        min=tempMin;
        max=tempMax;
        System.out.println("Max : " + max + "\nMin : " + min);
    }
}
