<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap.min.css"
	rel="stylesheet">
</head>


	<div class="container" align="center">
		<div class="content">
			<div class="row">
				<div class="login-form">
					<h2 class="form-signin-heading">Please signin here</h2>
					<form action="<c:url value='j_spring_security_check'/>" method="POST">
						<fieldset>
						
								<input type="text" name='j_username' class="form-control" placeholder="Username" required  style="width: 200px;"><br/>
							
								<input type="password" name='j_password' class="form-control" placeholder="Password" required style="width: 200px;"><br/>
						
							<button class="btn btn-primary" type="submit">Sign in</button>
						</fieldset>
					</form>
				</div>
			</div>
		</div>
	</div>

