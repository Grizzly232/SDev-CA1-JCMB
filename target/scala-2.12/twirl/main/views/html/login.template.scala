
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
/*1.2*/import models.Users
/*2.2*/import models.Login

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[Login],Users,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(loginForm: Form[Login], user: Users):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*5.2*/import helper._


Seq[Any](format.raw/*4.39*/("""
"""),format.raw/*6.1*/("""
"""),_display_(/*7.2*/main("Login")/*7.15*/ {_display_(Seq[Any](format.raw/*7.17*/("""
    """),format.raw/*8.5*/("""<p class="lead">Product Catalogue</p>
    <div class="col-xs-5">
        <h3>Sign in</h3>
        """),_display_(/*11.10*/if(loginForm.hasGlobalErrors)/*11.39*/ {_display_(Seq[Any](format.raw/*11.41*/("""
            """),format.raw/*12.13*/("""<p class="alert alert-warning">
                """),_display_(/*13.18*/loginForm/*13.27*/.globalError.message),format.raw/*13.47*/(""";
            </p>
        """)))}),format.raw/*15.10*/("""
        """),_display_(/*16.10*/if(flash.containsKey("error"))/*16.40*/ {_display_(Seq[Any](format.raw/*16.42*/("""
            """),format.raw/*17.13*/("""<p class="alert alert-warning">
            """),_display_(/*18.14*/flash/*18.19*/.get("loginRequired")),format.raw/*18.40*/("""
            """),format.raw/*19.13*/("""</p>
        """)))}),format.raw/*20.10*/("""


        """),_display_(/*23.10*/helper/*23.16*/.form(controllers.routes.LoginCtrl.loginSubmit())/*23.65*/ {_display_(Seq[Any](format.raw/*23.67*/("""
            """),_display_(/*24.14*/CSRF/*24.18*/.formField),format.raw/*24.28*/("""

            """),format.raw/*26.13*/("""<div class="form-group">
            """),_display_(/*27.14*/inputText(loginForm("email"), '_label -> "",
                'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*28.76*/("""
            """),format.raw/*29.13*/("""</div>
            <div class="form-group">
            """),_display_(/*31.14*/inputPassword(loginForm("password"), '_label -> "",
                'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*32.79*/("""
            """),format.raw/*33.13*/("""</div>
            <div class="form-group">
                <input type="submit" value="Sign In" class="btn btn-primary">
            </div>
        """)))}),format.raw/*37.10*/("""
"""),format.raw/*38.1*/("""</div>
""")))}))
      }
    }
  }

  def render(loginForm:Form[Login],user:Users): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,user)

  def f:((Form[Login],Users) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,user) => apply(loginForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 11 21:48:20 GMT 2018
                  SOURCE: C:/Users/micha/Documents/GitHub/SDev-CA1-JCMB/app/views/login.scala.html
                  HASH: f0ffe8b8ef6eb83f414493cda1b25b137a305398
                  MATRIX: 651->1|678->22|1013->44|1123->83|1168->81|1195->99|1222->101|1243->114|1282->116|1313->121|1439->220|1477->249|1517->251|1558->264|1634->313|1652->322|1693->342|1752->370|1789->380|1828->410|1868->412|1909->425|1981->470|1995->475|2037->496|2078->509|2123->523|2162->535|2177->541|2235->590|2275->592|2316->606|2329->610|2360->620|2402->634|2467->672|2608->792|2649->805|2733->862|2884->992|2925->1005|3106->1155|3134->1156
                  LINES: 24->1|25->2|30->4|33->5|36->4|37->6|38->7|38->7|38->7|39->8|42->11|42->11|42->11|43->12|44->13|44->13|44->13|46->15|47->16|47->16|47->16|48->17|49->18|49->18|49->18|50->19|51->20|54->23|54->23|54->23|54->23|55->24|55->24|55->24|57->26|58->27|59->28|60->29|62->31|63->32|64->33|68->37|69->38
                  -- GENERATED --
              */
          