package lesson_13;

import java.util.Collections;
import java.util.List;

public class TestDataFactory {

    public static void main(String[] args) {

        // READING
        // Macbook: /src_lesson/lesson_13/Persons.txt
        // Windows: \\src_lesson\\lesson_13\\Persons.txt

        String relativeFilePath = "/src/lesson_13/EmployeeDB.txt";
        String absolutePath = System.getProperty("user.dir") + relativeFilePath;
        System.out.println(absolutePath);

        List<Employee> employeeList = DataFactory.getEmployeeListFromFile(absolutePath);
        Collections.sort(employeeList);
        System.out.println(employeeList);

        //Writing
        employeeList.add(new Employee("hehe", 23, 30000));
        DataFactory.saveEmployeeList(employeeList, absolutePath);


    }
}
