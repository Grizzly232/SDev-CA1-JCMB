package controllers;

import io.ebean.*;
import play.mvc.*;

import models.*;
import views.html.*;
import models.database.DatabaseOperator;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    Random rand = new Random();
    DatabaseOperator db = new DatabaseOperator();

    List<Project> projList;

    public Result index() {
		db.deleteAll();
        List<Employee> empList = Employee.findAll();
        return ok(index.render("hi"));
    }

    public Result projects() {
        db.fillProject();
        db.fillEmployee();
        projList = Project.findAll();

        db.log.debug("");
        return ok(projects.render("project", projList));
    }

    public Result project(String name) {
        projList = Project.findAll();
        Project projToLoad = new Project();
        List<Employee> collaborators = projToLoad.getCollaborators();
        collaborators.add(Ebean.find(Employee.class, 3));
        collaborators.add(Ebean.find(Employee.class, 4));
        collaborators.add(Ebean.find(Employee.class, 1));

        return ok(project.render(name, projToLoad, collaborators));
    }
}
