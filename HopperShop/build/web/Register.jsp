<%-- 
    Document   : Register
    Created on : Nov 16, 2018, 9:35:34 AM
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
        <jsp:include page="Components/Navbar.jsp"/>

        <div class="Register-form">

            <div class="container">
                <div class="row centered-form">
                    <div class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <h3 class="panel-title">Please sign up to enjoy Hopping</h3>
                            </div>
                            <div class="panel-body">
                                <form role="form">

                                    <div class="form-group">
                                        <input type="email" name="email" id="email" class="form-control input-sm" placeholder="Email Address">
                                    </div>

                                    <div class="form-group">
                                        <input type="password" name="accountPassword" id="accountPassword" class="form-control input-sm" placeholder="Password">
                                    </div>

                                    <div class="form-group">
                                        <input type="textbox" name="accountName" id="accountName" class="form-control input-sm" placeholder="Your Name">
                                    </div>


                                    <div class="form-group">
                                        <input type="textbox" name="telNo" id="telNo" class="form-control input-sm" placeholder="Phone Number">
                                    </div>


                                    <div class="form-group">
                                        <div class="form-group">
                                            <label for="comment">Address:</label>
                                            <textarea name="addressText" class="form-control input-sm" rows="5" id="Address"></textarea>
                                        </div>
                                    </div>

                                    <div class="col-xs-6 col-sm-6 col-md-6">
                                        <div class="form-group">
                                            <input type="textbox" name="province" id="province" class="form-control input-sm" placeholder="Province">
                                        </div>
                                    </div>
                                    <div class="col-xs-6 col-sm-6 col-md-6">
                                        <div class="form-group">
                                            <input type="textbox" name="postCode" id="postalCode" class="form-control input-sm" placeholder="Postal Code">
                                        </div>
                                    </div>

                                    <input type="submit" value="Register" class="btn btn-info btn-block">

                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
