import java.util.Arrays;

public class Transpoz {
    public static void main(String[] args) {
        int[][] matris = {{1,2,3},{4,5,6}};
        int len1 = matris.length;
        int len2 = matris[0].length;
        int[][] transpose = new int[len2][len1];
        for (int i=0;i<len2;i++){
            for (int j=0;j<len1;j++){
                transpose[i][j] = matris[j][i];
            }
            System.out.println(Arrays.toString(transpose[i]));
        }
    }
}
