<%@ page import="java.util.Date" %>
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

    <div class="row">

        <div class="col-md-6">

        </div>

        <div class="col-md-6">
            <form role="form" class="form-horizontal" action="" method="POST">
            <legend>Add product</legend>

	    	<div class="form-group">
				<label for="productName" class="control-label col-lg-2">
				    Product Name
				</label>
				<div class="col-lg-10">
				    <input id="productName" class="form-control" type="text"/>
				</div>
	    	</div>
	    	<div class="form-group">
				<label for="calories" class="control-label col-lg-2">
				    Calories
				</label>
				<div class="col-lg-10">
				    <input id="calories" class="form-control" type="text"/>
				</div>
	    	</div>
	    	<div class="form-group">
				<label for="protein" class="control-label col-lg-2">
				    Protein
				</label>
				<div class="col-lg-10">
				    <input id="protein" class="form-control" type="text"/>
				</div>
	    	</div>
	    	<div class="form-group">
				<label for="fat" class="control-label col-lg-2">
				    Fat
				</label>
				<div class="col-lg-10">
				    <input id="fat" class="form-control" type="text"/>
				</div>
	    	</div>
	    	<div class="form-group">
				<label for="carbohydrate" class="control-label col-lg-2">
				    Carbohydrate
				</label>
				<div class="col-lg-10">
				    <input id="carbohydrate" class="form-control" type="text"/>
				</div>
	    	</div>

            </form>
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