<%@ page language="java" contentType="text/html; charset=utf8" pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title></title>
</head>
<body onload='document.UserSaveRequest.username.focus();'>

<h1>Client registration page.</h1>

<div id="user-box">
    <form name='UserSaveRequest'
          action="<c:url value='/registration/client' />"
          method='POST'>

        <table>
            <tr>
                <td>Email:</td>
                <td><input type='text' name='username'></td>
            </tr>
            <tr>
                <td>Пароль:</td>
                <td><input type='password' name='password' /></td>
            </tr>
            <tr>
                <input name="submit" type="submit" value="Зарегестрироваться" /></td>
            </tr>
        </table>
    </form>

</div>

</body>
</html>