<%@ page import = "java.util.*" %>
<!DOCTYPE html>
<html>

<body>

<center>

<h1> Booking Information </h1>
<%
String firstname = (String) request.getAttribute("p_fname");
String lastname = (String) request.getAttribute("p_lname");
String email = (String) request.getAttribute("p_email");
String home_address = (String) request.getAttribute("p_home_address");

out.println("<h4> Your Booking Information is as follows: </h4>" + "<br>");
out.println("<br>");
out.println("First Name: " + firstname + "<br>");
out.println("<br>");
out.println("Last Name: " + lastname + "<br>");
out.println("<br>");
out.println("Email: " + email + "<br>");
out.println("<br>");
out.println("Home Address: " + home_address + "<br>");

%>



</center>

</body>

</html>