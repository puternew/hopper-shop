<%-- 
    Document   : Navbar
    Created on : 29 พ.ย. 2561, 2:29:07
    Author     : PANUPONG  INTHILAD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
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
                    <li ><a href="pageLimited.jsp">LIMITED</a></li>
                    <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">BRAND<span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="pageAdidas.jsp">ADIDAS</a></li>
                            <li><a href="pageConverse.jsp">CONVERSE</a></li>
                            <li><a href="pageNike.jsp">NIKE</a></li>
                            <li><a href="pageVans.jsp">VANS</a></li>
                        </ul>
                    </li>
                </ul>
                <ul class="nav navbar-nav navbar-right">

                    
                        <% if (session.getAttribute("account") == null) { %>
                    <li><a href="Login.jsp"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
                    <li><a href="Register"><span class="glyphicon glyphicon-user" ></span> Register</a></li>
                        <% } else {%>
                    <li><a href="#" style="color: #D5C4AD;"><span class="glyphicon glyphicon-user"></span> ${account.accountname}</a></li>
                    <li><a href="Logout"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
                        <% }%>
                </ul>
            </div>
        </nav>
        <script>
            //Scrolling Effect
            $(window).on('scroll', function () {
                if ($(window).scrollTop()) {
                    $('.navbarLogo').addClass('navbarLogoSlide');
                    $('.Logo').addClass('LogoSlide');
                } else {
                    $('.navbarLogo').removeClass('navbarLogoSlide');
                    $('.Logo').removeClass('LogoSlide');
                }
            });
            //Login
            function Login() {
                document.getElementById('login').style.display = 'block';
            }
            function Close() {
                document.getElementById('login').style.display = 'none';
            }
            // Get the modal
            var modal = document.getElementById('login');

            // When the user clicks anywhere outside of the modal, close it
            window.onclick = function (event) {
                if (event.target == modal) {
                    modal.style.display = "none";
                }
            }
        </script>
    </body>
</html>
