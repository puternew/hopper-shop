<%-- 
    Document   : pageVans
    Created on : Nov 28, 2018, 4:51:46 AM
    Author     : Portoch1no
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
            font-size: 20px;
        }
               
    </style>
    <body>
        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand active" href="../Home.jsp">HOPPER</a>
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
                    <li><a href="../Register.jsp"><span class="glyphicon glyphicon-user" ></span> Register</a></li>
                    <li><a href="../Login.jsp"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
                    <li><a href="../Logout"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
                </ul>
            </div>
        </nav>
    <div class="container" style="text-align: center">         
            <center>    
                <img src="vansLogo.png" alt="vansLogo" width="600" height="400" > 
                <p>" ปัจจุบันคงจะเป็นเรื่องที่จะปฏิเสธได้ยากที่จะไม่มีคนที่ไม่รู้จักรองเท้า VANS เนื่องด้วยรองเท้าจากแบรนด์นี้เป็นรองเท้าที่เกิดขึ้นมานานนม และได้กลายสู่เป็นรองเท้าในตำนานในที่สุด 
                    ด้วยการออกแบบและการดีไซน์ของผู้ผลิต ให้สวมใส่ได้อย่างสบาย พร้อมทั้งยังคงไว้ซึ่งความเป็นแฟชั่นรองเท้าทำให้หนุ่ม ๆ สาว ๆ หันมาให้ความสนใจกันมากพอสมควร "</p>            
                <form action="Allproduct" method="post">
                    <button type="submit" class="btn btn-default btn-lg"> Buy </button>
                </form>     
           </center>     
    </div>

</body>
</html>
