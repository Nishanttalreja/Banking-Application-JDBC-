package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <style>\n");
      out.write("            table{\n");
      out.write("                border-color: orange;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            tr{\n");
      out.write("                height: 50px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            tr:nth-child(even) {\n");
      out.write("                \n");
      out.write("            background-color: #D6EEEE;\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                tr:nth-child(odd) {\n");
      out.write("                \n");
      out.write("            background-color: white;\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"grey\">\n");
      out.write("        <form >\n");
      out.write("        <h1 align=\"center\">ADMIN PAGE</h1>\n");
      out.write("        <table border=\"3\" border-radius=\"10px\" align=\"center\" size=\"50\" style=\"width:30%\">\n");
      out.write("            <tr>\n");
      out.write("                <td> <a href=\"CreateAcc.jsp\">New account</a></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("                 <td><a href=\"ViewCustomers.jsp\">View Customers</a></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("                 <td><a href=\"ViewStatement.jsp\">View Statement</a></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr> \n");
      out.write("                <td> <a href=\"Deposit.jsp\">Deposit</a></td>\n");
      out.write("        <tr>       \n");
      out.write("                <td><a href=\"Withdraw.jsp\">Withdraw</a></td>\n");
      out.write("        </tr>\n");
      out.write("        \n");
      out.write("        </tr>\n");
      out.write("        <tr> \n");
      out.write("                <td><a href=\"Transactions.jsp\">View Transactions</a></td>\n");
      out.write("        </tr>\n");
      out.write("        </table>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
