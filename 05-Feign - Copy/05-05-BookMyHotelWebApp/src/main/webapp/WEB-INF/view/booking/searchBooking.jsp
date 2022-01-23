<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="../topMenu.jsp"/>

<html>
<head>
<title>Search Booking</title>
<c:url value="/css/common.css" var="commonCss"/>
<link rel="stylesheet" href="${commonCss}">

</head>
<body>
<br/>
<h2 class="b-shadow">Bookings!!!!!</h2>
<br/>
<h2>All Bookings of the Hotel are mentioned below</h2>
<br/>
 <c:if test="${not empty bookings}">

		<ul>
			<c:forEach var="listValue" items="${contList}">
				<li>${listValue}</li>
			</c:forEach>
		</ul>

	</c:if> 
<br/>
<br/>



 <%@include file="../footer.jsp" %>
</body>
</html>