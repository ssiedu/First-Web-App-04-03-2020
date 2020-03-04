
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TaxCalculator extends HttpServlet {
    
    public void doGet(HttpServletRequest request, HttpServletResponse response ) throws IOException{
    
        //reads the request
        String s1=request.getParameter("t1");
        String s2=request.getParameter("t2");
        //process the request
        int tax=0;
        int income=Integer.parseInt(s1);
        int age=Integer.parseInt(s2);
        tax=income*10/100;
        //provides the response
        PrintWriter out=response.getWriter();
        out.println("Thanks For Visiting Us . ");
        out.println("Your Tax Liability : "+tax);
        out.close();
        
        
        
        
    }
}