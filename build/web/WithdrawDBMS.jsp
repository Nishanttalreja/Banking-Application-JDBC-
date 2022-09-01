<%-- 
    Document   : WithDrawDBMS
    Created on : Aug 22, 2022, 2:51:52 PM
    Author     : ntalreja
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="DBCON.jsp" %>
<html>
    <head>
        
    </head>
    <body>
         <h1>withdraw DBMS</h1>
       <%
                        
                        String accountno=request.getParameter("accountno");
                        String ref=request.getParameter("ref");
                        String date=request.getParameter("date");
                        String transId=request.getParameter("transId");
                        String amount=request.getParameter("amount");
                       
                        
                          //out.println(accountno);
//                        out.println(ref);
//                         out.println(date);
//                        out.println(transid);
//                        out.println(amount);
                        
                        
                               try{
                            String viewquery="select * from transactionbank;";
                            Statement stmt=con.createStatement();
                            ResultSet rs=stmt.executeQuery(viewquery);
                            int lastbal=0;
                            while(rs.next()){
                                lastbal=rs.getInt(7);
                            }
                            
                            
                            String cashdepquery="insert into transactionbank values(?,?,?,?,?,?,?);";
                            PreparedStatement pst=con.prepareStatement(cashdepquery);
                            
                            pst.setString(1,accountno);
                            pst.setString(2,ref);
                            pst.setString(3,date);
                            pst.setString(4,transId);
                            pst.setInt(5,Integer.parseInt(amount));
                            pst.setInt(6,0);
                            pst.setInt(7,(lastbal-Integer.parseInt(amount)));
                            
                            
                            pst.executeUpdate();
                            out.println("transaction successfull done ..cash deposit");
                            
                            
                            String viewquerycustomer="select * from "+accountno;
                             Statement stmt2=con.createStatement();

                             ResultSet rs2=stmt2.executeQuery(viewquerycustomer);
                             
                             int lastbalcust=0;
                             while(rs2.next()){
                                 lastbalcust=rs2.getInt(7);
                             }
                             String cashdepqueryincustomer="insert into "+accountno+" values(?,?,?,?,?,?,?);";
                             PreparedStatement pst2=con.prepareStatement(cashdepqueryincustomer);
                             
                             pst2.setString(1,accountno);
                             pst2.setString(2,ref);
                             pst2.setString(3,date);
                            pst2.setString(4,transId);
                            pst2.setInt(5,0);
                            pst2.setInt(6,Integer.parseInt(amount));
                            pst2.setInt(7,(lastbalcust-Integer.parseInt(amount)));
                            
                            pst2.executeUpdate();
                            out.println("withdraw success");
                            
                            
                        }
                        catch(Exception e ){
                            out.println(e.getMessage());
                            
                        }                        
                        
                        
                        
                        
                        
                   
                   
                        
                        
                        
                        
                        
                   %> 
    </body>
</html>
