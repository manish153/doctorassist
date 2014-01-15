<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<jsp:include page="/WEB-INF/views/header.jsp" />

<form class="navbar-form pull-left" method="POST" action="/myapp/success">
  <input name ="pid" type="text" class="form-control" style="width: 200px;"><br/>
  <input name="first_name" type="text" class="form-control" style="width: 200px;"><br/>
  <input name="last_name" type="text" class="form-control" style="width: 200px;"><br/>
  <input name="age" type="text" class="form-control" style="width: 200px;"><br/><br/><br/>
  <button type="submit" class="btn btn-default">Submit</button>
</form>