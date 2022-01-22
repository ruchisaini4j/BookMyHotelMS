<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="../topMenu.jsp"/>

<html>
<head>
<title>Hotel Details</title>

</head>
<body>
<br/>
<h2 class="b-shadow">Hotel Details!!!!! </h2>
<br/>
<h2>Hotel Details are shown below - </h2>
<br/>
<c:if test="${not empty hotels}">

		<ul>
			<c:forEach var="listValue" items="${hotels}">
				<li>${listValue}</li>
			</c:forEach>
		</ul>
 
	</c:if>


<br/>


<br/>


<table>
<tr>
<td>
<c:url value="/booking/bookHotel.htm/${hotelId}" var="myhome"/>
<a href ="${myhome}">BookHotel  *</a>
</td>
<td>

</td>
 </tr>
</table>

 <%@include file="../footer.jsp" %>
</body>
</html>