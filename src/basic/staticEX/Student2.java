package basic.staticEX;

public class Student2 {
    private static int studentNum = 170000;
    public int studentID;
    public String studentname;
    public int grade;
    public String address;

    public Student2(){
        studentNum++;
        studentID = studentNum;
    }

    public String getStudentname(){
        return studentname;
    }

    public void setStudentname(String name){
        studentname = name;
    }

    public static int getStudentNum(){
        int i = 10;
        return studentNum;
    }
    public static void setStudentNum(int studentNum){
        Student2.studentNum = studentNum;
    }


}