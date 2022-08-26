import java.util.Arrays;

public class TekrarEdenCiftSayilar {
    public static void main(String[] args) {
        int[] arr = {8,7,4,3,1,8,3,7,3,2,4,8,2};
        String res = "";
        Arrays.sort(arr);
        for (int i=0;i<arr.length-1;i++){
            if (i>0){
                if (arr[i]==arr[i+1]&&arr[i]!=arr[i-1]&&arr[i]%2==0){
                    res += Integer.toString(arr[i]);
                }
            }else {
                if (arr[i]==arr[i+1]&&arr[i]%2==0){
                    res += Integer.toString(arr[i]);
                }
            }
        }
        int len = res.length();
        int[] newArr = new int[len];
        for(int j=0;j<len;j++){
            newArr[j]=Character.getNumericValue(res.charAt(j));
        }
        System.out.println(Arrays.toString(newArr));
    }
}
