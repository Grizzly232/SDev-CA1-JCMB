
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

object project extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.Project,List[models.Employee],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name: String, project: models.Project, collaborators: List[models.Employee]):play.twirl.api.HtmlFormat.Appendable = {
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
Seq[Any](format.raw/*1.79*/(""" """),format.raw/*1.80*/("""<!Michael Brady X00136103>

"""),format.raw/*10.2*/("""

"""),_display_(/*12.2*/main("JCMB Inc. ")/*12.20*/ {_display_(Seq[Any](format.raw/*12.22*/("""
    """),format.raw/*13.5*/("""<div class="wrapper">
        <div class="container">
            <div class="well well-lg">
                <div class="row">
                    <img src=""""),_display_(/*17.32*/routes/*17.38*/.Assets.versioned("images/brain.jpg")),format.raw/*17.75*/("""">
                    <h1>"""),_display_(/*18.26*/project/*18.33*/.getProjectName),format.raw/*18.48*/("""</h1>
                    <h4>"""),_display_(/*19.26*/project/*19.33*/.getDescription),format.raw/*19.48*/("""</h4>
                </div>
                <div class="row">
                    <h1>Project Collaborators</h1>
                    <table class="table table-bordered">
                        <tr>
                            <th>ID</th>
                            <th>Firstname</th>
                            <th>Lastname</th>
                            <th>Age</th>
                            <th>Position</th>
                        </tr>
                        """),_display_(/*31.26*/for(emp<-collaborators) yield /*31.49*/ {_display_(Seq[Any](format.raw/*31.51*/("""
                            """),format.raw/*32.29*/("""<tr>
                                <td>"""),_display_(/*33.38*/emp/*33.41*/.getEmp_id),format.raw/*33.51*/("""</td>
                                <td>"""),_display_(/*34.38*/emp/*34.41*/.getfName()),format.raw/*34.52*/("""</td>
                                <td>"""),_display_(/*35.38*/emp/*35.41*/.getlName()),format.raw/*35.52*/("""</td>
                                <td>"""),_display_(/*36.38*/emp/*36.41*/.getAge()),format.raw/*36.50*/("""</td>
                                <td>"""),_display_(/*37.38*/emp/*37.41*/.getPosition()),format.raw/*37.55*/("""</td>
                            </tr>
                        """)))}),format.raw/*39.26*/("""
                    """),format.raw/*40.21*/("""</table>
                </div>
            </div>
        </div>
    </div>
""")))}),format.raw/*45.2*/("""
"""))
      }
    }
  }

  def render(name:String,project:models.Project,collaborators:List[models.Employee]): play.twirl.api.HtmlFormat.Appendable = apply(name,project,collaborators)

  def f:((String,models.Project,List[models.Employee]) => play.twirl.api.HtmlFormat.Appendable) = (name,project,collaborators) => apply(name,project,collaborators)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 11 21:48:21 GMT 2018
                  SOURCE: C:/Users/micha/Documents/GitHub/SDev-CA1-JCMB/app/views/project.scala.html
                  HASH: bab63b65bc9a8f989c0c1125a442e7e8afc03083
                  MATRIX: 987->1|1142->108|1156->115|1236->119|1267->124|1307->138|1321->144|1394->197|1511->287|1539->288|1583->305|1656->351|1684->352|1741->78|1769->79|1824->370|1853->373|1880->391|1920->393|1952->398|2137->556|2152->562|2210->599|2265->627|2281->634|2317->649|2375->680|2391->687|2427->702|2929->1177|2968->1200|3008->1202|3065->1231|3134->1273|3146->1276|3177->1286|3247->1329|3259->1332|3291->1343|3361->1386|3373->1389|3405->1400|3475->1443|3487->1446|3517->1455|3587->1498|3599->1501|3634->1515|3730->1580|3779->1601|3887->1679
                  LINES: 28->1|32->3|32->3|34->3|35->4|35->4|35->4|35->4|37->6|37->6|38->7|39->8|39->8|42->1|42->1|44->10|46->12|46->12|46->12|47->13|51->17|51->17|51->17|52->18|52->18|52->18|53->19|53->19|53->19|65->31|65->31|65->31|66->32|67->33|67->33|67->33|68->34|68->34|68->34|69->35|69->35|69->35|70->36|70->36|70->36|71->37|71->37|71->37|73->39|74->40|79->45
                  -- GENERATED --
              */
          