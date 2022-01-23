<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="../topMenu.jsp"/>

<html>
<head>
<title>Search Your booking</title>
<c:url value="/css/common.css" var="commonCss"/>
<c:url value="/css/inputform.css" var="inputform"/>
<link rel="stylesheet" href="${inputform}">
</head>
<body>
<br/>
<h2 class="b-shadow">Search your booking!!!!! </h2>
<br/>



 
        
        <form:form action="/booking/searchYourBookings.htm" method="post" modelAttribute="searchBooking">
          <form:label path="selectedBookingId"> Select BookingId: </form:label>
          <form:select path="selectedBookingId"  >
            <form:option value="NONE" label="--- Select ---"/>
           <form:options items="${bookingIdsList}" />
          </form:select>
        
          
           
            <br/>
             
              <form:button>Get Booking Details</form:button>   
        </form:form>

<br/>
<br/>


 <%@include file="../footer.jsp" %>

</body>
</html>