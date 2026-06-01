package factory;

public class NotificationFactory {

  public static Notification createNotification(String type) {
    return
        switch (type.toUpperCase()) {
          case "EMAIL" -> new EmailNotification();
          case "SMS" -> new SmsNotification();
          default -> throw new IllegalArgumentException("Invalid input");
        };
  }


}
