/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-12-10 18:25:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/views/commonThingsInView/header.jspf", Long.valueOf(1544466340789L));
    _jspx_dependants.put("/WEB-INF/views/commonThingsInView/footer.jspf", Long.valueOf(1542731549341L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");

	Date date = new Date();

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Welcome to A2j server</title>\r\n");
      out.write("<link href=\"webjars/bootstrap/3.3.6/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"css/style.css\" />\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("legend {\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tfont-size: 25px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("legend, input[type=text], [type=password], select {\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\tpadding: 12px 20px;\r\n");
      out.write("\tmargin: 8px 0;\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\tborder: 1px solid #ccc;\r\n");
      out.write("\tborder-radius: 4px;\r\n");
      out.write("\tbox-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=submit] {\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\tbackground-color: #4CAF50;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\tpadding: 14px 20px;\r\n");
      out.write("\tmargin: 8px 0;\r\n");
      out.write("\tborder: none;\r\n");
      out.write("\tborder-radius: 4px;\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=submit]:hover {\r\n");
      out.write("\tbackground-color: #45a049;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("div.forms {\r\n");
      out.write("\tborder-radius: 5px;\r\n");
      out.write("\tbackground-color: #f2f2f2;\r\n");
      out.write("\tpadding: 40px;\r\n");
      out.write("\tmargin: 180PX 100PX 100PX 100Px\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("header {\r\n");
      out.write("\tposition: fixed;\r\n");
      out.write("\tpadding: 5px;\r\n");
      out.write("\ttop: 0;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\tbackground-color: black;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tbackground-color: black;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("footer {\r\n");
      out.write("\tbackground: black;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tpadding: 5px;\r\n");
      out.write("} -->\r\n");
      out.write("</style> \r\n");
      out.write("</head>\r\n");
      out.write("<body>");
      out.write("\r\n");
      out.write("\t<header>\r\n");
      out.write("\t\t<h1>A2J website is with you to learn java</h1>\r\n");
      out.write("\t</header>\r\n");
      out.write("\t<h1>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${passwordError}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h1>\r\n");
      out.write("\t<div class=\"forms\">\r\n");
      out.write("\t\t<form action=\"/login.do\" method=\"post\">\r\n");
      out.write("\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t<legend>Login</legend>\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"name\" placeholder=\"Enter Your Name\" /> <input\r\n");
      out.write("\t\t\t\t\ttype=\"password\" name=\"password\" placeholder=\"Enter Your Password\" />\r\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"Login\" />\r\n");
      out.write("\t\t\t</fieldset>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<footer> Copyright © a2j.com </footer>\r\n");
      out.write("\t<script src=\"webjars/jquery/1.9.1/jquery.min.js\"></script>\r\n");
      out.write("\t<script src=\"webjars/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write('\r');
      out.write('\n');
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
