<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="pr" %>

<pr:layout>
	<h3><spring:message code="guards.title"/></h3>
	
	<c:if test="${not empty allGuards}">
		
		<table>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Age</th>
			</tr>
			<c:forEach items="${allGuards}" var="guard"> 
				<tr>
					<td>${guard.id}</td>
					<td>${guard.name}</td>
					<td>${guard.age}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
	
	<a href="guardForm">Add New</a>
	
</pr:layout>