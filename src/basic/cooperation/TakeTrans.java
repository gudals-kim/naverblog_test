package basic.cooperation;

public class TakeTrans {
    public static void main(String[] args) {
        Student kim = new Student("김형민", 5000);
        Student lee = new Student("이정현", 10000);
        Bus bus100 = new Bus(100);
        Bus bus150 = new Bus(150);
        Subway subwayGreen = new Subway("1호선");
        Subway subwayRed = new Subway("2호선");

        kim.takeBus(bus100);
        kim.showInfo();
        kim.takeBus(bus150);
        kim.showInfo();
        kim.takeSubway(subwayGreen);
        kim.showInfo();

        lee.takeSubway(subwayRed);
        lee.showInfo();
        lee.takeSubway(subwayGreen);
        lee.takeBus(bus150);
        lee.showInfo();

        bus100.showInfo();
        bus150.showInfo();
        subwayGreen.showInfo();
        subwayRed.showInfo();
    }
}
