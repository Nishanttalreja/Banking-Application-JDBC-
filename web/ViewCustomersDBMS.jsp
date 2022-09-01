<%@include file="DBCON.jsp" %>

<html>
    <body>
        <form>
            <%
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
                }
                catch(Exception e)
                {
                    out.println(e);
                    
                }
            %>
        </form>
    </body>
</html>