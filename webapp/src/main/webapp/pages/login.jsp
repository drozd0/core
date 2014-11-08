<%@ page language="java" contentType="text/html; charset=utf8" pageEncoding="utf8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@page session="true"%>
<!-- Message i18n-->
<spring:message code="label.username" var="labelUsername"/>
<spring:message code="label.password" var="labelPassword"/>
<spring:message code="label.login.button" var="labelLoginButton"/>
<spring:message code="label.client.registration" var="labelClientRegistration"/>
<spring:message code="label.courier.registration" var="labelCourierRegistration"/>
<spring:message code="label.bad.credentials" var="labelBadCredentials"/>
<html>
    <head>
        <title>Login Page</title>
    </head>
    <body onload='document.loginForm.username.focus();'>
        Lang : <a href="?lang=us">us</a>|<a href="?lang=ru">ru</a>
        <h1>Login</h1>
        <div id="login-box">
            <form:form commandName='loginForm'
                  action="/authenticate"
                  method='POST'>
                <c:if test="${not empty param.error}">
                    <label>${labelBadCredentials}</label>
                </c:if>
                <table>

                    <tr>
                        <td>${labelUsername}</td>
                        <td><input type='text' name='username' /></td>
                    </tr>
                    <tr>
                        <td>${labelPassword}</td>
                        <td><input type='password' name='password' /></td>
                    </tr>
                    <tr>
                        <td colspan='2'><input name="submit" type="submit" value="${labelLoginButton}" /></td>
                    </tr>
                </table>
            </form:form>
            <a href="<c:url value="/registration/client"/>">${labelClientRegistration}</a>
            <br>
            <a href="<c:url value="/registration/courier"/>">${labelCourierRegistration}</a>

        </div>

    </body>
</html>