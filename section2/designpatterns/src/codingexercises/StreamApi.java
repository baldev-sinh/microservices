package codingexercises;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


public class StreamApi {

  public static void main(String[] args) {

    List<Employee> employees = Arrays.asList(

        new Employee(101, "Rahul", "IT", 75000),
        new Employee(102, "Amit", "HR", 50000),
        new Employee(103, "Sneha", "Finance", 65000),
        new Employee(104, "Priya", "IT", 80000),
        new Employee(105, "Vikram", "Admin", 45000),
        new Employee(106, "Neha", "Finance", 70000),
        new Employee(107, "Arjun", "IT", 90000),
        new Employee(108, "Pooja", "HR", 55000),
        new Employee(109, "Karan", "Sales", 60000),
        new Employee(110, "Meera", "Sales", 62000)

    );

    // groupingBy
    employees.stream()
        .collect(Collectors.groupingBy(
            Employee::getDepartment)
        )
        .forEach((s, employees1) -> {
          List<String> list = employees1.stream().map(e -> e.getName() + " -> " + e.getSalary())
              .collect(Collectors.toList());
          System.out.println(s + " -> " + list);
        });

    // partitioningBy
    employees.stream()
        .collect(Collectors.partitioningBy(
            emp -> emp.getSalary() > 70_000
        ))
        .forEach((aBoolean, employees1) -> {
          List<String> list = employees1.stream().map(e -> e.getName() + " -> " + e.getSalary())
              .collect(Collectors.toList());
          System.out.println(aBoolean + " -> " + list);
        });

    // find duplicates
    List<Integer> integers = List.of(2, 2, 3, 3, 4, 5);
    Set<Integer> set = new HashSet<>();
    Set<Integer> collect = integers.stream()
        .filter(i -> !set.add(i))
        .collect(Collectors.toSet());
    System.out.println("duplicates: " + collect);

    // frequency count
    String temp = "Baaldeev";
    Map<Character, Long> collect1 = temp.chars()
        .mapToObj(c -> (char) c)
        .collect(Collectors.groupingBy(
            c -> c,
            Collectors.counting()
        ));
    System.out.println("Frequency count" + collect1);
  }
}

class Employee {

  private final int id;
  private final String name;
  private final String department;
  private final double salary;

  public Employee(int id, String name, String department, double salary) {
    this.id = id;
    this.name = name;
    this.department = department;
    this.salary = salary;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getDepartment() {
    return department;
  }

  public double getSalary() {
    return salary;
  }

  @Override
  public String toString() {
    return id + " " + name + " " + department + " " + salary;
  }
}


