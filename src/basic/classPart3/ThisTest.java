package basic.classPart3;

public class ThisTest {
    public static void main(String[] args) {
        BirthDay dDay = new BirthDay();
        System.out.println(dDay.year);
        System.out.println(dDay.month);
        System.out.println(dDay.day);
        dDay.printBirthDay();
    }
}
