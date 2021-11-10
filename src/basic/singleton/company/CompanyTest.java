package basic.singleton.company;

public class CompanyTest {
    public static void main(String[] args) {
        Company samsung = Company.getInstance();
        Company apple = Company.getInstance();
        System.out.println(samsung == apple);
    }
}
