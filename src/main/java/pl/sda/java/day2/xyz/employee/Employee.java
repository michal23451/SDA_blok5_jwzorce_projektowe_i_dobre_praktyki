package pl.sda.java.day2.xyz.employee;

import lombok.Setter;
import lombok.ToString;

import java.util.List;

@ToString
@Setter
public class Employee {

    long id;
    String firstName;
    String lastName;


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public void setLastName(String last_name) {
        this.lastName = last_name;
    }


}
