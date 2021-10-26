import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "HotelBookingServlet",
      urlPatterns = {"/booking-details"})
public class BookingServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        System.out.println("in doPost");

        String firstname = req.getParameter("fname");
        String lastname = req.getParameter("lname");
        String email = req.getParameter("email");
        String home_address = req.getParameter("home_address");

        System.out.println(firstname);
        System.out.println(lastname);
        System.out.println(email);
        System.out.println(home_address);

        Booking booking = new Booking();
        booking.setFirstname(firstname);
        booking.setLastname(lastname);
        booking.setEmail(email);
        booking.setAddress(home_address);

        System.out.println(booking);

        req.setAttribute("p_fname", booking.getFirstname());
        req.setAttribute("p_lname", booking.getLastname());
        req.setAttribute("p_email", booking.getEmail());
        req.setAttribute("p_home_address", booking.getAddress());

        RequestDispatcher view = req.getRequestDispatcher("booking_details.jsp");
        view.forward(req, resp);

    }
}
