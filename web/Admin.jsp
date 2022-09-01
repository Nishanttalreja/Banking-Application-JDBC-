<%-- 
    Document   : admin
    Created on : Aug 22, 2022, 2:48:28 PM
    Author     : ntalreja
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            table{
                border-color: orange;
                
            }
            tr{
                height: 50px;
            }
            
            tr:nth-child(even) {
                
            background-color: #D6EEEE;
                }
                
                tr:nth-child(odd) {
                
            background-color: white;
                }
                
            
        </style>
        
    </head>
    <body bgcolor="grey">
        <form >
        <h1 align="center">ADMIN PAGE</h1>
        <table border="3" border-radius="10px" align="center" size="50" style="width:30%">
            <tr>
                <td> <a href="CreateAcc.jsp">New account</a></td>
        </tr>
        <tr>
                 <td><a href="ViewCustomers.jsp">View Customers</a></td>
        </tr>
        <tr>
                 <td><a href="ViewStatement.jsp">View Statement</a></td>
        </tr>
        <tr> 
                <td> <a href="Deposit.jsp">Deposit</a></td>
        <tr>       
                <td><a href="Withdraw.jsp">Withdraw</a></td>
        </tr>
        
        </tr>
        <tr> 
                <td><a href="Transactions.jsp">View Transactions</a></td>
        </tr>
        </table>
        </form>
        
    </body>
</html>
