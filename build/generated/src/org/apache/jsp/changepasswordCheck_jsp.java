package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class changepasswordCheck_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Change password check</h1>\n");
      out.write("        \n");
      out.write("        ");

            String s1oldpass=request.getParameter("oldpass");
            String s1newpass=request.getParameter("newpass");

            String s1cnpass=request.getParameter("cnpass");
            
            //out.println(s1oldpass);
            //out.println(s1newpass);
            //out.println(s1cnpass);
            
            try
            {
                if(s1newpass.equals(s1cnpass))
                {
                    if(session.getAttribute("password").equals(s1oldpass))
                    {
                        try
                        {
                            String loginuid = session.getAttribute("loginuid").toString();
                            String updatepassquery="update logintable set userpassword=? where userid=?";
                            PreparedStatement pst =con.prepareStatement(updatepassquery);
                            pst.setString(1, s1newpass);
                            pst.setString(2, loginuid);
                            pst.executeUpdate();
                            out.println("Dear"+ loginuid + " password changeddd..<br>");
                            
                            session.invalidate();
                            response.setHeader("Cache-Control","no-store");
                            response.setHeader("pragma","no-cache");
                            response.setHeader("Expires","0");//prevents caching at the proxy server
                            
                            
                            out.println("<a href=login.jsp>login AGAIN</a>");
                            
                        }
                        
                        catch(Exception ee)
                        {
                            out.println("<br>Password not change" +ee);
                        }
                        
                    }
                }
                  else 
                 {
                      out.println("<br> NEW PASSWORD & confirm password not match ");
                
                
                  }
                
            }
            
            catch (Exception e)
            {
                out.println(e);
            }

            
            
      out.write("\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("    \n");
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
