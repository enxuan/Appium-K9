package lesson_10_4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestSalary {

    public static void main(String[] args) {
        Employee e1 = new Employee("Ti", 60);
        e1.setAge(20);
        Employee e2 = new Employee("Teo", 40);
        e2.setAge(19);
        Employee e3 = new Employee("Tun", 50);
        e3.setAge(22);

        List<Employee> empList = Arrays.asList(e1, e2, e3);

        System.out.println("**** BEFORE ****");
        System.out.println(empList);

        Collections.sort(empList);
        System.out.println("**** AFTER ****");
        System.out.println(empList);

        empList.sort(new EmpAgeComparator());
        System.out.println(empList);

    }
}
