import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Book kitap1 = new Book("İnsan Neyle Yaşar",96,"Tolstoy",1885);
        Book kitap2 = new Book("Cocukluk",1852,"Tolstoy",162);
        Book kitap3 = new Book("Sırça Köşk",1947,"Sabahattin Ali",141);
        Book kitap4 = new Book("Beyin",2015,"David Eagleman",275);
        Book kitap5 = new Book("Homo Deus",286,"Yuval Noah Harari",448);
        Book kitap6 = new Book("Sefiller",825,"Victor Hugo",852);

        TreeSet<Book> books = new TreeSet<>();
        books.add(kitap1);
        books.add(kitap2);
        books.add(kitap3);
        books.add(kitap4);
        books.add(kitap5);

        /*for (Book b : books){
            System.out.println("Name : " + b.getName() +
                    "\tPage Number : " + b.getPageNum() +
                    "\tAuthor : " + b.getAuthor() +
                    "\tPublish Date : " + b.getPublishDate());
        }*/

        TreeSet<Book> orderedBooks = new TreeSet<>(Comparator.comparingInt(Book::getPageNum));

        orderedBooks.add(kitap1);
        System.out.println(orderedBooks.size());
        orderedBooks.add(kitap2);
        System.out.println(orderedBooks.size());
        orderedBooks.add(kitap3);
        System.out.println(orderedBooks.size());
        orderedBooks.add(kitap4);
        System.out.println(orderedBooks.size());
        orderedBooks.add(kitap5);
        System.out.println(orderedBooks.size());
        orderedBooks.add(kitap6);
        System.out.println(orderedBooks.size());

        for (Book b : orderedBooks){
            System.out.println("Name : " + b.getName() +
                    "\tPage Number : " + b.getPageNum() +
                    "\tAuthor : " + b.getAuthor() +
                    "\tPublish Date : " + b.getPublishDate());
        }
        System.out.println(orderedBooks.size());

    }
}
