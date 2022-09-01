package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Random;
import java.sql.*;

public final class DepositDBMS_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write('\n');
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>deposit dbms</h1>\n");
      out.write("       ");

                       
                        
                        String accountno=request.getParameter("accountno");
                        String ref=request.getParameter("ref");
                        String date=request.getParameter("date");
                        Random random  = new Random();
                        
                        int tId = random.nextInt();
                        String transid = ""+tId;
                        String amount=request.getParameter("amount");
                        

                       
                        
                        
//                        out.println(accountno);
//                        out.println(ref);
//                         out.println(date);
//                        out.println(transid);
//                        out.println(amount);
                        try{
                            String viewquery="select * from transactionbank;";
                           
                            Statement stmt=con.createStatement();
                            ResultSet rs=stmt.executeQuery(viewquery);
                            
                            int lastbal=0;
                            while(rs.next()){
                                lastbal=rs.getInt(7);
                            }
                            
                            
                            String cashdepquery="insert into transactionbank values(?,?,?,?,?,?,?);";
                            PreparedStatement pst=con.prepareStatement(cashdepquery);
                            
                            pst.setString(1,accountno);
                            pst.setString(2,ref);
                            pst.setString(3,date);
                            pst.setString(4,transid);
                            pst.setInt(5,Integer.parseInt(amount));
                            pst.setInt(6,0);
                            pst.setInt(7,(lastbal+Integer.parseInt(amount)));
                            
                            
                            pst.executeUpdate();
                            out.println("transaction successfull done ..cash deposit");
                            
                            
                             String viewquerycustomer="select * from "+accountno;
                             Statement stmt2=con.createStatement();

                             ResultSet rs2=stmt2.executeQuery(viewquerycustomer);
                             
                             int lastbalcust=0;
                             while(rs2.next()){
                                 lastbalcust=rs2.getInt(7);
                             }
                             String cashdepqueryincustomer="insert into "+accountno+" values(?,?,?,?,?,?,?);";
                             PreparedStatement pst2=con.prepareStatement(cashdepqueryincustomer);
                             
                           pst2.setString(1,accountno);
                           pst2.setString(2,ref);
                           pst2.setString(3,date);
                           pst2.setString(4,transid);
                           pst2.setInt(5,Integer.parseInt(amount));
                           pst2.setInt(6,0); 
                           pst2.setInt(7,(lastbalcust+Integer.parseInt(amount)));
                           
                            pst2.executeUpdate();
                            
                            
                             String invquery="select * from "+accountno+" where transid='"+transid+"';";
                             PreparedStatement stmt3=con.prepareStatement(invquery);
                             ResultSet rs3=stmt.executeQuery(invquery);
                             
                             while (rs3.next()){
                                out.println("<table border=2 bgcolor=orange>");
                                out.println("<tr>");
                                out.println("<td> acoount no. </td>");
                                out.println("<td> "+rs3.getString(1)+"</td>");
                                out.println("</tr>");
                                out.println("<tr>");
                                out.println("<td> Name </td>");
                                out.println("<td>"+rs3.getString(2)+"</td>");
                                out.println("</tr>");
                                out.println("<tr>");
                                out.println("<td> Gender </td>");
                                out.println("<td>"+rs3.getString(3)+"</td>");
                                out.println("</tr>");
                                out.println("<tr>");
                                out.println("<td> Date </td>");
                                out.println("<td>"+rs3.getString(4)+"</td>");
                                out.println("</tr>");
                                out.println("<tr>");
                                out.println("<td> Address </td>");
                                out.println("<td>"+rs3.getString(5)+"</td>");
                                out.println("</tr>");
                                out.println("<tr>");
                                out.println("<td> Tid </td>");
                                out.println("<td>"+rs3.getString(6)+"</td>");
                                out.println("</tr>");
                                out.println("<tr>");
                                out.println("<td> REF </td>");
                                out.println("<td>"+rs3.getString(7)+"</td>");
                                out.println("</tr>");
                                out.println("</table>");

                    
                }
               
                            
                            
                            
                            
      out.write("\n");
      out.write("                            <button onclick=\"window.print();\">Print this page</button>)\n");
      out.write("                            ");

                            
//                            out.println("---------deposit success");
//                            response.sendRedirect("print.jsp");
//                             
                            
                            
                        }
                        catch(Exception e ){
                            out.println(e);
                            
                        }                        
                        
                        
                        
                        
                        
                   
      out.write(" \n");
      out.write("                   \n");
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
