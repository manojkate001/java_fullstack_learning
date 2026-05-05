package Project;
import java.util.*;
import java.util.stream.*;

record Employee(String name, String dept, double salary, int age) {}

public class StreamApiEmployeeMain {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Manoj", "Engineering", 75000, 25));
        employees.add(new Employee("Rahul", "HR", 55000, 30));
        employees.add(new Employee("Priya", "Engineering", 85000, 28));
        employees.add(new Employee("Sneha", "Finance", 65000, 26));
        employees.add(new Employee("Arjun", "Engineering", 90000, 32));
        employees.add(new Employee("Divya", "HR", 52000, 24));

        employees.stream()
                .max(Comparator.comparing(Employee::salary))
                .ifPresent(e -> System.out.println("Top earner: " + e.name()));


        employees.stream()
                .filter(e -> e.dept().equals("Engineering"))
                .mapToDouble(Employee::salary)
                .average()
                .ifPresent(avg -> System.out.printf("Eng avg salary: ₹%.0f%n", avg));


        Map<String, List<Employee>> byDept =
                employees.stream()
                        .collect(Collectors.groupingBy(Employee::dept));

        byDept.forEach((dept, emps) ->
                System.out.println(dept + ": " + emps.size() + " employees"));


        List<String> highEarners =
                employees.stream()
                        .filter(e -> e.salary() > 60000)
                        .sorted(Comparator.comparing(Employee::salary).reversed())
                        .map(Employee::name)
                        .collect(Collectors.toList());

        System.out.println("High earners: " + highEarners);


        double totalSalary =
                employees.stream()
                        .mapToDouble(Employee::salary)
                        .sum();

        System.out.printf("Total salary: ₹%.0f%n", totalSalary);
    }
}