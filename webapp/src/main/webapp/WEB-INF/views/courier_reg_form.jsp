<%@ page language="java" contentType="text/html; charset=utf8" pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title></title>
</head>
<body>

<h1>Courier registration page.</h1>

<div id="user-box">
    <form:form commandName='courier'
          action="/registration/courier"
          method='POST'>

        <table>
            <tr>
                <td>Email:</td>
                <td><form:input type='text' path='username'/></td>
                <td><form:errors path='username'/></td>
            </tr>
            <tr>
                <td>Пароль:</td>
                <td><form:input type='password' path='password' /></td>
                <td><form:errors path='password'/></td>
            </tr>
            <tr>
                <td/>
               <td><input name="submit" type="submit" value="Зарегестрироваться" /></td>
            </tr>
        </table>
    </form:form>

</div>

</body>
</html>