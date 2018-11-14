<%-- 
    Document   : Login
    Created on : Nov 11, 2018, 8:54:06 PM
    Author     : Pongsakorn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hopper</title>
    </head>
     
    <body>
        <nav class="HopperNavBar">
            <span class="HopperNav">Hopper</span>
        </nav>

        <form action="Login" method="post">
            <div class="LoginPage">
                Email address:
                <input type="text" class="Login"  id="email" name="email" aria-describedby="emailHelp" placeholder="Enter email"><br>
                <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
            </div>
            <div class="LoginPage">
                Password:
                <input type="password" class="Login" id="password" name="password" placeholder="Password">
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </body>
</html>
