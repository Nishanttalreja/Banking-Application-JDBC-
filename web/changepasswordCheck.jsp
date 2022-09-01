<%-- 
    Document   : changepasswordCheck
    Created on : Aug 18, 2022, 2:34:52 PM
    Author     : ntalreja
--%>

<%@include file="DBCON.jsp" %>
<html>
    <head>
        
    </head>
    <body>
        <h1>Change password check</h1>
        
        <%
            String s1oldpass=request.getParameter("oldpass");
            String s1newpass=request.getParameter("newpass");

            String s1cnpass=request.getParameter("cnpass");
            
            //out.println(s1oldpass);
            //out.println(s1newpass);
            //out.println(s1cnpass);
            
            try
            {
                if(s1newpass.equals(s1cnpass))
                {
                    if(session.getAttribute("password").equals(s1oldpass))
                    {
                        try
                        {
                            String accountno = session.getAttribute("accountno").toString();
                            String updatepassquery="update account set password='"+s1newpass+"' where accno='"+accountno+"';";
                            PreparedStatement pst =con.prepareStatement(updatepassquery);
                            
                           
                            pst.executeUpdate();
                            out.println("Dear"+ accountno + " password changeddd..<br>");
                            
                            session.invalidate();
                            response.setHeader("Cache-Control","no-store");
                            response.setHeader("pragma","no-cache");
                            response.setHeader("Expires","0");//prevents caching at the proxy server
                            
                            
                            out.println("<a href=login.jsp>login AGAIN</a>");
                            
                        }
                        
                        catch(Exception ee)
                        {
                            out.println("<br>Password not change" +ee);
                        }
                        
                    }
                }
                  else 
                 {
                      out.println("<br> NEW PASSWORD & confirm password not match ");
                
                
                  }
                
            }
            
            catch (Exception e)
            {
                out.println(e);
            }

            
            %>
        
    </body>
    
</html>
