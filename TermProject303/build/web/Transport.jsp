<%-- 
    Document   : Transport
    Created on : Nov 11, 2018, 10:16:46 PM
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
        <form action="Transport" method="post">
  <div class="form-group">
      Name:<input type="text" name="name">Surname:<input type="text" name="surname"><br>
    <label for="exampleFormControlInput1">Email address</label>
    <input type="email" class="form-control" id="exampleFormControlInput1" placeholder="name@example.com">
  </div>
  <div class="form-group">
      Phone Number:<input type="text">
  </div>
  
  <div class="form-group">
    <label for="exampleFormControlTextarea1">Address</label>
    <textarea class="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
  </div>
           <input type="submit">         
</form>
    </body>
</html>
