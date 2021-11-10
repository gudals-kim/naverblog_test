package basic.Exstudent;

public class Student {
    int studentID;
    String studentname;
    String address;

    public Student(int id,String name){
        studentID = id;
        studentname = name;
    }
    public void showStudentInfo(){
        System.out.println(studentID+"번 학생은 "+studentname+","+address);
    }
}
