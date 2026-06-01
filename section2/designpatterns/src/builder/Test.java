package builder;

public class Test {

  public static void main(String[] args) {

    User user = User.builder()
        .firstName("Baldevsinh Parmar")
        .email("example@gmail.com")
        .address("Baroda")
        .age(23)
        .build();

    System.out.println(user);

  }
}
