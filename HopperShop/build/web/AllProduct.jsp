<%-- 
    Document   : AllProduct
    Created on : 16 พ.ย. 2561, 0:26:53
    Author     : PANUPONG  INTHILAD
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                    <li ><a href="#">LIMITED</a></li>
                    <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">BRAND<span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="#">ADIDAS</a></li>
                            <li><a href="#">CONVERSE</a></li>
                            <li><a href="#">GUCCI</a></li>
                            <li><a href="#">NEW BALANCE</a></li>
                            <li><a href="#">NIKE</a></li>
                            <li><a href="#">ONISUKA TIGER</a></li>
                            <li><a href="#">PUMA</a></li>
                            <li><a href="#">REBOX</a></li>
                            <li><a href="#">UNDER ARMOR</a></li>
                            <li><a href="#">VANS</a></li>
                        </ul>
                    </li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="Register.jsp"><span class="glyphicon glyphicon-user" ></span> Register</a></li>
                    <li><a href="Login.jsp"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
                    <li><a href="Logout"><span class="glyphicon glyphicon-log-out"></span> Loount</a></li>
                </ul>
            </div>
        </nav>
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
