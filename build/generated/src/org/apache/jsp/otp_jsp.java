package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Random;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public final class otp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                                     \n");
      out.write("                                                                                                                                                                                                                                                                                 \n");
      out.write("     \n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       ");

           String mobileno=request.getParameter("mob");
           //int otp= (Integer) session.getAttribute("otp");
           
           
           session.setAttribute("phone",mobileno); 
           
           String authkey = "130491ADE9VcIY7WyB5vst82d3";
    //Multiple mobiles numbers separated by comma
    String mobiles = mobileno;
    Random rand = new Random();
    int otp1 = rand.nextInt(900000) + 100000;
    session.setAttribute("otp",otp1);
    //Sender ID,While using route4 sender id should be 6 characters long.
    String senderId = "ABCDEF";
    //Your message to send, Add URL encoding here.
    String message = "Your OTP is "+otp1;
    //define route
    String route="4";

    //Prepare Url 
    URLConnection myURLConnection=null;
    URL myURL=null;
    BufferedReader reader=null;           

    //encoding message                                               
    String encoded_message=URLEncoder.encode(message);

    //Send SMS API
    String mainUrl="http://malussms.com/api/sendhttp.php?";         

    //Prepare parameter string        
    StringBuilder sbPostData= new StringBuilder(mainUrl);
    sbPostData.append("authkey="+authkey);                                  
    sbPostData.append("&mobiles="+mobiles);                        
    sbPostData.append("&message="+encoded_message);           
    sbPostData.append("&route="+route);
    sbPostData.append("&sender="+senderId);

    //final string
    mainUrl = sbPostData.toString();
    try
    {
        //prepare connection
        myURL = new URL(mainUrl);
        myURLConnection = myURL.openConnection();
        myURLConnection.connect();
        reader= new BufferedReader(new InputStreamReader(myURLConnection.getInputStream()));
        String success="Your message sent sucessfully"; 
        response.sendRedirect("Reset.jsp");

        //finally close connection 
        reader.close();     
    }
    catch (IOException e)
    {                   
            e.printStackTrace();  
    }
    
      out.write("\n");
      out.write("           \n");
      out.write("           \n");
      out.write("           \n");
      out.write("           \n");
      out.write("           \n");
      out.write("       \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
