<!-- Kyle Snitko 2349076 -->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="Styles/CSSTest.css" rel=stylesheet>
        <title>New Customer Registration</title>
    </head>
    <body>
        <h1>Enter your information below</h1>
        
    
        
        
        <form action="newCustomerServlet" method="post">
            First Name:<br>         
            <input type="text" name="firstName" value="${user.firstName}"><br>
            Last Name:<br>
            <input type="text" name="lastName" value="${user.lastName}"><br>
            
            Phone Number: <br>
            <input type="text" name="phoneNumber" value="${user.phoneNumber}"><br>
           
            Address:<br>
            <input type="text" name="address" value="${user.address}"><br>
            City:<br>
            <input type="text" name="city" value="${user.city}"><br>
            State:<br>
            <input type="text" name="state" value="${user.state}"><br>
            Zip code:<br>
            <input type="text" name="zipCode" value="${user.zipCode}"><br>
         
            Email:<br>
            <input type="email" name="email" value="${user.emailAddress}"><br>
            <input type="submit" value="Submit" class="margin_left">
        </form>
    </body>
</html>
