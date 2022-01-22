<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="../topMenu.jsp"/>
<html>
<head>
<title>Home</title>
<c:url value="/css/common.css" var="commonCss"/>
<link rel="stylesheet" href="${commonCss}">
</head>
<body>
<br/>
<h2 class="b-shadow">Welcome ${user} to BookMyHotel!!!!!</h2>
<br/>

<c:url value="/search/search.htm" var="mySearch"/>
<c:url value="/booking/allBooking.htm" var="mySearchHotelBooking"/>
<c:url value="/login.htm" var="myLogout"/>
<c:url value="/registration/viewRegDetails.htm" var="myViewRegDetails"/>


<ul>
  <li><a href="${mySearch}">Search Hotels</a></li>
  <li><br/><li/>
  <li><a href ="${mySearchHotelBooking}">Existing Hotel Bookings</a></li>
  <li><br/><li/>
  <li><a href ="${myViewRegDetails}">View Registration Details</a></li> 
</ul> 
<br/>
<br/>
<br/>
<br/>
<br/>
<h3><a href="${myLogout}">Logout!! </a></h3>
 

</body>
</html>


