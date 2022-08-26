public class CokBoyutluDiziBHarfi {
    public static void main(String[] args) {
        String[][] arr = new String[7][4];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                if (j==1 || j == 2){
                    if (i!=0&&i!=3&&i!=6){
                        System.out.print(" ");
                    }else {
                        System.out.print("*");
                    }
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
