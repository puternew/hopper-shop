<%-- 
    Document   : pageConverse
    Created on : Nov 28, 2018, 3:57:16 AM
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
        <jsp:include page="Components/Navbar.jsp"/>
    <div class="container" style="text-align: center">         
            <center>    
            <img src="converseLogo.png" alt="converseLogo" width="600" height="300" >    
                <p>" อีกหนึ่งเครื่องแต่งกายที่มาแรงแบบไม่ตกเทรนด์กว่าหลายสิบปี เรียกว่าเป็นไอเท็มคลาสสิกไปเสียแล้วกับ Converse แบรนด์รองเท้าและเสื้อผ้าไลฟ์สไตล์จากประเทศอเมริกา "</p>
                <p>" ควรค่าแก่การเป็นเจ้าของที่พร้อมเติมเต็มลุคลำลองสไตล์สตรีทให้กับคุณจากแบรนด์ Converse โลดแล่นไปกับกลิ่นอายสไตล์เก๋าๆ กับแบรนด์ Converse ช่วยยกระดับความสบายตลอดการสวมใส่ของคุณ "</p>
                <form action="Allproduct" method="post">
                    <button type="submit" class="btn btn-default btn-lg"> Buy </button>
                </form>     
           </center>     
    </div>

</body>
</html>

