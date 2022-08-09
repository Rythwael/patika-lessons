import java.util.Scanner;

public class BasamakSayilari {
    public static void main(String[] args) {
        int num,total=0,basamakSayisi=1,tempNum,lastNum=0,currentNum;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayıyı giriniz");
        num = input.nextInt();
        tempNum=num;
        while (tempNum/10!=0){
            basamakSayisi++;
            tempNum/=10;
        }
        currentNum = num;
        for (int i=0;i<basamakSayisi;i++){
            total += currentNum%10;
            currentNum-=currentNum%10;
            currentNum/=10;
        }
        System.out.println("Sonuç : " + total);
    }
}
