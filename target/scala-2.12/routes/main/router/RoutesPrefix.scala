
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/micha/Documents/GitHub/SDev-CA1-JCMB/conf/routes
// @DATE:Sun Mar 11 21:48:19 GMT 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
