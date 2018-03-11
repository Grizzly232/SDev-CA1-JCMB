package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.validation.*;

@Entity
public class Department extends Model {

    @Id
    private String name;
    private String description;

    @Transient
    private ArrayList<Employee> employees;

    @Transient      //presumably this'll be seen by the database as a foreign key but java freaks out if
                    //you try to make an entity a variable type on another entity so i guess we'll figure that out
    private Employee manager;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }
}