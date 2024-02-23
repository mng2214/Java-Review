import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTest {
    public static void main(String[] args) {

        // Print all emails - one employee has 1 email. 1 to 1

        EmployeeData.readAll()
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);

        System.out.println("-".repeat(40));

        // Print all phone numbers - one employee has multiple numbers. 1 to many

        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumber)
                .forEach(System.out::println);

        System.out.println("-".repeat(40));

        EmployeeData.readAll()
                .flatMap(emp -> emp.getEmpPhoneNumber().stream())
                .forEach(System.out::println);

        System.out.println("-".repeat(40));

        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumber)
                .flatMap(List::stream)
                .forEach(System.out::println);
    }
}
