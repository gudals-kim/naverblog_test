package basic.singleton.factory;

public class Car {
    int num;
    CarFactory factory = CarFactory.getInstance();
    public Car(){
        num = factory.makeCar();
    }
}
