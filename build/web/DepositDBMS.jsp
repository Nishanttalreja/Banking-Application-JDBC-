<%-- 
    Document   : DepositDBMS
    Created on : Aug 22, 2022, 2:51:14 PM
    Author     : ntalreja
--%>

<%@page import="java.util.Random"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="DBCON.jsp" %>
<%--<%@include file="print.jsp" %>--%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>deposit dbms</h1>
       <%
                       
                        
                        String accountno=request.getParameter("accountno");
                        String ref=request.getParameter("ref");
                        String date=request.getParameter("date");
                        Random random  = new Random();
                        
                        int tId = random.nextInt();
                        String transid = ""+tId;
                        String amount=request.getParameter("amount");
                        

                       
                        
                        
//                        out.println(accountno);
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
                            pst.setString(4,transid);
                            pst.setInt(5,Integer.parseInt(amount));
                            pst.setInt(6,0);
                            pst.setInt(7,(lastbal+Integer.parseInt(amount)));
                            
                            
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
                           pst2.setString(4,transid);
                           pst2.setInt(5,Integer.parseInt(amount));
                           pst2.setInt(6,0); 
                           pst2.setInt(7,(lastbalcust+Integer.parseInt(amount)));
                           
                            pst2.executeUpdate();
                            
                            
                             String invquery="select * from "+accountno+" where transid='"+transid+"';";
                             PreparedStatement stmt3=con.prepareStatement(invquery);
                             ResultSet rs3=stmt.executeQuery(invquery);
                             
                             while (rs3.next()){
                                out.println("<table border=2 bgcolor=orange>");
                                out.println("<tr>");
                                out.println("<td> acoount no. </td>");
                                out.println("<td> "+rs3.getString(1)+"</td>");
                                out.println("</tr>");
                                out.println("<tr>");
                                out.println("<td> Name </td>");
                                out.println("<td>"+rs3.getString(2)+"</td>");
                                out.println("</tr>");
                                out.println("<tr>");
                                out.println("<td> Gender </td>");
                                out.println("<td>"+rs3.getString(3)+"</td>");
                                out.println("</tr>");
                                out.println("<tr>");
                                out.println("<td> Date </td>");
                                out.println("<td>"+rs3.getString(4)+"</td>");
                                out.println("</tr>");
                                out.println("<tr>");
                                out.println("<td> Address </td>");
                                out.println("<td>"+rs3.getString(5)+"</td>");
                                out.println("</tr>");
                                out.println("<tr>");
                                out.println("<td> Tid </td>");
                                out.println("<td>"+rs3.getString(6)+"</td>");
                                out.println("</tr>");
                                out.println("<tr>");
                                out.println("<td> REF </td>");
                                out.println("<td>"+rs3.getString(7)+"</td>");
                                out.println("</tr>");
                                out.println("</table>");

                    
                }
               
                            
                            
                            
                            %>
                            <button onclick="window.print();">Print this page</button>)
                            <%
                            
//                            out.println("---------deposit success");
//                            response.sendRedirect("print.jsp");
//                             
                            
                            
                        }
                        catch(Exception e ){
                            out.println(e);
                            
                        }                        
                        
                        
                        
                        
                        
                   %> 
                   
    </body>
</html>
