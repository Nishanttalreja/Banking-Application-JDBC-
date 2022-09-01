<html>
    
    <body>
        Welcome Dear :
        <%
            out.println(session.getAttribute("loginname"));
            out.println("             "+session.getAttribute("accountno"));
        
        %>
        <h1>Customer login</h1>
        <a href="ViewProfileDBMS.jsp">View Profile</a><br>
        <a href="ChangePassword.jsp">Change Password</a><br>
        <a href="ViewStatement.jsp">View Statement</a><br>
        <a href="FundTransfer.jsp">Fund transfer</a><br>
        
    </body>
</html>