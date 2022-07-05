package pl.sda.java.day2.xyz.model;

import lombok.ToString;
import pl.sda.java.day2.xyz.employee.Employee;

import java.time.Month;

@ToString
public class Timesheet {
    Employee employee;
    Month month;
    int NumberOfHours;
    Mood mood_type;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public int getNumberOfHours() {
        return NumberOfHours;
    }

    public void setNumberOfHours(int numberOfHours) {
        NumberOfHours = numberOfHours;
    }

    public Mood getMood_type() {
        return mood_type;
    }

    public void setMood_type(Mood moodType) {
        this.mood_type = mood_type;
    }
}
