<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="../topMenu.jsp"/>

<html>
<head>
<title>Existing Bookings</title>


</head>
<body>
<br/>
<h2 class="b-shadow">Existing Bookings!!!!!</h2>
<br/>
<br/>
<h3>Select Booking Id to view booking details</h3>
<c:url value="/booking/bookingDetails.htm" var="myBooking"/>
 <c:if test="${not empty bookings}">

		<table>
		
			<c:forEach var="listValue" items="${bookings}">
			<tr>
				<td><a href="${myBooking}/${listValue}">${listValue}</a></td>
			</tr>
			</c:forEach>
		
		</table>

	</c:if> 
<br/>
<br/>



 <%@include file="../footer.jsp" %>
</body>
</html>