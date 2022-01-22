<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="../topMenu.jsp"/>

<html>
<head>
<title>Registration Details</title>

</head>
<body>
<br/>
<h2 class="b-shadow">RegsitrationDetails!!!!!</h2>
<br/>
<h2>Registration Details are shown below -</h2>
<br/>
<c:if test="${not empty registration}">

		<ul>
			<c:forEach var="listValue" items="${registration}">
				<li>${listValue}</li>
			</c:forEach>
		</ul>

	</c:if>
<br/> 
<br/>



 <%@include file="../footer.jsp" %>

</body>
</html>