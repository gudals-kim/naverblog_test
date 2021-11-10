package basic.Exorder;
/*학생 3명이 있을때, 학생을 입력받았을때, 학생의 정보(이름,나이,주소)와 학생의 성적(java, 정보처리기사, 데이터베이스)을 출력하게 만들어라*/
public class Ordertest {
    public static void main(String[] args) {
        StudentInfor kim = new StudentInfor();
        StudentInfor lee = new StudentInfor();
        StudentInfor park = new StudentInfor();
        kim.setInfor("김형민",24,"광주광역시 서구",80,79,67);
        lee.setInfor("이정현",24,"광주광역시 동구",40,59,27);
        park.setInfor("박광현",24,"순천시 신대지구",60,39,77);
        kim.viewinfor();
        lee.viewinfor();
        park.viewinfor();
    }
}
