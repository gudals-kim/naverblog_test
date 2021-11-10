package basic.classPart3;

public class BirthDay {
    int day;
    int month;
    int year;

    public BirthDay(){
        this(1992, 10, 20);
    }
    public BirthDay(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public void printBirthDay(){
        System.out.println("생일은 "+this.year+"년"+this.month+"월"+this.day+"일 입니다.");
    }

}
