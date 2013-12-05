<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>


<!DOCTYPE html>


<html lang="EN">
<head>
    <title>Calories Culc</title>
    <%@ page contentType="text/html;charset=UTF-8" %>
    <link rel="stylesheet" media="screen" type="text/css" href="<c:url value="/static/bootstrap/css/bootstrap.css" />"/>
    <link rel="stylesheet" media="screen" type="text/css" href="<c:url value="/static/css/styles.css" />"/>
    <link rel="stylesheet" media="screen" type="text/css" href="<c:url value="/static/css/ccStyle.css" />"/>
    <link rel="stylesheet" media="screen" type="text/css" href="<c:url value="/static/css/tree.css" />"/>

</head>
<body>
<div id="appHead">
    <div class="row" style="padding: 20px;">

        <div class="col-md-6">
            <div class="well">
                <p> Пользователь: <security:authentication property="principal.username"/></p>

                <sec:authorize ifAllGranted="ROLE_ADMIN">
                    <a href="/calories-culc/secured/admin/products"> Менеджер продуктов</a>
                </sec:authorize>
                <a id="logoutPage" href="<c:url value="/login/"/>"><br>Logout</a>
            </div>
        </div>
    </div>
</div>
<div id="mainDiv">
    <div id="basis" class="hero-unit">

        <div id="productHistory">
            <a class="button green" href="">main1</a>
        </div>

        <div id="productList">
            <table class="table table-striped table-bordered table-hover table-condensed">
                <thead>
                <tr>
                    <th id="prod">Продукт</th>
                    <th>Масса</th>
                    <th>Калории</th>
                    <th>Углеводы</th>
                    <th>Белки</th>
                    <th>Жиры</th>

                </tr>
                </thead>
                <tbody>
                <c:forEach items="${productList}" var="element">
                    <tr>
                        <td>${element.productName}</td>
                        <td> 100</td>
                        <td> ${element.kiloCalories} </td>
                        <td> ${element.fat} </td>
                        <td> ${element.protein} </td>
                        <td> ${element.carbohydrate} </td>
                    </tr>

                </c:forEach>

                <tr style="font-weight:bold">
                    <td>Итого</td>
                    <td> ?</td>
                    <td> ?</td>
                    <td> ?</td>
                    <td> ?</td>
                    <td> ?</td>


                </tr>

                </tbody>

            </table>
        </div>


        <div id="productCatalog">
            <button id="addFolder" type="button" class="btn btn-default">Добавить папку</button>
            <div class="demo">
                <ul>
                    <li><a href="#">Папки с родуктами</a>
                        <ul>
                            <li><a href="#">Папка 1</a></li>


                            <li><a href="#">Папка 2</a></li>
                            <li><a href="#">Папка 3</a>
                                <ul>

                                    <c:forEach items="${productList}" var="element">
                                        <li><a href="#" id="product_${element.id}">${element.productName}</a>
                                        </li>

                                    </c:forEach>

                                </ul>
                            </li>

                        </ul>
                    </li>

                </ul>
            </div>
            <form action="<c:url value="/secured/user/app/add_record"/>" method="POST">
                <input type="text" id="add_text_value" name="add_text_value" class="input-small"/>
                <input type="hidden" id="add_text_value_hide" name="add_text_value_hide" class="input-small"/>
                <input type="hidden" id="add_username_value"
                       name="<security:authentication property="principal.username"/>" class="input-small" />
                <button id="addProduct" type="submit" class="btn btn-default">Добавить продукт</button>
            </form>

        </div>

    </div>
</div>

<div ></div>



<script type="text/javascript" src="<c:url value="/static/js/popup.js" />"></script>
<script type="text/javascript" src="<c:url value="/static/js/jquery.lightbox_me.js" />"></script>

<script type="text/javascript" src="<c:url value="/static/js/libs/jquery/jquery.js" />"></script>
<script type="text/javascript" src="<c:url value="/static/js/main.js" />"></script>
<script type="text/javascript" src="<c:url value="/static/bootstrap/js/bootstrap.min.js" />"></script>

<script type="text/javascript" src="<c:url value="/static/jstree/_lib/jquery.js" />"></script>
<script type="text/javascript" src="<c:url value="/static/jstree/jquery.jstree.js" />"></script>
<script type="text/javascript" src="<c:url value="/static/jstree/_lib/tree.js" />"></script>


</body>
</html>