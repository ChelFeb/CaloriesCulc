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
                    <c:forEach items="${addedProduct}" var="element" >

                    <tr>
                        <td> ${element.product.productName}</td>
                        <td> ${element.mass} </td>
                        <td> ${element.product.kiloCalories} </td>
                        <td> ${element.product.carbohydrate} </td>
                        <td> ${element.product.protein} </td>
                        <td> ${element.product.fat} </td>
                    </tr>

                    </c:forEach>

                <tr style="font-weight:bold">

                        <td>Итого</td>
                        <td> ${sumProduct.mass} </td>
                        <td> ${sumProduct.kiloCalories} </td>
                        <td> ${sumProduct.carbohydrate} </td>
                        <td> ${sumProduct.protein} </td>
                        <td> ${sumProduct.fat} </td>

                </tr>

                </tbody>

            </table>
        </div>


        <div id="productCatalog">
            <button id="open-add-product" href="javascript:void(0);" type="submit" class="btn btn-default">Новый продукт</button>
            <div class="demo">
                <ul>
                    <li>
                        <a href="#">Папки с продуктами</a>
                        <ul>
                            <li>
                                <a href="#">Мои продукты</a>
                                <ul>

                                    <c:forEach items="${userProduct}" var="el1">
                                        <li>
                                            <a href="#" id="product_${el1.id}">${el1.productName}</a>
                                        </li>

                                    </c:forEach>

                                </ul>
                            </li>

                            <li>
                                <a href="#">Общие продукты</a>
                                <ul>

                                    <c:forEach items="${productList}" var="el2">
                                        <li>
                                            <a href="#" id="product_${el2.id}">${el2.productName}</a>
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
                       name="<security:authentication property="principal.username"/>" class="input-small"/>
                <button id="addProduct" type="submit" class="btn btn-default">Добавить продукт</button>
            </form>

        </div>

    </div>
</div>

<div id="add-product-popup" class="popup" style="width: 40%;">
        <form role="form" class="form-horizontal" action="<c:url value="/secured/user/app/add_new_product" />" method="POST">
            <legend>Add product</legend>

            <div class="form-group">
                <label for="productName" class="control-label col-lg-2">
                    Название
                </label>
                <div class="col-lg-10">
                    <input id="productName" name="productName" class="form-control" type="text"/>
                </div>
            </div>
            <div class="form-group">
                <label for="calories" class="control-label col-lg-2">
                    Каллории
                </label>
                <div class="col-lg-10">
                    <input id="calories" name="calories" class="form-control" type="text" placeholder="00.00"/>
                </div>
            </div>
            <div class="form-group">
                <label for="protein" class="control-label col-lg-2">
                    Белки
                </label>
                <div class="col-lg-10">
                    <input id="protein" name="protein" class="form-control" type="text" placeholder="00.00"/>
                </div>
            </div>
            <div class="form-group">
                <label for="fat" class="control-label col-lg-2">
                    Жиры
                </label>
                <div class="col-lg-10">
                    <input id="fat" name="fat" class="form-control" type="text" placeholder="00.00"/>
                </div>
            </div>
            <div class="form-group">
                <label for="carbohydrate" class="control-label col-lg-2">
                    Углеводы
                </label>
                <div class="col-lg-10">
                    <input id="carbohydrate" name="carbohydrate" class="form-control" type="text" placeholder="00.00"/>
                </div>
            </div>
            <div>
                <button type="submit" class="btn btn-primary">Добавить</button>
            </div>
        </form>

</div>




<script type="text/javascript" src="<c:url value="/static/js/libs/jquery/jquery.js" />"></script>
<script type="text/javascript" src="<c:url value="/static/js/libs/jquery_lightbox_me/jquery.lightbox_me.js" />"></script>
<script type="text/javascript" src="<c:url value="/static/js/main.js" />"></script>

<%--<script type="text/javascript" src="<c:url value="/static/bootstrap/js/bootstrap.min.js" />"></script>--%>


<script type="text/javascript" src="<c:url value="/static/jstree/jquery.jstree.js" />"></script>
<script type="text/javascript" src="<c:url value="/static/jstree/_lib/tree.js" />"></script>


</body>
</html>