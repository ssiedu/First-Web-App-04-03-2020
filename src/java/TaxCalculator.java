
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TaxCalculator extends HttpServlet {
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
    
        //reads the request
        String s1=request.getParameter("t1");//income
        String s2=request.getParameter("t2");//age
        String s3=request.getParameter("t3");
        String s4=request.getParameter("t4");//secrete code
        String s5=request.getParameter("t5");
        String s[]=request.getParameterValues("t6");
        String s7=request.getParameter("t7");
        String res="";
        if(s!=null){
        for(String tmp:s){
            res=res+tmp+",";
        }
        }else{
            res="No Asset Is Declared By You";
        }
        //process the request
        int tax=0, rebate=0, net=0;
        int income=Integer.parseInt(s1);
        int age=Integer.parseInt(s2);
        if(income>=500000){
            tax=income*20/100;
        }else{
            tax=income*10/100;
        }
        
        if(age>=60){
            rebate=tax*10/100;
        }
        net=tax-rebate;
        //provides the response
        PrintWriter out=response.getWriter();
        
        out.println("<html>");
        out.println("<body>");
        out.println("<h3>Tax Details</h3>");
        out.println("<h4>Your PIN : "+s3+"</h4>");
        out.println("<h4>Hidden Code : "+s4+"</h4>");
        out.println("<h4>Your City : "+s5+"</h4>");
        out.println("<h4>Your Assets  : "+res+"</h4>");
        String nriStatus="NRI";
        if(s7==null){
            nriStatus="Not-NRI";
        }
        out.println("<h4>NRI Status  : "+nriStatus+"</h4>");
        out.println("<table border=\"2\">");
        
        out.println("<tr>");
        out.println("<td>Income</td>");
        out.println("<td>"+income+"</td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td>Age</td>");
        out.println("<td>"+age+"</td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td>Tax</td>");
        out.println("<td>"+tax+"</td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td>Rebate</td>");
        out.println("<td>"+rebate+"</td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td>Net</td>");
        out.println("<td>"+net+"</td>");
        out.println("</tr>");
        
        out.println("</table>");
        out.println("<hr>");
        out.println("<marquee>Pay Your Taxes Before 31st March</marquee>");
        out.println("</body>");
        out.println("</html>");
        out.close();
        
        
        
        
    }
}