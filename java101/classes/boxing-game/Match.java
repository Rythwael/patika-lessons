public class Match {
    Fighter f1;
    Fighter f2;

    Match(Fighter f1, Fighter f2){
        this.f1 = f1;
        this.f2 = f2;
    }

    public void fight(){
        int round = 0;

        while (f1.hp>0 || f2.hp>0){
            double firstHit = Math.random();
            System.out.println("-------------------");
            System.out.println("Round : " + round);
            if (firstHit<0.5){
                f2.hp = f1.hit(f2);
                System.out.println(f2.name + "\'s HP : " + f2.hp);
                if (isOver()){
                    break;
                }
            } else {
                f1.hp = f2.hit(f1);
                System.out.println(f1.name + "\'s HP : " + f1.hp);
                if (isOver()){
                    break;
                }
            }
            round++;
        }
    }

    public boolean isOver(){
        if (f1.hp==0){
            System.out.println("-------------------");
            System.out.println("THE WINNER IS  " + f2.name);
            return true;
        } else if (f2.hp==0) {
            System.out.println("-------------------");
            System.out.println("THE WINNER IS " + f1.name);
            return true;
        }
        return false;
    }
}
