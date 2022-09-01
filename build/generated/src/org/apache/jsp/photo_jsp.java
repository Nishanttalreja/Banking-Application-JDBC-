package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class photo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("PrintWriter out = response.getWriter();\n");
      out.write("String from = request.getParameter(\"num1\");\n");
      out.write("\n");
      out.write("\n");
      out.write("JCO.Client mconnection =\n");
      out.write("JCO.createClient(\"180\",\n");
      out.write("\"jshaik\",\n");
      out.write("\"1Q2W3E\",\n");
      out.write("\"EN\",\n");
      out.write("\"150.0.150.141\",\n");
      out.write("\"04\");\n");
      out.write("out.write(\"created client\");\n");
      out.write("try{\n");
      out.write("mconnection.connect();\n");
      out.write("\n");
      out.write("JCO.Repository mrepository = new JCO.Repository(\"JCO Sample\",\n");
      out.write("mconnection);\n");
      out.write("\n");
      out.write("IFunctionTemplate functiontemplate =\n");
      out.write("mrepository.getFunctionTemplate(\"HRWPC_RFC_EP_READ_PHOTO_URI\");\n");
      out.write("\n");
      out.write("JCO.Function function = functiontemplate.getFunction();\n");
      out.write("\n");
      out.write("function.getImportParameterList().setValue(from, \"PERNR\");\n");
      out.write("\n");
      out.write("mconnection.execute(function);\n");
      out.write("\n");
      out.write("\n");
      out.write("String customer = function.getExportParameterList().getValue(\"URI\").toString();\n");
      out.write("\n");
      out.write("response.setContentType(\"text/html\");\n");
      out.write("out.write(\"<html>\" +\n");
      out.write("\"<body> \"+\n");
      out.write("\n");
      out.write("//add image tag here with src value as *customer*\n");
      out.write("+\"</body></html>\");\n");
      out.write("\n");
      out.write("}catch(Exception e){\n");
      out.write("out.write(\"exception\");\n");
      out.write("out.write(e.getLocalizedMessage());\n");
      out.write("}finally{\n");
      out.write("mconnection.disconnect();\n");
      out.write("}");
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
