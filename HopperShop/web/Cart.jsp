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
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdn.datatables.net/1.10.19/css/dataTables.bootstrap.min.css">
        <script src="https://code.jquery.com/jquery-3.3.1.js"></script>    
        <script src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
        <script src="https://cdn.datatables.net/1.10.19/js/dataTables.bootstrap.min.js"></script>

    </head>
    <body>
        <jsp:include page="Components/Navbar.jsp"/>
        <div class="container">

            <h1 class="m-5 text-center">--My Cart--</h1>
            <table class="table mt-5">
                <thead  >
                    <tr>
                        <th scope="col">Image</th>
                        <th scope="col">Product Name</th>
                        <th scope="col">Color</th>
                        <th scope="col">Price</th>
                        <th scope="col">Quantity</th>
                        <th scope="col">Total</th>
                        <th scope="col"></th>
                    </tr>
                </thead>
                <tbody >
                    <c:forEach items="${cart.lineItem}" var="line" varStatus="vs">
                        <tr>
                            <td><img height="30px" src="img/${line.product.productno}.jpg"></td>
                            <td>${line.product.productname}</td>
                            <td>${line.product.color}</td>
                            <td>${line.product.price} Bath</td>
                            <td>
                                <div class="col">
                                    <a href="ReduceProduct?productid=${line.product.productid}"><button>-</button></a>
                                    ${line.quantity}
                                    <a href="AddProduct?productid=${line.product.productid}"><button>+</button></a>
                                </div>
                            </td>
                            
                            <td>${line.totalPrice} Bath</td>
                            <td>
                                <form action="RemoveAll" method="post">
                                    <input type="hidden" value="${line.product.productid}" name="productid" />
                                    <input type="submit" value="remove"/>
                                </form>
                            </td>
                        </tr>
                    </c:forEach>
                    <tr>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td style="text-align: center">TOTAL PRICE</td>              
                        <td>${cart.totalPayment} Bath</td>
                        
                    </tr>
                </tbody>
            </table>

            <div class="col-lg-12 text-center">
                
                <form action="Payment" method="post">
                    <button type="submit" name="check" value="Check Out" class="btn btn-default btn-lg bg">Check Out</button>
                </form>

            </div>

            <div class="m-2 text-center">
                <a href="newIndex" style="color: #fff">Back</a>
            </div>

        </div>
                        
    </body>
</html>
