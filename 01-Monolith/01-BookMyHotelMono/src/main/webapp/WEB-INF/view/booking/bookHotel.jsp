<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="../topMenu.jsp"/>

<html>
<head>
<title>Book Hotel</title>
<c:url value="/css/inputform.css" var="inputform"/>
<link rel="stylesheet" href="${inputform}">
</head>
<body>
<br/>
<h2 class="b-shadow">Book Hotel!!!!! </h2>
<br/>
<h2>Book a room in hotel - </h2>
<br/>

  
        
        <form:form action="/booking/bookHotel.htm" method="post" modelAttribute="booking">
            <form:label path="HotelName">Hotel Name:</form:label>
            <form:input path="hotelName"/><br/>
             
            <form:label path="StartDate">Start Date:</form:label>
            <form:input path="startDate" required="true"/><br/>
             
            <form:label path="EndDate">End Date:</form:label>
            <form:input path="endDate" required="true"/><br/>    
            
            <form:label path="RoomType">Room Type:</form:label>
            <form:input path="roomType" required="true"/><br/>       
     
     		
            <form:button>Book Hotel</form:button>
        </form:form>

<br/>
<br/>


 <%@include file="../footer.jsp" %>

</body>
</html>