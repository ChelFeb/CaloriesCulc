<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Login page</title>
</head>
<body>
    <div id="loginForm">
        <%--<spring:url var="authUrl" value="/static/j_spring_security_check" />--%>
        <%--<form method="post" class="signin" action="${authUrl}">--%>
            <%--<fieldset>--%>
                <%--&lt;%&ndash;<table cellspacing="0">&ndash;%&gt;--%>
                    <%--&lt;%&ndash;<tr>&ndash;%&gt;--%>
                        <%--&lt;%&ndash;<th><label for="username_or_email">Username or Email</label></th>&ndash;%&gt;--%>
                        <%--&lt;%&ndash;<td><input id="username_or_email"&ndash;%&gt;--%>
                                   <%--&lt;%&ndash;name="j_username"&ndash;%&gt;--%>
                                   <%--&lt;%&ndash;type="text" /> <!-- Поле ввода имени пользователя -->&ndash;%&gt;--%>
                        <%--&lt;%&ndash;</td>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;</tr>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;<tr>&ndash;%&gt;--%>
                        <%--&lt;%&ndash;<th><label for="password">Password</label></th>&ndash;%&gt;--%>
                        <%--&lt;%&ndash;<td><input id="password"&ndash;%&gt;--%>
                                   <%--&lt;%&ndash;name="j_password"&ndash;%&gt;--%>
                                   <%--&lt;%&ndash;type="password" /> <!-- Поле ввода пароля -->&ndash;%&gt;--%>
                            <%--&lt;%&ndash;<small><a href="/account/resend_password">Forgot?</a></small>&ndash;%&gt;--%>
                        <%--&lt;%&ndash;</td>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;</tr>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;<tr>&ndash;%&gt;--%>
                        <%--&lt;%&ndash;<th></th>&ndash;%&gt;--%>
                        <%--&lt;%&ndash;<td><input name="commit" type="submit" value="Sign In" /></td>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;</tr>&ndash;%&gt;--%>
                <%--&lt;%&ndash;</table>&ndash;%&gt;--%>
            <%--</fieldset>--%>
        <%--</form>--%>
        <script type="text/javascript">
            document.getElementById('username_or_email').focus();
        </script>
    </div>

</body>
</html>