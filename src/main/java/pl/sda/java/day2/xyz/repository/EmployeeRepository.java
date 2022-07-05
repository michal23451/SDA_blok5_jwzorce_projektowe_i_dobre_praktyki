package pl.sda.java.day2.xyz.repository;

import pl.sda.java.day2.xyz.employee.Employee;

public class EmployeeRepository {

    public Employee find(long id) {
        Employee employee = new Employee();
        employee.setId(id);
        employee.setFirstName("Kuklake" + id);
        employee.setLastName("Bulake" + id);

        return employee;
    }
}
