<%-- 
    Document   : editprofileDBMS
    Created on : Aug 24, 2022, 4:48:49 PM
    Author     : ntalreja
--%>
<%@include file="DBCON.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   
    <body>
        <h6>edit profile dbms</h6>
        <%
        
         String sques= request.getParameter("sques");
        
         try
        {
            String query="";
            String s="";
            if(sques.equalsIgnoreCase("name"))
            {
                s=request.getParameter("text1");
                query="update account set cname='"+s+"' where accno='"+session.getAttribute("accountno")+"';";
            }
            else if(sques.equalsIgnoreCase("address"))
            {
               s=request.getParameter("text1");
               query="update account set address='"+s+"' where accno='"+session.getAttribute("accountno")+"';";
               
            }
            else if(sques.equalsIgnoreCase("mobile"))
            {
                s=request.getParameter("text1");
                query="update account set mob='"+s+"' where accno='"+session.getAttribute("accountno")+"';";
                
            }
            else if(sques.equalsIgnoreCase("password"))
            {
                s=request.getParameter("text1");
                query="update account set password='"+s+"' where accno='"+session.getAttribute("accountno")+"';";
            }
            else if(sques.equalsIgnoreCase("secQ"))
            {
                s=request.getParameter("text1");
                query="update account set sques='"+s+"' where accno='"+session.getAttribute("accountno")+"';";
            }
            else if(sques.equalsIgnoreCase("secA"))
            {
                s=request.getParameter("text1");
                query="update account set sans='"+s+"' where accno='"+session.getAttribute("accountno")+"';";
            }
            
            PreparedStatement pst=con.prepareStatement(query);
            pst.executeUpdate();
            
            out.println("profile updated successfully...........");
        }
         catch(Exception e){
             out.println(e);
         }
         
         %>
    </body>
</html>
