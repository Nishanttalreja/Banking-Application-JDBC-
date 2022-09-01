<%-- 
    Document   : login
    Created on : Aug 22, 2022, 2:43:23 PM
    Author     : ntalreja
--%>

<html>
    <head>
        <style>
body {
  background-image: url('bank.jpg');
  
  background-repeat: no-repeat;
  background-size: 100% 100%;
  
}
  h1 {
  color: white;
}

</style>
</head>
<body>
        
    </head>
   
    
    <body bgcolor="YELLOW" align="center">
        <h1>Login page</h1>
        <form action="Check.jsp" method="post">
            
            <table border="2" bgcolor="grey" align="center" >
                <tr><td>Select Role</td>
                    <td><select name="role">
                          <option>Admin</option>
                              <option>Customer</option>
                          
            </td> </select>
            </tr><br>
            
            <tr>
                <td>Enter Account Number</td>
                <td><input type="text" name="accountno"></td><br>
            </tr>
            
            <tr>
                <td> Enter Password</td>
                <td><input type="text" name="password"></td><br>
            </tr>
            
            
            
            
            <tr>
                <td><input type="submit" name="b1" value="Login"></td>
            <td><input type="reset" name="b2" value="RESET"></td>
            </tr>
            
            </table>
            
            
            
        </form>
    </body>
</html>