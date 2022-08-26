import java.util.Arrays;
import java.util.Scanner;

public class DizindekiElemanlariSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dizinin boyutu : ");
        int len = input.nextInt();
        int[] arr = new int[len];
        for (int i=0;i<len;i++){
            System.out.print((i+1) + ". Eleman : ");
            arr[i]=input.nextInt();
        }
        Arrays.sort(arr);
        for (int i:arr){
            System.out.print(i + " ");
        }
    }
}
