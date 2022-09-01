<%-- 
    Document   : Deposit
    Created on : Aug 22, 2022, 2:51:02 PM
    Author     : ntalreja
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <body>
       <form action ="DepositDBMS.jsp" method="post">
            
            <table border="5" bgcolor="grey">
<!--                <tr>
                    <td>Transaction Id</td>
                    <td><input type="text" name="transId"></td>
                </tr>-->
                <tr>
                    <td>Account No</td>
                    <td><input type="text" name="accountno"></td>
                </tr>
                <tr>
                    <td>Reference</td>
                    <td><input type="text" name="ref"></td>
                </tr>
                <tr>
                    <td>Date of Transaction</td>
                    <td><input type="date" name="date"></td>
                </tr>
                <tr>
                    <td>Transaction Id</td>
                    <td><input type="text" name="transId"></td>
                </tr>-->
                <tr>
                    <td>Deposit amount</td>
                    <td><input type="text" name="amount"></td>
                </tr>
                <tr>
                    <td><input type="submit" name="b1" value="Deposit"></td>
                    <td><input type="reset" name="b2" value="Reset"></td>
                </tr>
            </table>
           
        </form>
    </body>
</html>
