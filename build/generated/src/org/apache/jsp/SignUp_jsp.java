package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SignUp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <title>How it works</title>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\n");
      out.write("  <script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/styles.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<nav class=\"navbar navbar-inverse\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span> \n");
      out.write("      </button>\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\">Blood Bank Portal</a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("        <li class=\"active\"><a href=\"index.html\">Home</a></li>\n");
      out.write("        <li><a href=\"how.html\">How it Works</a></li>\n");
      out.write("        <li><a href=\"map.html\">Search a Blood Group</a></li> \n");
      out.write("        <li><a href=\"conn.html\">Contact Us</a></li> \n");
      out.write("      </ul>\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("        <li><a href=\"signup.html\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up</a></li>\n");
      out.write("        <li><a href=\"login.html\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\t\n");
      out.write("<div class=\"row\"  style=\"margin-top:-1%;\">\n");
      out.write("    <h2 class=\"text-info\" style=\"text-align:center\">User Registration</h2>\n");
      out.write("    <div class=\"col-md-8 col-md-offset-3\" style=\"margin-top: 1%;\">\n");
      out.write("        <form class=\"form-horizontal\" action=\"saveServer\" method=\"POST\" role=\"form\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"name\" class=\"col-md-2 control-label\">Name : </label>\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <input type=\"name\" required name=\"name\" class=\"form-control\" id=\"name\"\n");
      out.write("                        placeholder=\"Enter Your Full Name\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"email\" class=\"col-sm-2 control-label\">Email : </label>\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <input type=\"email\" required  name=\"email\" class=\"form-control\" id=\"email\"\n");
      out.write("                        placeholder=\"example@example.com\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"password\" class=\"col-md-2 control-label\">Password : </label>\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <input type=\"password\" required name=\"pass\" class=\"form-control\" id=\"password\"\n");
      out.write("                        placeholder=\"Enter Password\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"contact\" class=\"col-sm-2 control-label\">Contact No. : </label>\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <input type=\"number\" required  name=\"contact\" class=\"form-control\" id=\"contact\"\n");
      out.write("                        placeholder=\"Enter Your Mobile No.\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                 <div class=\"form-group\">\n");
      out.write("                    <label for=\"contact\" class=\"col-sm-2 control-label\">Blood Group : </label>\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <input type=\"number\" required  name=\"bg\" class=\"form-control\" id=\"BG\"\n");
      out.write("                        placeholder=\"Enter Your Blood Group\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                 <div class=\"form-group\">\n");
      out.write("                    <label for=\"contact\" class=\"col-sm-2 control-label\">Location : </label>\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <input type=\"number\" required  name=\"loc\" class=\"form-control\" id=\"LO\"\n");
      out.write("                        placeholder=\"Enter Your Location.\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <div class=\"col-sm-offset-2 col-md-6\">\n");
      out.write("                        <button type=\"submit\" name=\"submit\" class=\"btn btn-info btn-md btn-block\">Sign Up</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
