<%--<%@page import="randomid.java" %>--%>
<!DOCTYPE html>
<html>
    <head>
        
    </head>
    <body>
        <h1>Fund Transfer</h1>
        <% out.println(session.getAttribute("loginname"));
        out.println("    "+ session.getAttribute("accountno"));
        
        %>
        <form action="FundTransferDBMS.jsp" method="post">
            <table border="4" >
<!--                <tr>
                    <td>
                        Transaction Id 
                        
                    </td>
                    <td><input type="text" name ="transId"></td>
                </tr>-->
                
<!--                <tr>
                   <td>Account from </td>
                        
                    
                    <td><input type="text" name ="accountfr" value=""></td>
                </tr>-->
                
                
                
                <tr>
                   <td>Account to </td>
                        
                    
                    <td><input type="text" name ="accounto"></td>
                </tr>
                
                <tr>
                   <td>Date </td>
                        
                    
                    <td><input type="date" name ="date"></td>
                </tr>
                
                <tr>
                   <td>Amount </td>
                        
                    
                    <td><input type="text" name ="amount"></td>
                
                    
                    
                    <tr>
                    <td><input type="submit" name="b1" value="TransferNow"></td>
                    <td><input type="RESET" name="b2" value="Reset"></td>
                </tr>
            </table>
        </form>
    </body>
</html>

alter table account
add column password varchar(20),
sques varchar(20),
sans varchar(20);