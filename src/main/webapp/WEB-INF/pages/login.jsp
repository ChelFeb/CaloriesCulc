<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=windows-1251" />
    <title>Счетчик калорий</title>
    <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
    <link href="css/bootstrap.css" rel="stylesheet" type="text/css" />
    <link href="css/bootstrap-theme.css" rel="stylesheet" type="text/css" />
    <link href="css/ccStyle.css" rel="stylesheet" type="text/css" />

    <script src="js/myscript.js" type="text/javascript"></script>
    <script src="_lib/jquery.js" type="text/javascript"></script>
    <script src="jquery.jstree.js" type="text/javascript"></script>

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
                        <td><input name="commit" type="submit" value="Войти" /></td>
                    </tr>
                </table>
            </fieldset>
        </form>
        <script type="text/javascript">
            document.getElementById('username_or_email').focus();
        </script>


    </div>

</div>

</body>
</html>