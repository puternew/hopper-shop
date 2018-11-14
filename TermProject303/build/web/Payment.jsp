<%-- 
    Document   : Payment
    Created on : Nov 11, 2018, 10:37:39 PM
    Author     : Pongsakorn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="Payment" method="post">
            Payment detail:<br>
        Card Number:<input type="text" name="cardnumber">
        CVV:<input type="text" name="cvv">
        EXP Month:<input type="dropdown" name="expmonth">
        EXP Year:<input type="dropdown" name="expyear">
        Name On Card:<input type="text" name="nameoncard">
        <input type="submit">
        </form>
    </body>
</html>
