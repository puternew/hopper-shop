<%-- 
    Document   : PurchaseSuccess
    Created on : Nov 28, 2018, 11:38:17 PM
    Author     : Pongsakorn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>HOPPER SHOP</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

    </head>
    <body>
        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand active" href="Home.jsp">HOPPER</a>
                </div>
                <ul class="nav navbar-nav">
                    <li ><a href="PageBrand/pageLimited.jsp">LIMITED</a></li>
                    <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">BRAND<span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="PageBrand/pageAdidas.jsp">ADIDAS</a></li>
                            <li><a href="PageBrand/pageConverse.jsp">CONVERSE</a></li>
                            <li><a href="PageBrand/pageNike.jsp">NIKE</a></li>
                            <li><a href="PageBrand/pageVans.jsp">VANS</a></li>
                        </ul>
                    </li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="Register"><span class="glyphicon glyphicon-user" ></span> Register</a></li>
                    <li><a href="Login.jsp"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
                    <li><a href="Logout"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
                </ul>
            </div>
        </nav>
    <div class="container" style="text-align: center">         
            <center>    
            <img src="hp-logo.png" alt="logo" width="800" height="300" >    
                <h2>"Your Purchase was completed"</h2>   
                <form action="Allproduct" method="post">
                    <button type="submit" class="btn btn-default btn-lg"> Back To Home </button>
                </form>     
           </center>     
    </div>


</body>
</html>