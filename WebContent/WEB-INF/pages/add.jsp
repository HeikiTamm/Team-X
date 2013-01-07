<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="pr" %>

<pr:layout>
	<h3>Add Guard</h3>

	<form:form action="addGuard" method="POST" modelAttribute="guard">
		<form:label path="name" >Name:</form:label> <form:input path="name" /><br/>
		<form:label path="age" >Age:</form:label> <form:input path="age" /><br/>
		<input type="submit" value="Add Guard">
	</form:form>
	
	<c:if test="${guardAdded == true }">
		<div>A new Guard was added. View <a href="guards">all guards</a></div>
	</c:if>
</pr:layout>