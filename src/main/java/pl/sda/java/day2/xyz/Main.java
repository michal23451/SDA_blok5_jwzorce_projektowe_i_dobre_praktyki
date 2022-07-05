package pl.sda.java.day2.xyz;

import pl.sda.java.day2.xyz.model.Timesheet;
import pl.sda.java.day2.xyz.repository.TimesheetRepository;
import pl.sda.java.day2.xyz.services.TimesheetService;

import java.time.Month;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        TimesheetService timesheetService = new TimesheetService();

        timesheetService.reportHours(4, 40, Month.MAY);

        List<Timesheet> timesheets = TimesheetRepository.timesheets;

        System.out.println(timesheets);
    }
}
