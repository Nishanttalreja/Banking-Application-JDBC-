package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class ForgetPasswordDBMS_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        ");

            String s0=request.getParameter("f0");
            String s1=request.getParameter("f1");
            String s2=request.getParameter("f2");
            String sques=request.getParameter("sques");
            String sans=request.getParameter("sans");
            
            
            try
        {
            String viewquery="select * from account where accno='"+s0+"';";
            Statement stmt=con.createStatement();
            
            ResultSet res=stmt.executeQuery(s1);
            int count=0;
            
            
            while (res.next()){
                count++;
                out.println("details enter successfully");
                if(sques.equals(res.getString(9)) && sans.equals(res.getString(10))){
                    
                    session.setAttribute("user1",s0);
                    out.println(session.getAttribute("user1"));
                    if(s1.equals(s2)){
                        
                        String updatepassquery="update account set password=? where accno=?";
                        PreparedStatement pst =con.prepareStatement(updatepassquery);
                    
                    
                    pst.setString(1, s1);
                    
                            pst.setString(2,s0);
                    pst.executeUpdate();
                    out.println("Password updated....");
                        
                    }
                    
                    
                    
//                    RequestDispatcher dis=request.getRequestDispatcher("login.jsp");
//                    dis.forward(request,response);
                    
                }
                else {
                    out.println("Nooooo");
                }
                
            }
        }
        catch(Exception e){
            out.println(e.getMessage());
        }
        
      out.write("\n");
      out.write("        \n");
      out.write("            \n");
      out.write("        %>\n");
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
