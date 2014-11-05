<%@ page language="java" contentType="text/html; charset=utf8" pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <title></title>
    </head>
    <body onload='document.userForm.username.focus();'>

    <h1>Registration</h1>

    <div id="user-box">
        <form name='userForm'
              action="<c:url value='/user/add' />"
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
                    <td>Role:</td>
                    <td>
                        <select name="role_id">
                            <option value=1>Отправитель</option>
                            <option value=2>Получатель</option>
                            <option value=3>Курьер</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td colspan='2'><input name="submit" type="submit" value="registrate" /></td>
                </tr>
            </table>
        </form>

    </div>

    </body>
</html>