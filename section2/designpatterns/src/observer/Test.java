package observer;

public class Test {

  public static void main(String[] args) {

    WeatherStation station = new WeatherStation();

    MobileDisplay mobile1 = new MobileDisplay("Samsung");
    MobileDisplay mobile2 = new MobileDisplay("iPhone");

    station.addObserver(mobile1);
    station.addObserver(mobile2);

    station.setTemperature(35.5f);

  }

}
