package basic.Exstudent;

public class studenttest {
    public static void main(String[] args) {
        Student studentLee = new Student(101,"이순신");
        studentLee.address = "서울";
        Student studentkim = new Student(202,"김유신");
        studentkim.address = "광주";

        studentkim.showStudentInfo();
        studentLee.showStudentInfo();

    }
}
