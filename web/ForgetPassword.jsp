<%-- 
    Document   : ForgetPassword
    Created on : Aug 22, 2022, 2:44:20 PM
    Author     : ntalreja
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        
    </head>
    <body >
        <h1>Forget Password</h1>
        <form action="ForgetPasswordDBMS.jsp" method="post">
            
            Enter account number<input type="text" name="f0"><br>
            
            Enter New Password  <input type="text" name="f1"><br>
            Confirm New Password<input type="text" name="f2"><br>
            
            Enter Security question<select name="sques">
                <option>First Car</option>
                <option>First Job</option>
                <option>First Bank</option>
            </select><br>
            
            Enter Answer <input type="text" name="sans"><br>
        <input type="submit" value="click here" name ="f3">
        
        </form>
        
        
        

    </body>
</html>
