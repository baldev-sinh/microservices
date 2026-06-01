package factory;

public class Test {

  public static void main(String[] args) {

    Notification sms = NotificationFactory.createNotification("email");
    sms.send();

  }

}
