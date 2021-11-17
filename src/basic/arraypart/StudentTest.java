package basic.arraypart;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student(1001, "이정현");
        Student studentKim = new Student(1002, "김형민");

        studentLee.addSubject("국어",100);
        studentLee.addSubject("수학",50);
        studentLee.addSubject("영어",85);

        studentKim.addSubject("국어",50);
        studentKim.addSubject("수학",90);
        studentKim.addSubject("영어",80);


        studentLee.showStudentInfo();
        System.out.println("==========================================================");
        studentKim.showStudentInfo();

    }
}
