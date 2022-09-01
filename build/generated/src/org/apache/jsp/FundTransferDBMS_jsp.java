package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class FundTransferDBMS_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("       \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1> Fund Transfer DBMS</h1>\n");
      out.write("        ");

        
                        String transId=request.getParameter("transId");
                        String accountfr=(String)session.getAttribute("accountno");
                        
                        String accounto=request.getParameter("accounto");
                        
                        String date=request.getParameter("date");
                        String amount=request.getParameter("amount");
                        
                        

                       
                        
//                        out.println(transid);
//                         out.println(accountfr);
//                        out.println(accountto);
//                        out.println(amount);
//                        out.println(date);
//                        out.println(amount);
                        
                        
                        try{
                           String viewquery="select * from " + accountfr;
                           Statement stmt=con.createStatement();
                           ResultSet rs=stmt.executeQuery(viewquery);
                           
                           int lastbal=0;
                           while (rs.next()){
                               lastbal=rs.getInt(7);
                           }
                           String cashdepquery="insert into "+accountfr+" values(?,?,?,?,?,?,?);";
                           PreparedStatement pst=con.prepareStatement(cashdepquery);
                           pst.setString(1,accountfr);
                            pst.setString(2,accounto);
                             pst.setString(3,date);
                              pst.setString(4,transId);
                              pst.setInt(5,0);
                              pst.setInt(6,Integer.parseInt(amount));
                              pst.setInt(7,(lastbal-Integer.parseInt(amount)));
                              
                              pst.executeUpdate();
                                  
                            out.println("Fund transfer done...");
                            
                            
                            /////////////////////////////////////////////////////////////
                            
                            String viewquery2="select * from "+accounto;
                           Statement stmt2=con.createStatement();
                           ResultSet rs2=stmt2.executeQuery(viewquery2);
                            
                            
                            int lastbal2=0;
                            while (rs2.next()){
                                lastbal2=rs2.getInt(7);
                            }
                          
                            String cashdepquery2="insert into "+accounto+" values(?,?,?,?,?,?,?);";
                           PreparedStatement pst2=con.prepareStatement(cashdepquery2);
                           pst.setString(1,accounto);
                            pst.setString(2,accountfr);
                             pst.setString(3,date);
                              pst.setString(4,transId);
                              pst.setInt(5,Integer.parseInt(amount));
                              pst.setInt(6,0);
                              pst.setInt(7,(lastbal2+Integer.parseInt(amount)));
                              
                              pst.executeUpdate();
                                  
                            out.println("Fund 222222222transfer done...");
                            
                            
                            
                        }
                        catch(Exception e){
                            out.println(e.getMessage());
                        }
                        
      out.write("\n");
      out.write("                        \n");
      out.write("                        \n");
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
