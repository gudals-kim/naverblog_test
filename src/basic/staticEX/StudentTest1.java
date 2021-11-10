package basic.staticEX;

public class StudentTest1 {
    public static void main(String[] args) {
        Student lee = new Student();
        lee.setStudentname("이정현");
        System.out.println(lee.studentname + " 학생 학번 : "+ lee.studentID);

        Student kim = new Student();
        kim.setStudentname("김형민");
        System.out.println(kim.studentname + " 학생 학번 : "+ kim.studentID);
    }
}
