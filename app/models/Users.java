package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity

@Table(name = "user")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="position")
@DiscriminatorValue("user")
public class Users extends Model {
    @Id
    private String email;

    @Constraints.Required
    private String position;

    @Constraints.Required
    private String name;

    @Constraints.Required
    private String password;

    public Users() {
    }
    // Constructor to initialise object
    public  Users(String email, String position, String name, String password) {
        this.email = email;
        this.position = position;
        this.name = name;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRole(String role) {
        this.position = role;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    public static Finder<String, Users> find = new Finder<String, Users>(Users.class);

    public static List<Users> findAll() {
        return Users.find.all();
    }

    public static Users authenticate(String email, String password) {
        return find.query().where().eq("email", email).eq("password", password).findUnique();
    }

    public static Users getLoggedIn(String id) {
        if (id == null) {
            return null;
        }
        else {
            return find.byId(id);
        }
    }
}
