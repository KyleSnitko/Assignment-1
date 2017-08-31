// Kyle Snitko 2349076 
package customer;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/NewCustomerServlet"})
public class NewCustomerServlet extends HttpServlet 
{
    @Override
    protected void doPost(
        HttpServletRequest request,
        HttpServletResponse response)
        throws ServletException, IOException
    
            
            
    {
        String url = "/Login.html";
        
        String action = request.getParameter("action");
        if (action == null){
            url = "/Login.html";
        }
        
        else if (action.equals("add")){       
        
        response.setContentType("text/html;charset=UTF-8");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String phoneNumber = request.getParameter("phoneNumber");
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String zipCode = request.getParameter("zipCode");
        String emailAddress = request.getParameter("email");
        
        /*                   For storing in a Datatbase
        User user = new User(firstName, lastName, phoneNumber, address, city, state, zipCode, emailAddress);
        UserDB.insert(user);
        
        request.setAttribuite("user", user);
        url = "success.html";
        */
        
        
        String message;
        if (firstName == null || lastName == null || phoneNumber == null || address == null || city == null
                || state == null || zipCode == null || emailAddress == null){
            message = "Please fill out all sections of this form";
            url = "/Login.html";
        }
        
        else {
            message = "";
            url = "/success.html";
        }
        
        request.setAttribute("message", url);
    }
        
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
}
        
} 
       


