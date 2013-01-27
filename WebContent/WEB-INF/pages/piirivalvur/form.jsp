<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="pr" %>

<pr:layout>
	<h3>Lisa piirivalvur</h3>

	<form:form action="add" method="POST" modelAttribute="piirivalvur">
		<div class="leftColumn">
			<form:label path="sodurikood" >Sõduri kood:</form:label><br/><form:input path="sodurikood" /><br/>
			<form:label path="isikukood" >Isikukood:</form:label><br/><form:input path="isikukood" /><br/>
			<form:label path="eesnimi" >Eesnimi:</form:label><br/><form:input path="eesnimi" /><br/>
			<form:label path="perekonnanimi" >Perekonnanimi:</form:label><br/><form:input path="perekonnanimi" /><br/>
			<form:label path="sugu" >Sugu:</form:label><br/><form:input path="sugu" />
		</div>
		<div class="rightColumn">
			<form:label path="email" >E-mail:</form:label><br/><form:input path="email" /><br/>
			<form:label path="telefon" >Telefon:</form:label><br/><form:input path="telefon" /><br/>
			<form:label path="aadress" >Aadress:</form:label><br/><form:input path="aadress" /><br/>
			<form:label path="kommentaar" >Kommentaar:</form:label><br/><form:textarea path="kommentaar"/>
		</div>
		<div class="clear"></div>
		<input type="submit" value="Salvesta">
		<input type="submit" value="Katkesta">
		<input type="submit" value="Kustuta">
	</form:form>
	
	<c:if test="${added == true }">
		<div>Uus piirivalvur lisatud. Vaata <a href="piirivalvur">kõiki.</a></div>
	</c:if>
</pr:layout>