import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        int mat,fiz,tr,kim,muz,total,totalNote=5,avg;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik Notunuz : ");
        mat = input.nextInt();
        if (mat>100 || mat<0){
            mat = 0;
            totalNote--;
        }
        System.out.print("Fizik Notunuz : ");
        fiz = input.nextInt();
        if (fiz>100 || fiz<0){
            fiz = 0;
            totalNote--;
        }
        System.out.print("Türkçe Notunuz : ");
        tr = input.nextInt();
        if (tr>100 || tr<0){
            tr = 0;
            totalNote--;
        }
        System.out.print("Kimya Notunuz : ");
        kim = input.nextInt();
        if (kim>100 || kim<0){
            kim = 0;
            totalNote--;
        }
        System.out.print("Müzik Notunuz : ");
        muz = input.nextInt();
        if (muz>100 || muz<0){
            muz = 0;
            totalNote--;
        }
        total = mat+fiz+tr+kim+muz;
        avg = total/totalNote;
        System.out.println("Ortalamanız : " + avg);

    }
}
