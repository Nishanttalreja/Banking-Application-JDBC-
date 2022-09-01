<%-- 
    Document   : TransactionDBMS
    Created on : Aug 24, 2022, 3:51:20 PM
    Author     : ntalreja
--%>
<%@include file="TransactionDBMS.jsp" %>
<%@include file="DBCON.jsp" %>
<%@include file="Transactions.jsp" %>
<html>
    
    <body>
        <h1>Transaction dbms page</h1>
        <%
            String choice=request.getParameter("choice");
            
        
            try
            {
                String viewquery="";
                if(choice.equalsIgnoreCase("accno"))
                {
                    String ac=request.getParameter("txt1");
                    viewquery="select * from transactionbank where accountno='"+ac+"'";
                }
                else if(choice.equalsIgnoreCase("transid"))
                {
                    String tid=request.getParameter("txt1");
                    viewquery="select * from transactionbank where transid='"+tid+"'";
                }
                else if(choice.equalsIgnoreCase("depamount"))
                {
                    String damonut=request.getParameter("txt1");
                    viewquery="select * from transactionbank where depamount='"+damonut+"'";
                }
                else if(choice.equalsIgnoreCase("wdrwamount"))
                {
                    String wamount=request.getParameter("txt1");
                    viewquery="select * from transactionbank where wdrwamount='"+wamount+"'";
                }
                else
                {
                    viewquery="select * from trasaction";
                }
                
                Statement stmt = con.createStatement();
                ResultSet rs=stmt.executeQuery(viewquery);
                
                
                while(rs.next())
                {
                    out.println(" "+rs.getString(1));
                    out.println(" "+rs.getString(2));
                    out.println(" "+rs.getString(3));
                    out.println(" "+rs.getString(4));
                    out.println(" "+rs.getInt(5));
                    out.println(" "+rs.getInt(6));
                    out.println(" "+rs.getInt(7));
                    
                    out.println("<br> ");
                }
            }
            catch(Exception e)
            {
                out.println("data not found"+e);
            }
        %>
    </body>
</html>