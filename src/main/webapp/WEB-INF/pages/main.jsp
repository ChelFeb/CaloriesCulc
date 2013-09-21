<%@ page import="java.util.Date" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>


<html lang="EN">
<head>
<title>Calories Culc</title>
    <%@ page contentType="text/html;charset=UTF-8" %>
<link rel="stylesheet" media="screen" type="text/css" href="<c:url value="/static/bootstrap/css/bootstrap.css" />" />
<link rel="stylesheet" media="screen" type="text/css" href="<c:url value="/static/css/styles.css" />" />
</head>
<body>
	<h1>Spring Example</h1>

	<h2>Message is: ${message}</h2>

    <p>============================</p>

    <p>Продукт : ${productName}   </p>
    <p>Масса : ${productMass}       </p>
    <p>Калорий :${productKkal}     </p>
    <p>Белков : ${productProtein}    </p>
    <p>Жиров : ${productFat}       </p>
    <p>Углеводов :${productCarbohydrate} </p>

    <p>============================</p>
    <%! static int count = 0; %>
    Page has been shown <%= ++count %> flod
    <p>============================</p>
    <%! int k = 50; %>
    <% for (int i = 0; i < k; i++) { %>
    <%= i %>
    <% } %>

    <p>==========Date==============</p>
    <%= new java.util.Date() %>

    <p>============================</p>
    <p> Good day generator</p>
    <% if (Math.random() < 0.5) { %>
    <p>Good day</p>
    <% } else { %>
    <p>Not today!</p>
    <% } %>
    <p>============================</p>

    <script type="text/javascript" src="<c:url value="/static/js/libs/jquery/jquery.js" />"></script>
<script type="text/javascript" src="<c:url value="/static/js/libs/jquery_lightbox_me/jquery.lightbox_me.js" />"></script>
<script type="text/javascript" src="<c:url value="/static/js/main.js" />"></script>
</body>
</html>