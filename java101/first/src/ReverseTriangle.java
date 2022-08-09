import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {
        int size;
        Scanner input = new Scanner(System.in);
        System.out.print("Üçgenin boyutunu giriniz : ");
        size = input.nextInt();
        for (int i=0;i<size;i++){
            for (int k=0;k<i;k++){
                System.out.print(" ");
            }
            for (int j=2*i;j<(2*size)-1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
