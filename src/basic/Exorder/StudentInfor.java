package basic.Exorder;
/*학생 3명이 있을때, 학생을 입력받았을때, 학생의 정보(이름,나이,주소)와 학생의 성적(java, 정보처리기사, 데이터베이스)을 출력하게 만들어라*/
public class StudentInfor {
    String stname;
    int stage;
    String stadd;
    Subject java = new Subject();
    Subject license = new Subject();
    Subject database = new Subject();
    public void setInfor(String name,int age,String address,int javascore,int licensescore, int databasescore){
        java.score = javascore;
        license.score = licensescore;
        database.score = databasescore;
        stname = name;
        stage = age;
        stadd = address;
    }
    public void viewinfor(){
        System.out.println("학생 : "+stname+"의 나이는 "+stage+" 주소는 "+stadd+"입니다.");
        System.out.println("java 점수는 "+java.score+"점 정보처리기사 점수는 "+license.score+"점 데이터베이스 점수는 "+database.score+"입니다.");
    }
}
