<%-- 
    Document   : Login
    Created on : Nov 16, 2018, 9:34:04 AM
    Author     : INT303
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
                            <li><a href="#">REEBOK</a></li>
                            <li><a href="#">UNDER ARMOR</a></li>
                            <li><a href="#">VANS</a></li>
                        </ul>
                    </li>
                </ul>
            </div>
        </nav>
        <div class="Login-form">

            <div class="container">
                <div class="row centered-form">
                    <div class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <h3 class="panel-title">Please log in to enjoy Hopping</h3>
                            </div>
                            <form action="Login" method="post">
                                <div class="panel-body">
                                    <div class="form-group">
                                        <input type="email" name="email" id="email" class="form-control input-sm" placeholder="Email Address">
                                    </div>
                                    <div class="form-group">
                                        <input type="password" name="accountPassword" id="password" class="form-control input-sm" placeholder="Password">
                                    </div>
                                </div>
                                <input type="submit" value="Login" class="btn btn-info btn-block">
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
