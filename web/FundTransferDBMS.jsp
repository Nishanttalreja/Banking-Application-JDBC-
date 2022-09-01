<%-- 
    Document   : FundTransferDBMS
    Created on : Aug 22, 2022, 2:49:40 PM
    Author     : ntalreja
--%>
<%@page import="java.util.Random"%>
<%@include file="DBCON.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       
    </head>
    <body>
        <h1> Fund Transfer DBMS</h1>
        <%
        
        
        Random random=new Random();
        int transid=random.nextInt(1000);
        
//                        String transId=request.getParameter("transId");
                        String accountfr=(String)session.getAttribute("accountno");
                        
                        String accounto=request.getParameter("accounto");
                        
                        String date=request.getParameter("date");
                        String amount=request.getParameter("amount");
                        
                        

                       
                        
//                        out.println(transid);
//                         out.println(accountfr);
//                        out.println(accountto);
//                        out.println(amount);
//                        out.println(date);
//                        out.println(amount);
                        
                        
                        try{
                           String viewquery="select * from " + accountfr;
                           Statement stmt=con.createStatement();
                           ResultSet rs=stmt.executeQuery(viewquery);
                           
                           int lastbal=0;
                           while (rs.next()){
                               lastbal=rs.getInt(7);
                           }
                           String cashdepquery="insert into "+accountfr+" values(?,?,?,?,?,?,?);";
                           PreparedStatement pst=con.prepareStatement(cashdepquery);
                           pst.setString(1,accountfr);
                            pst.setString(2,accounto);
                             pst.setString(3,date);
                              pst.setInt(4,transid);
                              pst.setInt(5,0);
                              pst.setInt(6,Integer.parseInt(amount));
                              pst.setInt(7,(lastbal-Integer.parseInt(amount)));
                              
                              pst.executeUpdate();
                                  
                            out.println("Fund transfer done...");
                            
                            
                            /////////////////////////////////////////////////////////////
                            
                            String viewquery2="select * from "+accounto;
                           Statement stmt2=con.createStatement();
                           ResultSet rs2=stmt2.executeQuery(viewquery2);
                            
                            
                            int lastbal2=0;
                            while (rs2.next()){
                                lastbal2=rs2.getInt(7);
                            }
                          
                            String cashdepquery2="insert into "+accounto+" values(?,?,?,?,?,?,?);";
                           PreparedStatement pst2=con.prepareStatement(cashdepquery2);
                           pst.setString(1,accounto);
                            pst.setString(2,accountfr);
                             pst.setString(3,date);
                              pst.setInt(4,transid);
                              pst.setInt(5,Integer.parseInt(amount));
                              pst.setInt(6,0);
                              pst.setInt(7,(lastbal2+Integer.parseInt(amount)));
                              
                              pst.executeUpdate();
                                  
                            out.println("Fund transfer done...");
                            
                            
                            
                        }
                        catch(Exception e){
                            out.println(e.getMessage());
                        }
                        %>
                        
                        
        
    </body>
</html>
