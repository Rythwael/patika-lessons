public class Main {
    public static void main(String[] args) {
        Course mat = new Course("Matematik","MAT101","MAT");
        Course fizik = new Course("Fizik","FZK101","FZK");
        Course kimya = new Course("Kimya","KIM101","KIM");

        Teacher t1 = new Teacher("Mahmut Hoca","MAT","23623627");
        Teacher t2 = new Teacher("Yaşar Koşar","FZK","8234234");
        Teacher t3 = new Teacher("Ayşe Teyze","KIM","823423434");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İbrahim Taş","0001",4,mat,fizik,kimya);
        s1.addBulkExamNote(70,20,40);
        s1.addBulkVNote(50,80,70);
        s1.isPass();

        Student s2 = new Student("Ali Koç","0002",4,mat,fizik,kimya);
        s2.addBulkExamNote(90,80,60);
        s2.addBulkVNote(70,100,100);
        s2.isPass();

        Student s3 = new Student("Murat Laras","0003",4,mat,fizik,kimya);
        s3.addBulkExamNote(100,100,100);
        s3.addBulkExamNote(100,45,80);
        s3.isPass();

    }
}
