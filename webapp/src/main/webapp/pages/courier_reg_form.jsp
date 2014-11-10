<%@ page language="java" contentType="text/html; charset=utf8" pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Message i18n-->
<spring:message code="label.username" var="labelUsername"/>
<spring:message code="label.password" var="labelPassword"/>
<spring:message code="label.rePassword" var="labelRePassword"/>
<spring:message code="label.registration.button" var="labelRegButton"/>
<spring:message code="label.registration.page.title" var="labelPageTitle"/>
<spring:message code="label.courier.registration.title.layer1" var="labelTitleLayer1"/>
<html>
<head>
    <title>${labelPageTitle}</title>
</head>
<body>

<h1>${labelTitleLayer1}</h1>

<div id="user-box">
    <form:form commandName='courier'
               action="/registration/courier"
               method='POST'>

        <table>
            <tr>
                <td>${labelUsername}</td>
                <td><form:input type='text' path='username'/></td>
                <td><form:errors path='username'/></td>
            </tr>
            <tr>
                <td>${labelPassword}</td>
                <td><form:input type='password' path='password' /></td>
                <td><form:errors path='password'/></td>
            </tr>
            <tr>
                <td>${labelRePassword}:</td>
                <td><form:input type='password' path='rePassword'/></td>
                <td><form:errors path='rePassword'/></td>
            </tr>
            <tr>
                <td/>
                <td><input name="submit" type="submit" value="${labelRegButton}" /></td>
            </tr>
        </table>
    </form:form>

</div>

</body>
</html>