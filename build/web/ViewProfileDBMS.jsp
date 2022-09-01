<%@include file="DBCON.jsp" %>
<html>
    
    <body>
        <h1>ViewProfileDBMS</h1>
        <%
        String accountno=request.getParameter("accno");
        String name =request.getParameter("name");
                
            try
            {
                String viewquery="select * from account where accno='"+accountno+"';";
                PreparedStatement stmt=con.prepareStatement(viewquery);
                ResultSet rs=stmt.executeQuery(viewquery);
                
                while (rs.next()){
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
                out.println("data not found"+e);
            }
        %>
    </body>
</html>