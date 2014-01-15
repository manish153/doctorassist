<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link
	href="//netdna.bootstrapcdn.com/bootswatch/2.3.2/amelia/bootstrap.min.css"
	rel="stylesheet">
</head>
<script src="http://code.jquery.com/jquery.js"></script>
<script
	src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>

<div class="navbar">
	<div class="navbar-inner">
		<div class="container">

			<a class="btn btn-navbar" data-toggle="collapse"
				data-target=".nav-collapse"> <span class="icon-bar"></span> <span
				class="icon-bar"></span> <span class="icon-bar"></span>
			</a> <a class="brand" href="#">Doctor Assist</a>

			<ul class="nav">
				<li><a href="${pageContext.request.contextPath}/home">Home</a></li>
				<li><a href="${pageContext.request.contextPath}/appointments">Appointments</a></li>
				<li><a href="${pageContext.request.contextPath}/patientdata">PatientData</a></li>
				
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown"> Account <b class="caret"></b>
				</a>
					<ul class="dropdown-menu">
						<li><a href="${pageContext.request.contextPath}/personal">Personal</a></li>
						<li><a href="#">Link</a></li>
					</ul></li>
			</ul>
			<ul class="nav pull-right">		
				<li><a href="<c:url value="j_spring_security_logout" />" > Logout</a></li>	
			</ul>

		</div>
	</div>
</div>
