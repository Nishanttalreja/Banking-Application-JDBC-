<%-- 
    Document   : changepassword
    Created on : Aug 18, 2022, 2:34:36 PM
    Author     : ntalreja
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
    </head>
    <body>
       <%
            out.println(session.getAttribute("accountno"));
            out.println("    "+ session.getAttribute("loginname"));
            %>
            <form action="changepasswordCheck.jsp" method="post">
                enter old password <input type="text" name ="oldpass"><br>
                enter new password <input type="text" name ="newpass"><br>

                confirm password <input type="text" name ="cnpass"><br>
                <input type="submit" name ="b1" value="change">

                
            </form>
        
        
        
        
    </body>
</html>
