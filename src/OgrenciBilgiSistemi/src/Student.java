public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int sozluMat,int fizik, int sozluFizik, int kimya , int sozluKimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
            this.mat.sozluNot = sozluMat;

        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
            this.fizik.sozluNot = sozluFizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
            this.kimya.sozluNot = sozluKimya;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcOrtAvarage() {
        this.mat.ortNot = (this.mat.note * 0.8) + (this.mat.sozluNot * 0.2);
        this.fizik.ortNot = (this.fizik.note * 0.8) + (this.fizik.sozluNot * 0.2);
        this.kimya.ortNot = (this.kimya.note * 0.8) + (this.kimya.sozluNot * 0.2);
    }
    public void calcAvarage() {
        calcOrtAvarage();
        this.avarage = (this.fizik.ortNot  + this.kimya.ortNot + this.mat.ortNot) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Matematik Sözlü Notu : " + this.mat.sozluNot);
        System.out.println("Matematik Ortalma Notu : " + this.mat.ortNot);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Fizik Sözlü Notu : " + this.fizik.sozluNot);
        System.out.println("Fizik Ortalama Notu : " + this.fizik.ortNot);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Kimya Sözlü Notu : " + this.kimya.sozluNot);
        System.out.println("Kimya Ortalama Notu : " + this.kimya.ortNot);
    }

}
