<%-- 
    Document   : Reset
    Created on : Aug 29, 2022, 11:37:13 AM
    Author     : ntalreja
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>------------- OTP based verfication-----------</h3>
        <form action="otp.jsp" method="post">
            <table border="3">
                <tr>
                <td> Enter Mobile Number</td>
                <td> <input type="text" name ="mob"></td>
                </tr>
                
                <tr>
                <td> Click on Send OTP</td>
                <td> <input type="submit" name="a1" value="Send OTP"></td>
                </tr>
                
            <tr>
               
                <td> OTP Verification</td>
                <td><input type="text" name="otp" border="5"></td>
                
            </tr>
            
            <tr>
                <td> <input type="submit" value="VERIFY" name="a2"</td>
                <td> <input type="submit" name ="a3" value="Click here"></td>
                 
                
            </tr>
            
            </table>
        </form>
    </body>
</html>
