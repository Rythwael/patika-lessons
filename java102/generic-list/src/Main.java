public class Main {
    public static void main(String[] args) {
        MyList<Integer> mylist = new MyList<>();
        System.out.println("Dizideki eleman sayısı : " + mylist.size());
        System.out.println("Dizinin kapasitesi : " + mylist.getCapacity());
        mylist.add(10);
        mylist.add(20);
        mylist.add(30);
        System.out.println("Dizideki eleman sayısı : " + mylist.size());
        System.out.println("Dizinin kapasitesi : " + mylist.getCapacity());
        System.out.println(mylist.get(2));
        System.out.println(mylist.get(12));
        mylist.remove(1);
        mylist.add(40);
        mylist.set(0,50);
        System.out.println(mylist.toString());
        System.out.println(mylist.indexOf(50));
        mylist.add(50);
        System.out.println(mylist.lastIndexOf(50));
        System.out.println(mylist.isEmpty());
    }
}