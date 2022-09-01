<%-- 
    Document   : Transactions
    Created on : Aug 22, 2022, 3:25:56 PM
    Author     : ntalreja
--%>

<html>
   
    <body>
        <h1>Transaction</h1>
        <h6 align="center">
        
            <form action="TransactionDBMS.jsp" method="post">
            <select name="choice">
                <option value="accno">ACCOUNT Number</option>
                <option value="dotrans">Date of Transection</option>
                <option value="transid">Transection ID</option>
                <option value="depamount">Deposit Amount</option>
                <option value="wdrwamount">Withdraw Amount</option>
            </select>
            <input type="text" name="txt1">
            <input type="submit" name="b1" value="View">
        </form>
            </h6>
    </body>
</html>