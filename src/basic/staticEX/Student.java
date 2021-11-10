package basic.staticEX;

public class Student {
    public static int studentNum = 170000;
    public int studentID;
    public String studentname;
    public int grade;
    public String address;

    public Student(){
        studentNum++;
        studentID = studentNum;
    }

    public String getStudentname(){
        return studentname;
    }

    public void setStudentname(String name){
        studentname = name;
    }
}
