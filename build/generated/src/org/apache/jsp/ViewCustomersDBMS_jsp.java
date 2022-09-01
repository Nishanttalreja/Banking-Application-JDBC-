package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class ViewCustomersDBMS_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

Connection con;
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/DBCON.jsp");
  }

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

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("        ");

            try
            {
               Class.forName("com.mysql.jdbc.Driver");
            String connectionURL=("jdbc:mysql://localhost:3306/soprabanking");
            String DBUSER="root";
            String DBPASS="root";
            con=DriverManager.getConnection(connectionURL,DBUSER,DBPASS);
            
            out.println("Connection Success");
                
                        
                
            }
                catch (Exception e){
                        out.println("connection failed...."+e.getMessage());
                }
            
      out.write("\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <body>\n");
      out.write("        <form>\n");
      out.write("            ");

                String a1=request.getParameter("Opt1");
               // String a2=request.getParameter("Account Number");
                String accno=request.getParameter("txt1");
                
                String viewquery="";
                try{
                    if(a1.equals("ALL"))
                    {
                        viewquery="select * from account;";
                        
                   
                    }
                    else if(a1.equalsIgnoreCase("AccountNumber")){
                        viewquery="select * from account where accno='"+accno+"';";
                        
                        
                    }
                    Statement pst=con.createStatement();
                        ResultSet rs=pst.executeQuery(viewquery);
                        
                        while(rs.next())
                        {
                    out.println("<table border=2 bgcolor=pink>");
                    out.println("<tr>");
                    out.println("<td> acoount no. </td>");
                    out.println("<td> "+rs.getString(1)+"</td>");
                    out.println("</tr>");
                    out.println("<tr>");
                    out.println("<td> Name </td>");
                    out.println("<td>"+rs.getString(2)+"</td>");
                    out.println("</tr>");
                    out.println("<tr>");
                    out.println("<td> Gender </td>");
                    out.println("<td>"+rs.getString(3)+"</td>");
                    out.println("</tr>");
                    out.println("<tr>");
                    out.println("<td> Date </td>");
                    out.println("<td>"+rs.getString(4)+"</td>");
                    out.println("</tr>");
                    out.println("<tr>");
                    out.println("<td> Address </td>");
                    out.println("<td>"+rs.getString(5)+"</td>");
                    out.println("</tr>");
                    out.println("<tr>");
                    out.println("<td> Tid </td>");
                    out.println("<td>"+rs.getString(6)+"</td>");
                    out.println("</tr>");
                    out.println("<tr>");
                    out.println("<td> REF </td>");
                    out.println("<td>"+rs.getString(7)+"</td>");
                    out.println("</tr>");
                    out.println("</table>");
                    
                    
                        }
                        
                        out.println("adjajdja");
                }
                catch(Exception e)
                {
                    out.println(e);
                    
                }
            
      out.write("\n");
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
