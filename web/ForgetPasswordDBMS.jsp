<%-- 
    Document   : ForgetPasswordDBMS
    Created on : Aug 22, 2022, 2:48:04 PM
    Author     : ntalreja
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="DBCON.jsp" %>
<html>
    
    <body>
        <%
            String s0=request.getParameter("f0");
            String s1=request.getParameter("f1");
            String s2=request.getParameter("f2");
            String sques=request.getParameter("sques");
            String sans=request.getParameter("sans");
            
            
            try
        {
            String viewquery="select * from account where accno='"+s0+"'";
            Statement stmt=con.createStatement();
            
//                out.println(viewquery);
            ResultSet res=stmt.executeQuery(viewquery);
            int count=0;
            
            
            while (res.next()){
                
                count++;
                out.println("details enter successfully");
                if(sques.equalsIgnoreCase(res.getString(9)) && sans.equalsIgnoreCase(res.getString(10))){
                    
                out.println("hi");
                    session.setAttribute("user1",s0);
                    out.println(session.getAttribute("user1"));
                    if(s1.equals(s2)){
                        
                        String updatepassquery="update account set password=? where accno=?";
                        PreparedStatement pst =con.prepareStatement(updatepassquery);
                    
                    
                    pst.setString(1, s1);
                    
                    pst.setString(2,s0);
                    pst.executeUpdate();
                    out.println("Password updated....");
                    out.println("login.jsp");
                        
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
        %>
        
            
        %>
    </body>
</html>
