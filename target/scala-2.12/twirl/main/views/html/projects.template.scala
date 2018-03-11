
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

object projects extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,List[models.Project],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(hello: String, projects: List[models.Project]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*3.2*/scripts/*3.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.13*/("""
    """),format.raw/*4.5*/("""<script src=""""),_display_(/*4.19*/routes/*4.25*/.Assets.versioned("javascripts/jquery-3.2.1.slim.js")),format.raw/*4.78*/(""""></script>
    <script type="text/javascript">
            $(document).ready(function () """),format.raw/*6.43*/("""{"""),format.raw/*6.44*/("""
                """),format.raw/*7.17*/("""$('.dropdown-toggle').dropdown();
            """),format.raw/*8.13*/("""}"""),format.raw/*8.14*/(""");
    </script>
""")))};
Seq[Any](format.raw/*1.49*/(""" """),format.raw/*1.50*/("""<!Michael Brady X00136103>

"""),format.raw/*10.2*/("""

"""),_display_(/*12.2*/main("JCMB Inc. Projects")/*12.28*/ {_display_(Seq[Any](format.raw/*12.30*/("""
    """),format.raw/*13.5*/("""<div class="wrapper">
        <div class="row">
            <div class="col-sm-2 project filter">
                <h4>Filter</h4>
            </div>
            """),_display_(/*18.14*/for(p<-projects) yield /*18.30*/ {_display_(Seq[Any](format.raw/*18.32*/("""
            """),format.raw/*19.13*/("""<div class="col-sm-10 project">
                <img src="assets/images/brain.jpg">
                <h1>"""),_display_(/*21.22*/p/*21.23*/.getProjectName),format.raw/*21.38*/("""</h1>
                <h3>"""),_display_(/*22.22*/p/*22.23*/.getCategory),format.raw/*22.35*/("""</h3>
                <h4>"""),_display_(/*23.22*/p/*23.23*/.getDescription),format.raw/*23.38*/("""</h4>
                <form action=""""),_display_(/*24.32*/routes/*24.38*/.HomeController.project(new String(p.getProjectName))),format.raw/*24.91*/("""">
                    <button type="submit" class="btn btn-success" value="View project">View</button>
                </form>
                <div class="clear"></div>
            </div>
            """)))}),format.raw/*29.14*/("""
        """),format.raw/*30.9*/("""</div>
    </div>
""")))}),format.raw/*32.2*/("""
"""))
      }
    }
  }

  def render(hello:String,projects:List[models.Project]): play.twirl.api.HtmlFormat.Appendable = apply(hello,projects)

  def f:((String,List[models.Project]) => play.twirl.api.HtmlFormat.Appendable) = (hello,projects) => apply(hello,projects)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 11 21:48:21 GMT 2018
                  SOURCE: C:/Users/micha/Documents/GitHub/SDev-CA1-JCMB/app/views/projects.scala.html
                  HASH: 6b5caf49be8df466583be62554bbc80f2703ed21
                  MATRIX: 972->1|1097->78|1111->85|1191->89|1222->94|1262->108|1276->114|1349->167|1466->257|1494->258|1538->275|1611->321|1639->322|1696->48|1724->49|1779->340|1808->343|1843->369|1883->371|1915->376|2104->538|2136->554|2176->556|2217->569|2349->674|2359->675|2395->690|2449->717|2459->718|2492->730|2546->757|2556->758|2592->773|2656->810|2671->816|2745->869|2978->1071|3014->1080|3063->1099
                  LINES: 28->1|32->3|32->3|34->3|35->4|35->4|35->4|35->4|37->6|37->6|38->7|39->8|39->8|42->1|42->1|44->10|46->12|46->12|46->12|47->13|52->18|52->18|52->18|53->19|55->21|55->21|55->21|56->22|56->22|56->22|57->23|57->23|57->23|58->24|58->24|58->24|63->29|64->30|66->32
                  -- GENERATED --
              */
          