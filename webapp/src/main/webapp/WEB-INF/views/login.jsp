<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<html>
    <head>
        <title>Login Page</title>
    </head>
    <body onload='document.loginForm.username.focus();'>
        <h1>Login</h1>

        <div id="login-box">
            <form name='loginForm'
                  action="<c:url value='/auth/login_check?targetUrl=${targetUrl}' />"
                  method='POST'>

                <table>
                    <tr>
                        <td>Email:</td>
                        <td><input type='text' name='username'></td>
                    </tr>
                    <tr>
                        <td>Password:</td>
                        <td><input type='password' name='password' /></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>Remember Me: <input type="checkbox" name="remember-me" /></td>
                    </tr>
                    <tr>
                        <td colspan='2'><input name="submit" type="submit" value="login" /></td>
                    </tr>

                </table>

                <input type="hidden" name="${_csrf.parameterName}"
                       value="${_csrf.token}" />

            </form>

        </div>

    </body>
</html>