package basic.singleton.factory;

public class CarFactoryTest {
    public static void main(String[] args) {
        Car k5 = new Car();
        Car k3 = new Car();
        System.out.println("K5의 차량 제작 번호 : "+k5.num);
        System.out.println("k3의 차량 제작 번호 : "+k3.num);
    }
}
