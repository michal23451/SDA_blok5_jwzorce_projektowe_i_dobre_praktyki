package pl.sda.java.day2.xyz.services;

import pl.sda.java.day2.xyz.employee.Employee;
import pl.sda.java.day2.xyz.model.Mood;
import pl.sda.java.day2.xyz.model.Timesheet;
import pl.sda.java.day2.xyz.repository.EmployeeRepository;
import pl.sda.java.day2.xyz.repository.TimesheetRepository;

import java.time.Month;

public class TimesheetService {

    public void reportHours(long employeeId, int hours, Month month) {

        EmployeeRepository employeeRepository = new EmployeeRepository();
        Employee employee = employeeRepository.find(employeeId);

        Timesheet timesheet = new Timesheet();
        timesheet.setEmployee(employee);
        timesheet.setMonth(month);
        timesheet.setNumberOfHours(hours);

        if (hours < 40) {
            timesheet.setMood_type(Mood.HAPPY);
        } else if (hours == 40) {
            timesheet.setMood_type(Mood.NORMAL);
        } else
            timesheet.setMood_type(Mood.SAD);

        TimesheetRepository timesheetRepository= new TimesheetRepository();

        timesheetRepository.save(timesheet);
    }

}
