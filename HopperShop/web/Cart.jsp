<%-- 
    Document   : Cart
    Created on : 29 พ.ย. 2561, 4:26:58
    Author     : PANUPONG  INTHILAD
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cart</title>
    </head>
    <body>
        <jsp:include page="Components/Navbar.jsp"/>
        <div class="container text-center" style="padding-top: 130px;">
            <h1>Cart</h1>
            <div class="col-12">
                <div class="row m-0 pt-3 pb-3" style="background-color: #ECEEF0; border: 1px solid black">
                        <div class="col">Product Code</div>
                        <div class="col">Product Name</div>
                        <div class="col">Quantity</div>
                        <div class="col">REMOVE</div>
                    </div>
                
                <c:forEach items="${cart.getLineIteme}" var="p">
                    <div class="row m-0 p-1" style="background-color: #ECEEF0">
                        <div class="col">${p.product.productcode}</div>
                        <div class="col">${p.product.productname}</div>
                        <div class="col">
                            <a href="ReduceProduct?productid=${p.product.productid}"><button>-</button></a>
                            ${p.quantity}
                            <a href="AddProduct?productid=${p.product.productid}"><button>+</button></a>
                        </div>
                        <div class="col"><a href="RemoveProduct?productid=${p.product.productid}"><button>REMOVE</button></a></div>
                    </div>
                </c:forEach>
    </body>
</html>
