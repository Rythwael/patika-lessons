import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class MinAndMaxFinder {
    public static void main(String[] args) {
        int[] arr = {15,12,788,1,-1,-778,2,0};
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] newArr = new int[arr.length+1];
        newArr[arr.length] = num;
        for (int i=0;i<arr.length;i++){
            newArr[i]=arr[i];
        }
        Arrays.sort(newArr);
        int index = Arrays.binarySearch(newArr,num);
        System.out.println(index);
        System.out.println("Girilen sayı : " + num);
        System.out.println("Girilen sayıya en yakın küçük sayı : " + newArr[index-1]);
        System.out.println("Girilen sayıya en yakın büyük sayı : " + newArr[index+1]);
    }
}
