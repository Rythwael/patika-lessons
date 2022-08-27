import java.util.Arrays;
import java.util.Scanner;

public class MineSweeper {
    int row;
    int col;
    int totalSize;
    int mineCount;
    MineSweeper(int row,int col){
        this.row = row;
        this.col = col;
        this.totalSize = row*col;
        this.mineCount = row*col/4;
    }


    public int[] locateMine(int mineLocations[]){
        Arrays.fill(mineLocations,-10);
        int randNum;

        for (int i=0;i<mineCount;i++){
            randNum = (int)(Math.random()*totalSize);
            Arrays.sort(mineLocations);
            while (Arrays.binarySearch(mineLocations,randNum)==-1){
                randNum = (int)(Math.random()*totalSize);
            }
            mineLocations[0]=randNum;
        }
        Arrays.sort(mineLocations);
        return mineLocations;
    }
        public String[][] gameMatris(String arr[][]){
            for (int i=0;i<arr.length;i++){
                for (int j=0;j<arr[0].length;j++){
                    arr[i][j]="- ";
                }
            }
            return arr;
        }

        public String[][] mineMatris(String mineArr[][],int mineLocations[]){
            int c = 0;
            int count = 0;
            for (int i=0;i<mineArr.length;i++){
                for (int j=0;j<mineArr[0].length;j++){
                    if (c<mineCount){
                        if (count == mineLocations[c]){
                            mineArr[i][j]="* ";
                            c++;
                            count++;
                            continue;
                        }
                    }
                    mineArr[i][j]="- ";
                    count++;
                }
            }
            return mineArr;
        }




        public void run(){
            Scanner s = new Scanner(System.in);
            int sat;
            int sut;
            int count;
            int entryCount=0;
            int[] mineLocations = new int[mineCount];
            String[][] game = new String[row][col];
            String[][] curGame = gameMatris(game);
            String[][] mineArr = new String[row][col];
            String[][] curMine = mineMatris(mineArr,locateMine(mineLocations));
            boolean isOver = false;
            System.out.println("-Açmak istediğiniz indexi giriniz-");
            for (int i=0;i<curGame[0].length;i++){
                System.out.println(Arrays.toString(curMine[i]));
            }
            while (!isOver){
                for (int i=0;i<curGame[0].length;i++){
                    System.out.println(Arrays.toString(curGame[i]));
                }
                System.out.print("Satır : ");
                sat = s.nextInt();
                System.out.print("Sütun : ");
                sut = s.nextInt();
                if (sat<0||sat>=row||sut<0||sut>=col){
                    System.out.println("Hatalı index girdiniz");
                    continue;
                }
                System.out.println("----------------------");
                if (!curGame[sat][sut].equals("- ")){
                    System.out.println("Farklı index giriniz");
                    continue;
                }
                if (curMine[sat][sut].equals("* ")){
                    isOver = true;
                    System.out.println("Kaybettiniz.");
                }else {
                    count=0;
                    entryCount++;
                    for (int i=sat-1;i<sat+2;i++){
                        if (i<0||i==row){
                            continue;
                        }
                        for (int j=sut-1;j<sut+2;j++){
                            if (j<0||(j==sut&&i==sat)||j==col){
                                continue;
                            }
                            if (curMine[i][j].equals("* ")){
                                count++;
                            }
                        }
                    }
                    curGame[sat][sut]=String.valueOf(count) + " ";

                    if (entryCount==totalSize-mineCount){
                        isOver=true;
                        for (int i=0;i<curGame[0].length;i++){
                            System.out.println(Arrays.toString(curGame[i]));
                        }
                        System.out.println("TEBRIKLER!");
                    }
                }
            }


        }

}
