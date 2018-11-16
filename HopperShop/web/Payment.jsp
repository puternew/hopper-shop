<%-- 
    Document   : Payment
    Created on : Nov 16, 2018, 9:34:47 AM
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
                    <a class="navbar-brand active" href="#">HOPPER</a>
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
            </div>
        </nav>
        <div class="Register-form">

            <div class="container">
                <div class="row centered-form">
                    <div class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <h3 class="panel-title">Payment details:</h3>
                            </div>
                            <div class="panel-body">
                                <form role="form">

                                    <div class="form-group">
                            <input type="textbox" name="cardNo" id="cardNo" class="form-control input-sm" placeholder="Card Number">
                        </div>

                       
                            <div class="form-group">
                                <input type="textbox" name="cvv" id="cvv" class="form-control input-sm" placeholder="CVV">
                            </div>
                     
                        <div class="col-xs-6 col-sm-6 col-md-6">
                            <div class="form-group">
                                <input type="textbox" name="expMonth" id="expMonth" class="form-control input-sm" placeholder="Expire Month">
                            </div>
                        </div>

                        <div class="col-xs-6 col-sm-6 col-md-6">
                            <div class="form-group">
                                <input type="textbox" name="expYear" id="expYear" class="form-control input-sm" placeholder="expYear">
                            </div>
                        </div>

                        <div class="form-group">
                            <input type="textbox" name="nameOnCard" id="nameOnCard" class="form-control input-sm" placeholder="Name On Card">
                        </div>
            <input type="submit" value="Payment" class="btn btn-info btn-block">
                    </div>
                </div>
            </div>


                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
</html>
