import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/processServlet")
public class ProcessServlet extends HttpServlet  {

    public void doPost(HttpServletRequest hreq, HttpServletResponse hresp) throws ServletException, IOException {
        String uname = hreq.getParameter("username");
        String upwd = hreq.getParameter("upassword");
        if(uname.equals("admin") && upwd.equals("admin")){
            RequestDispatcher rd = hreq.getRequestDispatcher("process.jsp");
            rd.forward(hreq,hresp);
        } else {
            hresp.sendRedirect("error.html");
        }
    }
}
