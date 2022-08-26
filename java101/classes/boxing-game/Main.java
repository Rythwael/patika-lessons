public class Main {
    public static void main(String[] args) {
        Fighter alex = new Fighter("Alex",9,100,70);
        Fighter mark = new Fighter("Mark",13,100,50);
        Match m = new Match(alex,mark);
        m.fight();
    }
}
