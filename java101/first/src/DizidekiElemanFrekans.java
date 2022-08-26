import java.util.Arrays;

public class DizidekiElemanFrekans {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20,25};
        Arrays.sort(arr);
        int count=1;
        for (int i=0;i<arr.length;i++){
            if (i<arr.length-1){
                if (arr[i+1]==arr[i]){
                    count++;
                }else {
                    System.out.println(arr[i] + " sayısı " + count + " kere tekrar etti.");
                    count=1;
                }
            }else if(i==arr.length-1){
                if (arr[i-1]==arr[i]){
                    System.out.println(arr[i] + " sayısı " + count + " kere tekrar etti.");
                }else {
                    count=1;
                    System.out.println(arr[i] + " sayısı " + count + " kere tekrar etti.");
                }
            }
        }
    }
}
