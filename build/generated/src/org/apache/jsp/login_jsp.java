package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("body {\n");
      out.write("  background-image: url('bank.jpg');\n");
      out.write("  \n");
      out.write("  background-repeat: no-repeat;\n");
      out.write("  background-size: 100% 100%;\n");
      out.write("  \n");
      out.write("}\n");
      out.write("  h1 {\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("   \n");
      out.write("    \n");
      out.write("    <body bgcolor=\"YELLOW\" align=\"center\">\n");
      out.write("        <h1>Login page</h1>\n");
      out.write("        <form action=\"Check.jsp\" method=\"post\">\n");
      out.write("            \n");
      out.write("            <table border=\"2\" bgcolor=\"grey\" >\n");
      out.write("                <tr><td>Select Role</td>\n");
      out.write("                    <td><select name=\"role\">\n");
      out.write("                          <option>Admin</option>\n");
      out.write("                              <option>Customer</option>\n");
      out.write("                          \n");
      out.write("            </td> </select>\n");
      out.write("            </tr><br>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td>Enter Account Number</td>\n");
      out.write("                <td><input type=\"text\" name=\"accountno\"></td><br>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td> Enter Password</td>\n");
      out.write("                <td><input type=\"text\" name=\"password\"></td><br>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td><input type=\"submit\" name=\"b1\" value=\"Login\"></td>\n");
      out.write("            <td><input type=\"reset\" name=\"b2\" value=\"RESET\"></td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            </table>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
