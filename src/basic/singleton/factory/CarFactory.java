package basic.singleton.factory;

public class CarFactory {
    private static CarFactory instance = new CarFactory();
    static int carnum = 1000;
    private CarFactory(){}
    public static CarFactory getInstance(){
        if (instance == null){
            instance = new CarFactory();
        }
        return instance;
    }
    public int makeCar(){
        carnum++;
        return carnum;
    }

}
