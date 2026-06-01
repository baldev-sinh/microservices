package observer;

public class MobileDisplay implements Observer {

  private final String deviceName;

  public MobileDisplay(String deviceName) {
    this.deviceName = deviceName;
  }

  @Override
  public void update(float temperature) {
    System.out.println(
        deviceName +
            " received temperature update: "
            + temperature
    );
  }
}
