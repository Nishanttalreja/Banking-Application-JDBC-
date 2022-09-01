<%-- 
    Document   : ViewCustomers
    Created on : Aug 22, 2022, 3:24:58 PM
    Author     : ntalreja
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
    </head>
    <body>
        <div align="center">
            <h1>View Customer page</h1>
            <form action="ViewCustomersDBMS.jsp" method="post">
                <table>
                    <tr> DropDown<select name="Opt1" >
                    <option>ALL</options>
                    <option>AccountNumber</option>
                  </select>
                   Enter Account Number <input type="text" name ="txt1">
                </tr>
                </table>
            <input type="submit" name="txt2">
            </form>
        </div>
       
    </body>
</html>
