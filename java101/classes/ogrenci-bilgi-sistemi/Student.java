public class Student {
    String name;
    String stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double average;
    boolean isPass;

    Student(String name,String stuNo,int classes,Course mat, Course fizik, Course kimya){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAverage();
        this.isPass = isPass;
    }

    public void addBulkExamNote(int mat,int fizik,int kimya){
        if(mat >=0 && mat<=100){
            this.mat.note = mat;
        }
        if(fizik >=0 && fizik<=100){
            this.fizik.note = fizik;
        }
        if(kimya >=0 && kimya<=100){
            this.kimya.note = kimya;
        }
    }

    public void addBulkVNote(int mat,int fizik,int kimya){
        if(mat >=0 && mat<=100){
            this.mat.vNote = mat;
        }
        if(fizik >=0 && fizik<=100){
            this.fizik.vNote = fizik;
        }
        if(kimya >=0 && kimya<=100){
            this.kimya.vNote = kimya;
        }
    }

    public void isPass(){
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0){
            System.out.println("Notlar tam olarak girilmemiş.");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.average);
            if (this.isPass){
                System.out.println("Sınıfı geçti");
            }else {
                System.out.println("Sınıfta Kaldı");
            }
        }
    }

    public void calcAverage() {
        this.average = (this.fizik.note + this.kimya.note + this.mat.note)*0.8 / 3 + ((this.fizik.vNote + this.kimya.vNote + this.mat.vNote)*0.2 / 3);
    }

    public boolean isCheckPass(){
        calcAverage();
        return this.average > 55;
    }

    public void printNote(){
        System.out.println("===============");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik notu : " + this.mat.note);
        System.out.println("Matematik sözlü notu : " + this.mat.vNote);
        System.out.println("Fizik notu : " + this.fizik.note);
        System.out.println("Fizik sözlü notu : " + this.fizik.vNote);
        System.out.println("Kimya notu : " + this.kimya.note);
        System.out.println("Kimya sözlü notu : " + this.kimya.vNote);
    }


}
