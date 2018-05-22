<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="utf-8"/>
    <script type="text/javascript" src="${resourceUrlPrefix}/js/jquery-3.2.1.min.js"></script>
    <title>Title</title>
</head>
<body>
<p onclick="count()">hello</p>
</body>
<script>
    function count() {
        $.ajax({
            url:"${hostContextPrefix}/order/orderCount",
            type:"get",
            success: function (data) {
                alert(data);
            },
            error: function () {
                alert("error");
            }
        });
    };

</script>
</html>
