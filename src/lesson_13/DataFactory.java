package lesson_13;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataFactory {

    private static String SEPARATE_CHAR = ";";
    public static void saveEmployeeList(List<Employee> employeeList, String filePath) {
        System.out.println("[INFO] Writing file to: " + filePath);

        try (
                FileOutputStream fileOutputStream = new FileOutputStream(filePath);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        ) {
            for (Employee employee : employeeList) {
                String dataLine = employee.getName() + SEPARATE_CHAR + employee.getAge() + SEPARATE_CHAR + employee.getSalary();
                bufferedWriter.write(dataLine);
                bufferedWriter.newLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("[ERR] File not found!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Employee> getEmployeeListFromFile(String filePath) {
        System.out.println("[INFO] Reading file from : " + filePath);
        List<Employee> employeeList = new ArrayList<>();

        try (
                FileInputStream fileInputStream = new FileInputStream(filePath);
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                ){
            String dataLine = bufferedReader.readLine();

            while (dataLine != null) {
                String[] employeeData = dataLine.split(SEPARATE_CHAR);
                String employeeName = employeeData[0];
                int employeeAge = Integer.parseInt(employeeData[1]);
                int employeeSalary = Integer.parseInt(employeeData[2]);
                Employee employee = new Employee(employeeName, employeeAge, employeeSalary);
                employeeList.add(employee);

                dataLine = bufferedReader.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("[ERR] File not found!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return employeeList;
    }
}
