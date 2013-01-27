<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="pr" %>

<pr:layout>
	<h3><spring:message code="guards.title"/></h3>
	
	<c:if test="${not empty items}">
		
		<table>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Age</th>
			</tr>
			<c:forEach items="${items}" var="item"> 
				<tr>
					<td>${item.id}</td>
					<td>${item.name}</td>
					<td>${item.age}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
	
	<a href="piirivalvur/add">Add New</a>
	
</pr:layout>
