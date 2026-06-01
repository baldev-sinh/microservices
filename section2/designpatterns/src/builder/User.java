package builder;

public class User {

  private final String firstName;
  private final String lastName;
  private final String email;
  private final int age;
  private final String address;

  public User(Builder builder) {
    this.firstName = builder.firstName;
    this.lastName = builder.lastName;
    this.email = builder.email;
    this.age = builder.age;
    this.address = builder.address;
  }

  public static Builder builder() {
    return new Builder();
  }

  @Override
  public String toString() {
    return "User{" +
        "firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", email='" + email + '\'' +
        ", age=" + age +
        ", address='" + address + '\'' +
        '}';
  }

  public static class Builder {

    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private String address;

    public Builder firstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    public Builder lastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    public Builder email(String email) {
      this.email = email;
      return this;
    }

    public Builder age(int age) {
      this.age = age;
      return this;
    }

    public Builder address(String address) {
      this.address = address;
      return this;
    }

    public User build() {

      // validation
      if (firstName == null || firstName.isBlank()) {
        throw new IllegalArgumentException("firstName is required");
      }

      return new User(this);

    }

  }
}
