public class AsalSayilar {
    public static void main(String[] args) {
        boolean con;
        System.out.print("2 ");
        for (int i=3;i<100;i+=2){
            con = false;
            for (int j=2;j<i;j++){
                if (i%j==0){
                    con = true;
                    break;
                }
            }
            if (con==false){
                System.out.print(i + " ");
            }
        }
    }
}
