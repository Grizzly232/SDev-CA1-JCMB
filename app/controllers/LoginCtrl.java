package controllers;

import controllers.routes;
import play.api.Environment;
import play.mvc.*;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import views.html.*;
import models.*;

public class LoginCtrl extends Controller{
    private FormFactory formFactory;
    private Environment env;

    @Inject
    public LoginCtrl(Environment e, FormFactory f) {
        this.env = e;
        this.formFactory = f;
    }

    public Result login() {
        Form<Login> loginForm = formFactory.form(Login.class);

        return ok(login.render(loginForm, Users.getLoggedIn(session().get("email"))));
    }

    public Result loginSubmit() {
        // Bind form instance to the values submitted from the form
        Form<Login> loginForm = formFactory.form(Login.class).bindFromRequest();

        // Check for errors
        // Uses the validate method defined in the Login class
        if (loginForm.hasErrors()) {
            // If errors, show the form again
            return badRequest(login.render(loginForm, Users.getLoggedIn(session().get("email"))));
        }
        else {
            // User Logged in successfully
            // Clear the existing session
            session().clear();
            // Store the logged in email in the session
            session("email", loginForm.get().getEmail());

            // Check user type
            Users u = Users.getLoggedIn(loginForm.get().getEmail());
            // If admin - go to admin section
            if (u != null && "empolyee".equals(u.getPosition())) {
                return redirect(controllers.routes.HomeController.index());
            }

            // Return to home page
            return redirect(controllers.routes.HomeController.index());
        }
    }

    public Result logout() {
        session().clear();
        flash("success", "You've been logged out");
        return redirect(controllers.routes.LoginCtrl.login());
    }

}
