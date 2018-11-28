<%-- 
    Document   : Home
    Created on : 15 พ.ย. 2561, 11:17:42
    Author     : PANUPONG  INTHILAD
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
        <jsp:include page="Components/Navbar.jsp"/>
    <div class="container" style="text-align: center">         
            <center>    
            <img src="hp-logo.png" alt="logo" width="800" height="300" >    
                <h2>"Turn On Your Style"</h2>   
                <form action="Allproduct" method="post">
                    <button type="submit" class="btn btn-default btn-lg"> LET's GO </button>
                </form>     
           </center>     
    </div>
</body>
</html>
