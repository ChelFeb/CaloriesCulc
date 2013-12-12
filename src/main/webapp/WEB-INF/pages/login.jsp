<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=windows-1251" />
    <title>Счетчик калорий</title>
    <link rel="stylesheet" media="screen" type="text/css" href="<c:url value="/static/bootstrap/css/bootstrap.css" />"/>
    <link rel="stylesheet" media="screen" type="text/css" href="<c:url value="/static/css/styles.css" />"/>



    <style type="text/css">
        #loginMainBlock{width: 800px; height: 400px; background-color: #EAEFFF;
            margin: 0 auto;  padding: 3%; margin-top: 5%;}
        body{background-color: white;}
        #loginInputBlock{width: 400px; height: 100px; background-color: #CECECE;
            margin: 0 auto; margin-top: 30%; border-radius: 20px;}
        #loginTable{
            margin: 0 auto;
            top: 50%;
        }
        #username_or_email {
            margin-top: 5%;
        }
    </style>

    <script type="text/javascript">
        (function ($) {


        })(jQuery);
    </script>


</head>
<body>
<div id="loginMainBlock">
    Приложение счетчик калорий, описание функциональности, скриншоты;

    <div id="loginInputBlock">
        <spring:url var="authUrl" value="/static/j_spring_security_check" />
        <form method="post" class="signin" action="${authUrl}">
            <fieldset>
                <table id="loginTable" cellspacing="0">
                    <tr>
                        <th><label for="username_or_email">Имя пользователя</label></th>
                        <td><input id="username_or_email"
                                   name="j_username"
                                   type="text" /> <!-- Поле ввода имени пользователя -->
                        </td>
                    </tr>
                    <tr>
                        <th><label for="password">Пароль</label></th>
                        <td><input id="password"
                                   name="j_password"
                                   type="password" /> <!-- Поле ввода пароля -->
                        </td>
                    </tr>
                    <tr>
                        <th></th>
                        <td><input name="commit" class="btn btn-primary" type="submit" value="Войти" /></td>
                    </tr>
                </table>
            </fieldset>
        </form>

        <button id="open-registration" href="javascript:void(0);" type="submit" class="btn btn-default">Регистрация</button>

        <script type="text/javascript">
            document.getElementById('username_or_email').focus();
        </script>


    </div>

</div>

<div id="registration-popup" class="popup" style="width: 40%;">
    <form role="form" class="form-horizontal" action="<c:url value="/login" />" method="POST">
    <legend>Новый пользователь</legend>

    <div class="form-group">
        <label class="control-label col-lg-2">
            login:
        </label>
        <div class="col-lg-10">
            <input id="userName" name="userName" class="form-control" type="text"/>
        </div>

        <label class="control-label col-lg-2">
            password:
        </label>
        <div class="col-lg-10">
            <input id="userPassword" type="password" name="userPassword" class="form-control" type="text"/>
        </div>
        <label class="control-label col-lg-2">
            password:
        </label>
        <div class="col-lg-10">
            <input id="userPasswordRe" type="password" name="userPasswordRe" class="form-control" type="text"/>
        </div>
        <label class="control-label col-lg-2">
            email:
        </label>
        <div class="col-lg-10">
            <input id="userEmail" name="userEmail" class="form-control" type="text"/>
        </div>
    </div>

    <div>
        <button type="submit" class="btn btn-primary">Ок</button>
    </div>
    </form>

</div>

</body>

<script type="text/javascript" src="<c:url value="/static/js/libs/jquery/jquery.js" />"></script>
<script type="text/javascript" src="<c:url value="/static/js/libs/jquery_lightbox_me/jquery.lightbox_me.js" />"></script>
<script type="text/javascript" src="<c:url value="/static/js/main.js" />"></script>

</html>