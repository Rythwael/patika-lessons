import java.util.Scanner;

public class StarDiamond {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayıyı giriniz");
        num = input.nextInt();

        for (int x=0;x<num;x++){
            for (int i=x;i<num/2;i++){
                System.out.print(" ");
            }
            if (x<=num/2){
                for (int k=0;k<(2*x)+1;k++){
                    System.out.print("*");
                }
            }

            for (int j=x;j>num/2;j--){
                System.out.print(" ");
            }
            if (x>num/2){
                for (int l=0;l<(2*(num-x))-1;l++){
                    System.out.print("*");
                }
            }
            System.out.println("\n");
        }

    }
}
