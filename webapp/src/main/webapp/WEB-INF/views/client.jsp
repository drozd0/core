<%@ page language="java" contentType="text/html; charset=utf8" pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>client</title>
</head>
<body>
    <H3>The Client's page</H3>

    <body>
    <form:form method="post" action="/user/update" commandName="user" id="userForm">
        <table>
            <tr>
                <td><form:label path="id" id="id">ID:</form:label></td>
                <td><form:input readonly="true" path="id" /></td>
            </tr>
            <tr>
                <td><form:label path="username" id="username">Email:</form:label></td>
                <td><form:input path="username" /></td>
            </tr>
            <tr>
                <td><form:label path="telephoneNumber" id="telephoneNumber">Номер телефона:</form:label></td>
                <td><form:input path="telephoneNumber" /></td>
            </tr>
            <tr>
                <td><form:hidden path="password" id="password"></form:hidden></td>
                <td><form:hidden path="password" /></td>
            </tr>
            <tr>
                <td><form:label path="purseNumber" id="purseNumber">Номер кошелька:</form:label></td>
                <td><form:input path="purseNumber" /></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Сохранить" /></td>
            </tr>
        </table>
    </form:form>
    </body>

</body>
</html>