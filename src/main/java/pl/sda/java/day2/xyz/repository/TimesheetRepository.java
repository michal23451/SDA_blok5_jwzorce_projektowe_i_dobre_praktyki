package pl.sda.java.day2.xyz.repository;

import pl.sda.java.day2.xyz.model.Timesheet;

import java.util.ArrayList;
import java.util.List;

public class TimesheetRepository {

    public static List<Timesheet> timesheets = new ArrayList<>();

    public void save(Timesheet timesheet) {
        timesheets.add(timesheet);
        timesheets = new ArrayList<>();
    }
}
