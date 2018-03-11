package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.validation.*;

@Entity
public class Employee extends Model {

    @Id
    private long emp_id;
    @Constraints.Required

    private String fName;
    private String lName;

    @OneToOne
    private Address address;

    private int age;
    private String position;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "collaborators")
    public List<Project> projects;

    public Employee() {

    }

    public Employee(@Constraints.Required String fName, @Constraints.Required String lName, @Constraints.Required Address address, @Constraints.Required int age, String position) {
        this.fName = fName;
        this.lName = lName;
        this.address = address;
        this.age = age;
        this.position = position;
        Ebean.save(this);
    }

    public long getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(long emp_id) {
        this.emp_id = emp_id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Transient
    public static final Finder<Long, Employee> find = new Finder<>(Employee.class);

    static public List<Employee> findAll() {
        return Employee.find.all();
    }
}
