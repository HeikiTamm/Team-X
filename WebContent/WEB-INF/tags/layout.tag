<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<title><spring:message code="layout.title"/></title>
	<link rel="stylesheet" type="text/css" href="<c:url value="/styles/general.css" />">
</head>
<body>
	<jsp:doBody />
</body>