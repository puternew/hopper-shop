<%-- 
    Document   : pageAdidas
    Created on : Nov 28, 2018, 2:42:59 AM
    Author     : Thanasin Sutta
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
    <style>
        p {
            font-size: 22px;
        }
               
    </style>
    <body>
        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand active" href="Home.jsp">HOPPER</a>
                </div>
                <ul class="nav navbar-nav">
                    <li ><a href="pageLimited.jsp">LIMITED</a></li>
                    <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">BRAND<span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="pageAdidas">ADIDAS</a></li>
                            <li><a href="pageConverse.jsp">CONVERSE</a></li>
                            <li><a href="pageNike.jsp">NIKE</a></li>
                            <li><a href="pageVans.jsp">VANS</a></li>
                        </ul>
                    </li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="Register.jsp"><span class="glyphicon glyphicon-user" ></span> Register</a></li>
                    <li><a href="Login.jsp"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
                    <li><a href="Logout"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
                </ul>
            </div>
        </nav>
    <div class="container" style="text-align: center">         
            <center>    
            <img src="adidasLogo.png" alt="adidasLogo" width="600" height="300" >    
                <p>" Begin every match or workout in comfort and style with our range of high performance 
                    adidas shoes and trainers "</p>
                <p>" Buy online, delivered to your door "</p>
                <form action="Allproduct" method="post">
                    <button type="submit" class="btn btn-default btn-lg"> Buy </button>
                </form>     
           </center>     
    </div>
        <div style="text-align: center; width: 90%;margin-left: 5%;margin-right: 5%;">
            
        <c:forEach items="${Productadidas}" var="Productadidas">
            
            <div style="background-color: white; display: inline-block ; margin: 30px;width:15%;">
                <img src="img/${Productadidas.productno}.jpg" width="120">
                <td>
                <p>${Productadidas.productname}</p>
                <p>Color ${Productadidas.color}</p>
                <p>${Productadidas.price} BATH</p></td>
                <a href="AddItemToCart?productCode=${Productadidas.productno}">
                                <input type="button" value="Add to cart"/>
                            </a>
            </div> 
        </c:forEach>
        </div>


</body>
</html>

