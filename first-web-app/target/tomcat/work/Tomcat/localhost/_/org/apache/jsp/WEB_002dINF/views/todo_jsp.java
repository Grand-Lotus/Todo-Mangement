/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-11-16 13:28:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;

public final class todo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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

      out.write("<!-- we have to add the tag library from the address bellow -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	Date date = new Date();

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<meta name=\"description\" content=\"Free Web tutorials\">\r\n");
      out.write("<meta name=\"keywords\" content=\"HTML,CSS,XML,JavaScript\">\r\n");
      out.write("<meta name=\"author\" content=\"Hege Refsnes\">\r\n");
      out.write("<!-- <meta http-equiv=\"refresh\" content=\"5\"> -->\r\n");
      out.write("<link href=\"webjars/bootstrap/4.0.0/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<title>Todo Page</title>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("body {\r\n");
      out.write("\tbackground-color: #ffffff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h1 {\r\n");
      out.write("\tcolor: blue;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("p {\r\n");
      out.write("\tcolor: green;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul#menu li {\r\n");
      out.write("\tdisplay: inline;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul#menu li a {\r\n");
      out.write("\tbackground-color: black;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\tpadding: 10px 20px;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\tborder-radius: 4px 4px 0 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul#menu li a:hover {\r\n");
      out.write("\tbackground-color: orange;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("table {\r\n");
      out.write("\tborder-collapse: collapse;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("th, td {\r\n");
      out.write("\ttext-align: left;\r\n");
      out.write("\tpadding: 8px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("tr:nth-child(even) {\r\n");
      out.write("\tbackground-color: #f2f2f2\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("th {\r\n");
      out.write("\tbackground-color: #4CAF50;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn {\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\tbackground-color: #f44336;\r\n");
      out.write("\tcolor: #FFFFFF;\r\n");
      out.write("\tpadding: 14px 25px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\tfont-size: 16px;\r\n");
      out.write("\tmargin-left: 20px;\r\n");
      out.write("\topacity: 0.9;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("footer {\r\n");
      out.write("\tposition: fixed;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\ttop: 20;\r\n");
      out.write("\tbackground: black;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tpadding: 5px;\r\n");
      out.write("\tbackground: black;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<ul id=\"menu\">\r\n");
      out.write("\t\t<li><a href=\"#\">java</a></li>\r\n");
      out.write("\t\t<li><a href=\"#\">HTML 5</a></li>\r\n");
      out.write("\t\t<li><a href=\"#\">CSS 3</a></li>\r\n");
      out.write("\t\t<li><a href=\"\">JavaScript</a></li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t<h1>Hello ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h1>\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\tyour todo list are given bellow:<br>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>Course Name</th>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<th>Options</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div>");
      out.print(date);
      out.write("</div>\r\n");
      out.write("\t<form action=\"\\todo.do\" method=\"post\">\r\n");
      out.write("\t\t<input type=\"text\" name=\"newTodo\">\r\n");
      out.write("\t\t<!-- <input type=\"text\"\r\n");
      out.write("\t\t\tname=\"price\"> -->\r\n");
      out.write("\t\t<input type=\"submit\">\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"wbjars/jquery/1.9.1/jquery.min.js\"></script>\r\n");
      out.write("\t<script src=\"wbjars/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("<footer> Copyright © a2j.com </footer>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- valid user  -> welcome .jsp -->\r\n");
      out.write("<!-- invalid user -> ligin.jsp -->");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/views/todo.jsp(111,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/todo.jsp(111,4) '${todos}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${todos}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/todo.jsp(111,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("todo");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${todo.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t<td><a\r\n");
          out.write("\t\t\t\t\t\t\thref=\"deleteTodo.do?todo=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${todo.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\"\r\n");
          out.write("\t\t\t\t\t\t\tclass=\"btn\">Delete</a></td>\r\n");
          out.write("\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
