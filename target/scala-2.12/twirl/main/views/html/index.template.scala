
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(hello: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*3.2*/scripts/*3.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.13*/("""
	"""),format.raw/*4.2*/("""<script src=""""),_display_(/*4.16*/routes/*4.22*/.Assets.versioned("javascripts/jquery-3.2.1.slim.js")),format.raw/*4.75*/(""""></script>
	<script type="text/javascript">  
        $(document).ready(function () """),format.raw/*6.39*/("""{"""),format.raw/*6.40*/("""  
            """),format.raw/*7.13*/("""$('.dropdown-toggle').dropdown();  
        """),format.raw/*8.9*/("""}"""),format.raw/*8.10*/(""");  
   </script> 
""")))};
Seq[Any](format.raw/*1.17*/(""" """),format.raw/*1.18*/("""<!Michael Brady X00136103>

"""),format.raw/*10.2*/("""

"""),_display_(/*12.2*/main("JCMB Inc.")/*12.19*/ {_display_(Seq[Any](format.raw/*12.21*/("""
	"""),format.raw/*13.2*/("""<h1>"""),_display_(/*13.7*/hello),format.raw/*13.12*/("""</h1>
""")))}),format.raw/*14.2*/("""
"""))
      }
    }
  }

  def render(hello:String): play.twirl.api.HtmlFormat.Appendable = apply(hello)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (hello) => apply(hello)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 11 21:48:20 GMT 2018
                  SOURCE: C:/Users/micha/Documents/GitHub/SDev-CA1-JCMB/app/views/index.scala.html
                  HASH: 830cc430b007428b3351e53be3a85b054f4ec6cf
                  MATRIX: 948->1|1041->46|1055->53|1135->57|1163->59|1203->73|1217->79|1290->132|1402->217|1430->218|1472->233|1542->277|1570->278|1629->16|1657->17|1712->298|1741->301|1767->318|1807->320|1836->322|1867->327|1893->332|1930->339
                  LINES: 28->1|32->3|32->3|34->3|35->4|35->4|35->4|35->4|37->6|37->6|38->7|39->8|39->8|42->1|42->1|44->10|46->12|46->12|46->12|47->13|47->13|47->13|48->14
                  -- GENERATED --
              */
          