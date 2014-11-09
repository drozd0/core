<%@ page language="java" contentType="text/html; charset=utf8" pageEncoding="utf8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<div>
    <h3>Menu:</h3>
    <c:forEach items="${menu}" var="menuItem">
        <a href="${menuItem.controller}"><spring:message code="${menuItem.name}"/></a>
    </c:forEach>
</div>
