package racingcar;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        Car car = new Car();
        Race race = new Race();
        car.inputCar();
        race.inputMove();
        for (String name : car.getCar()){
            if (race.isGo()){
                car.goCar(name);
            }
        }
        race.endRace();
    }
}
