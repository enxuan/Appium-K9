package lab_09;

import java.util.Arrays;
import java.util.List;

public class TotalSalaryCalculation {
    public int calculateSalary(List<AbtractEmployee> list) {
        int totalSalary = 0;
        for (AbtractEmployee emp : list) {
            totalSalary += emp.getSalary();
        }
        return totalSalary;
    }

    public static void main(String[] args) {
        //create list of employee
        AbtractEmployee ti = new ContractEmployee();
        AbtractEmployee teo = new FullTimeEmployee();
        AbtractEmployee tun = new ContractEmployee();
        AbtractEmployee meo = new FullTimeEmployee();

        List<AbtractEmployee> empList = Arrays.asList(ti, teo, tun, meo);

        //calculate total salary
        int totalSalary = new TotalSalaryCalculation().calculateSalary(empList);
        System.out.println("The total salary: " + totalSalary);
    }
}
