<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html lang="EN">
<head>
<title>Calories Culc</title>

    <%@ page contentType="text/html;charset=UTF-8" %>
    <link rel="stylesheet" media="screen" type="text/css" href="<c:url value="/static/bootstrap/css/bootstrap.css" />" />
    <link rel="stylesheet" media="screen" type="text/css" href="<c:url value="/static/css/styles.css" />" />
    <link rel="stylesheet" media="screen" type="text/css" href="<c:url value="/static/css/ccStyle.css" />" />
    <link rel="stylesheet" media="screen" type="text/css" href="<c:url value="/static/css/tree.css" />" />

</head>
<body>

    <div class="row" style="padding: 20px;">

        <div class="col-md-6">
            <div class="well">
                <h3>Список продуктов</h3>
                <table class="table table-striped table-bordered table-hover table-condensed">
                    <thead>
                    <tr>
                        <th id="prod" >Продукт</th>
                        <th>Калории </th>
                        <th>Углеводы</th>
                        <th>Белки </th>
                        <th>Жиры </th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${productList}" var="element">
                    <tr>
                        <td>${element.productName}</td>
                        <td> ${element.kiloCalories} </td>
                        <td> ${element.fat} </td>
                        <td> ${element.protein}  </td>
                        <td> ${element.carbohydrate} </td>
                    </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>

        <div class="col-md-6">

            <div class="well">

            <form role="form" class="form-horizontal" action="<c:url value="/products/add/" />" method="POST">
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
        </div>
    </div>

    <script type="text/javascript" src="<c:url value="/static/js/libs/jquery/jquery.js" />"></script>
    <script type="text/javascript" src="<c:url value="/static/js/libs/jquery_lightbox_me/jquery.lightbox_me.js" />"></script>
    <script type="text/javascript" src="<c:url value="/static/js/main.js" />"></script>
    <script type="text/javascript" src="<c:url value="/static/bootstrap/js/bootstrap.min.js" />"></script>

    <script type="text/javascript" src="<c:url value="/static/jstree/_lib/jquery.js" />"></script>
    <script type="text/javascript" src="<c:url value="/static/jstree/jquery.jstree.js" />"></script>
    <script type="text/javascript" src="<c:url value="/static/jstree/_lib/tree.js" />"></script>


</body>
</html>