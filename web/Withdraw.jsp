<%-- 
    Document   : Withdraw
    Created on : Aug 22, 2022, 2:51:35 PM
    Author     : ntalreja
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <body>
        <form action ="WithdrawDBMS.jsp" method="post">
            
            <table border="4" bgcolor="yellow">
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
                    <td>Withdraw amount</td>
                    <td><input type="text" name="amount"></td>
                </tr>
                <tr>
                    <td><input type="submit" name="b1" value="Withdraw"></td>
                    <td><input type="reset" name="b2" value="Reset"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
