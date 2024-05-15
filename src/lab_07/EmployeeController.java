package lab_07;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class EmployeeController {

    public static void main(String[] args) {
        Employee emp1 = new Employee(400);
        Employee emp2 = new Employee(600);

        List<Employee> empArr = Arrays.asList(emp1, emp2);

        System.out.println(calTotalSalary(empArr));
    }

    public static int calTotalSalary(List<Employee> empList) {
        int totalSalary = 0;
        for (Employee employee : empList) {
            totalSalary += employee.getSalary();
        }

        return totalSalary;
    }
}
