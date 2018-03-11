
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <title>"""),_display_(/*6.17*/title),format.raw/*6.22*/("""</title>
        <link rel="stylesheet" media="all" href=""""),_display_(/*7.51*/routes/*7.57*/.Assets.versioned("stylesheets/bootstrap.css")),format.raw/*7.103*/("""">
        <link rel="stylesheet" media="all" href=""""),_display_(/*8.51*/routes/*8.57*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*8.107*/("""">
        <link rel="stylesheet" media="all" href=""""),_display_(/*9.51*/routes/*9.57*/.Assets.versioned("stylesheets/main.css")),format.raw/*9.98*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*10.59*/routes/*10.65*/.Assets.versioned("images/favicon.png")),format.raw/*10.104*/("""">
    </head>
    <body>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <div class="container-fluid head">
            <h1>JCMB Inc. Employee Management</h1>
            <h4>Work to live. Live to work. We'll make it easier.</h4>
        </div>
        <div class="container-fluid">
            <ul class="nav navbar-nav buttons">
                <li><a href=""""),_display_(/*22.31*/routes/*22.37*/.HomeController.index()),format.raw/*22.60*/("""">Home</a></li>
                <li><a href=""""),_display_(/*23.31*/routes/*23.37*/.HomeController.projects()),format.raw/*23.63*/("""">Projects</a></li>
                <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown">Log in
                    <span class="caret"></span></a>r
                    <ul class="dropdown-menu">
                        <input type="email" class="form-control" id="usr" placeholder="Email" required>
                        <input type="password" class="form-control" id="usr" placeholder="Password" required>
                        <button type="button" class="btn btn-default">Log in</button>
                        <label class="form-check-label">
                            <input type="checkbox" class="form-check-input"> Remember me
                        </label>
                    </ul>
                </li>
            </ul>
        </div>
        """),format.raw/*38.31*/("""
        """),_display_(/*39.10*/content),format.raw/*39.17*/("""
        """),format.raw/*40.9*/("""<div class="container-fluid footer">
            <h4>JCMB Inc. &copy 2018</h4>
            <a href="#">Back to top</a>
        </div>

        <script src=""""),_display_(/*45.23*/routes/*45.29*/.Assets.versioned("javascripts/jquery-3.2.1.slim.js")),format.raw/*45.82*/(""""></script>
        <script src=""""),_display_(/*46.23*/routes/*46.29*/.Assets.versioned("javascripts/main.js")),format.raw/*46.69*/(""""></script>
        <script src=""""),_display_(/*47.23*/routes/*47.29*/.Assets.versioned("javascripts/bootstrap.js")),format.raw/*47.74*/(""""></script>
        <script src=""""),_display_(/*48.23*/routes/*48.29*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*48.78*/(""""></script>
        <script src=""""),_display_(/*49.23*/routes/*49.29*/.Assets.versioned("javascripts/main.js")),format.raw/*49.69*/(""""></script>

    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 11 21:48:20 GMT 2018
                  SOURCE: C:/Users/micha/Documents/GitHub/SDev-CA1-JCMB/app/views/main.scala.html
                  HASH: 94c6e8a36a56d9fe52211ae0d284f91befa7774e
                  MATRIX: 952->1|1077->31|1105->33|1191->93|1216->98|1301->157|1315->163|1382->209|1461->262|1475->268|1546->318|1625->371|1639->377|1700->418|1788->479|1803->485|1864->524|2322->955|2337->961|2381->984|2454->1030|2469->1036|2516->1062|3335->1942|3372->1952|3400->1959|3436->1968|3620->2125|3635->2131|3709->2184|3770->2218|3785->2224|3846->2264|3907->2298|3922->2304|3988->2349|4049->2383|4064->2389|4134->2438|4195->2472|4210->2478|4271->2518
                  LINES: 28->1|33->1|35->3|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|54->22|54->22|54->22|55->23|55->23|55->23|69->38|70->39|70->39|71->40|76->45|76->45|76->45|77->46|77->46|77->46|78->47|78->47|78->47|79->48|79->48|79->48|80->49|80->49|80->49
                  -- GENERATED --
              */
          