<%-- 
    Document   : editprofile
    Created on : Aug 24, 2022, 4:48:29 PM
    Author     : ntalreja
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <body>
        <form action="editprofileDBMS.jsp" method="post">
        <h1>Edit Profile</h1>
        <table>
        <h6 align="center">
        <tr>
                    <td>EDIT PROFILE</td>
                    <td><select name="sques">
                            <option>Account Name</option>
                            <option>ADDRESS</option>
                            <option>Password</option>

                        </select></td>
                        <td><input type="text" name="txt1"></td>
                        
        </tr><br>
        </table>
                <input type="submit" value="Edit">
           
            
      
        </form>        
    </body>
</html>
