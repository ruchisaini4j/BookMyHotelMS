<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="../topMenu.jsp"/>

<html>
<head>
<title>Booking Details</title>
<c:url value="/css/common.css" var="commonCss"/>
<link rel="stylesheet" href="${commonCss}">

</head>
<body>
<br/>
<h2 class="b-shadow">Booking Details!!!!!</h2>
<br/>
<h2>Booking Details are shown below -</h2>
<br/>
 <c:if test="${not empty bookingDetails}">

		<ul>
			<c:forEach var="listValue" items="${bookingDetails}">
				<li>${listValue}</li>
			</c:forEach>
		</ul>

	</c:if> 
<br/>
<br/>



 <%@include file="../footer.jsp" %>

</body>
</html>