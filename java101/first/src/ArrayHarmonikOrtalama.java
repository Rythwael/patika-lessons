public class ArrayHarmonikOrtalama {
    public static void main(String[] args) {
        int[] arr = {52,24,85,465,3,2,7,1,2};
        double harSeri = 0;
        for (double i:arr){
            harSeri+=1/i;
        }
        double harOrt = arr.length/harSeri;
        System.out.println(harOrt);
    }
}
