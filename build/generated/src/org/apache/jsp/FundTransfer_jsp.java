package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class FundTransfer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Fund Transfer</h1>\n");
      out.write("        ");
 out.println(session.getAttribute("loginname"));
        out.println("    "+ session.getAttribute("accountno"));
        
        
      out.write("\n");
      out.write("        <form action=\"FundTransferDBMS.jsp\" method=\"post\">\n");
      out.write("            <table border=\"4\" >\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        Transaction Id \n");
      out.write("                        \n");
      out.write("                    </td>\n");
      out.write("                    <td><input type=\"text\" name =\"transId\"></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("<!--                <tr>\n");
      out.write("                   <td>Account from </td>\n");
      out.write("                        \n");
      out.write("                    \n");
      out.write("                    <td><input type=\"text\" name =\"accountfr\" value=\"\"></td>\n");
      out.write("                </tr>-->\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                   <td>Account to </td>\n");
      out.write("                        \n");
      out.write("                    \n");
      out.write("                    <td><input type=\"text\" name =\"accounto\"></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                   <td>Date </td>\n");
      out.write("                        \n");
      out.write("                    \n");
      out.write("                    <td><input type=\"date\" name =\"date\"></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                   <td>Amount </td>\n");
      out.write("                        \n");
      out.write("                    \n");
      out.write("                    <td><input type=\"text\" name =\"amount\"></td>\n");
      out.write("                \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                    <td><input type=\"submit\" name=\"b1\" value=\"TransferNow\"></td>\n");
      out.write("                    <td><input type=\"RESET\" name=\"b2\" value=\"Reset\"></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("alter table account\n");
      out.write("add column password varchar(20),\n");
      out.write("sques varchar(20),\n");
      out.write("sans varchar(20);");
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
