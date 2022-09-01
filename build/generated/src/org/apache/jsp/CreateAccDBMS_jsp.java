package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class CreateAccDBMS_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <h1>Create Account</h1>\n");
      out.write("        ");

                        String accno=request.getParameter("accno");
                        
                        String name=request.getParameter("name");
                        String gender=request.getParameter("gender");
                        String dob=request.getParameter("dob");

                        String address=request.getParameter("address");
                        String contactno=request.getParameter("contactno");
                        String role=request.getParameter("role");
                        
//                        out.println(accno);
//                        out.println(name);
//                        out.println(gender);
//                        out.println(dob);
//                        out.println(address);
//                        out.println(contactno);
//                        out.println(role);
                        
                        try
                        {
                            String newaccountinsert="insert into account values (?,?,?,?,?,?,?);";
                            PreparedStatement pst=con.prepareStatement(newaccountinsert);
                            
                            pst.setString(1,accno);
                            pst.setString(2,name);
                            pst.setString(3,gender);
                            pst.setString(4,dob);
                            pst.setString(5,address);
                            pst.setInt(6,Integer.parseInt(contactno));
                            pst.setString(7,role);
                            
                            pst.executeUpdate();
                            out.println("Hoorayy..running successfully");
                            
                            String customeraccount="create table "+accno+"(accno varchar(20),ref varchar(20),dotrans varchar(20),transId varchar(20),depamount int,wdrwamount int,netbal int);";
                            
                            PreparedStatement pst2=con.prepareStatement(customeraccount);
                            pst2.executeUpdate();
                             
                            
                        }
                        catch(Exception e){
                            out.println(e.getMessage());
                            
                            
                        }
                        
                        
                        
                        
                        
                   
      out.write(" \n");
      out.write("                   \n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
