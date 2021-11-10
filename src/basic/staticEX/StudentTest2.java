package basic.staticEX;

public class StudentTest2 {
    public static void main(String[] args) {
        Student2 lee = new Student2();
        lee.setStudentname("이정현");
        System.out.println(Student2.getStudentNum());
        System.out.println(lee.studentname + " 학생 학번 : "+ lee.studentID);

        Student2 kim = new Student2();
        kim.setStudentname("김형민");
        System.out.println(Student2.getStudentNum());
        //System.out.println(Student2.studentNum);
        System.out.println(kim.studentname + " 학생 학번 : "+ kim.studentID);
    }
}
