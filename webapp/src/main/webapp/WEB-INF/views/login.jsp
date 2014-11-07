<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page session="true"%>
<html>
    <head>
        <title>Login Page</title>
    </head>
    <body onload='document.loginForm.username.focus();'>
        <h1>Login</h1>
        <div id="login-box">
            <form:form commandName='loginForm'
                  action="/authenticate"
                  method='POST'>
                <c:if test="${not empty param.error}">
                    <label>Bad credentials. Username or password is incorrect.</label>
                </c:if>
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
                        <td colspan='2'><input name="submit" type="submit" value="login" /></td>
                    </tr>
                </table>
            </form:form>
            <a href="<c:url value="/registration/client"/>">client registration</a>
            <br>
            <a href="<c:url value="/registration/courier"/>">courier registration</a>

        </div>

    </body>
</html>