<%@ page language="java" contentType="text/html; charset=utf8" pageEncoding="utf8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<h1>Client private account</h1>
<a href="/client">Назад</a>
<a href="/logout">Выйти</a></td>

<h3>${currentUser.username} - client</h3>
<form:form commandName="phoneSaveRequest" method="post" action="/client/personal/phonesave">
    <input type="hidden" name="email" value="${currentUser.username}"/>
    <table>

        <tr>
            <td>Phone</td>
            <td><input name="phoneNumber" value="${currentUser.telephoneNumber}" /></td>
        </tr>
        <tr>
            <td><td colspan='2'><input name="submitPhone " type="submit" value="Сохранить"/></td></td>
            </td>
        </tr>
    </table>

</form:form>
<form:form commandName="addressSaveRequest" method="post" action="/client/personal/addresssave">
    <input type="hidden" name="email" value="${currentUser.username}"/>

    <c:if test="${not empty currentUser.address}">
        <c:set value="${currentUser.address}" var="address"/>
    </c:if>

    <table>

        <tr>
            <td>City</td>
            <td><input name="city" placeholder="city" value="${not empty address.city ? address.city : ""}" /></td>
        </tr>
        <tr>
            <td>Street</td>
            <td><input name="street" placeholder="street" value="${not empty address.street ? address.street : ""}" /></td>
        </tr>
        <tr>
            <td>Building</td>
            <td><input name="building" placeholder="building number" value="${not empty address.buildingNum ? address.buildingNum : ""}" /></td>
        </tr>
        <tr>
            <td>Flat</td>
            <td><input name="flat" placeholder="flat number" value="${not empty address.flatNum ? address.flatNum : ""}" /></td>
        </tr>
        <tr>
            <td><td colspan='2'><input name="submit" type="submit" value="Сохранить"/></td></td>
            </td>
        </tr>
    </table>

</form:form>
<form:form commandName="purseSaveRequest" method="post" action="/client/personal/pursesave">
    <input type="hidden" name="email" value="${currentUser.username}"/>
    <table>

        <tr>
            <td>Purse</td>
            <td><input name="purseNumber" value="${currentUser.purseNumber}" /></td>
        </tr>
        <tr>
            <td><td colspan='2'><input name="submit" type="submit" value="Сохранить"/></td></td>
            </td>
        </tr>
    </table>

</form:form>

