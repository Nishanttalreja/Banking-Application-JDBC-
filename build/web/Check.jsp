<%@include file="DBCON.jsp" %>
<%@ page import="java.sql.*,java.util.*,java.text.*,java.text.SimpleDateFormat" %>

<html>
    
    <body>
        <h1>check page</h1>
        <%
            String role = request.getParameter("role");
            String accountnumber = request.getParameter("accountno");
            String upass = request.getParameter("password");
            
            
            
            
            String  loginname="";
            try
            {
                String viewquery="select * from account";
                Statement stmt= con.createStatement();
                ResultSet rs=stmt.executeQuery(viewquery);
                HttpSession hs = request.getSession();
                
                int count=0;
                while(rs.next())
                {
                    if(role.equalsIgnoreCase(rs.getString(7)) && accountnumber.equalsIgnoreCase(rs.getString(1)) && upass.equals(rs.getString(8)))
                    {
//                        session.setAttribute("user_id", role);
//                        session.setAttribute("pass_word", upass);
                        session.setMaxInactiveInterval(2);
                        count++;
                        loginname=rs.getString(2);
                        break;
                    }
                   
                } 
                
                
                
                
                
                
                if(count>0)
                {
                    session.setAttribute("accountno", accountnumber);
                    session.setAttribute("loginname",loginname);
                    session.setAttribute("password",upass);

                    
                    if(role.equalsIgnoreCase("ADMIN"))
                    {
                        response.sendRedirect("Admin.jsp");
                    }
                    else
                    {
                        response.sendRedirect("CustomerLogin.jsp");
                    }
                    //out.println("login Su,ccess");
                    //response.sendRedirect("Success.jsp");;
                }
                else
                {
                    RequestDispatcher disp=request.getRequestDispatcher("Login.jsp");
                    disp.include(request, response);
                    out.println("<br> Invalid Username and password ");
                }
                    
                
            }
            catch(Exception e)
            {
                out.println("Invalid Login "+e.getMessage());
            }
           
        %>
    </body>
</html>