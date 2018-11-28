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
        <jsp:include page="Components/Navbar.jsp"/>
        <div style="text-align: center; width: 90%;margin-left: 5%;margin-right: 5%;">
            
        <c:forEach items="${Product}" var="Product">
            
            <div style="background-color: white; display: inline-block ; margin: 30px;width:15%;">
                <img src="img/${Product.productno}.jpg" width="120">
                <td>
                <p>${Product.productname}</p>
                <p>Color ${Product.color}</p>
                <p>${Product.price} BATH</p></td>
                <form action="AddToCart" method="post">
                        <input type="hidden" name="productid" value="${Product.productid}"> 
                        <input type="submit" value="BUY">
                    </form>
            </div>
        </c:forEach>
        </div>
    </body>
</html>
