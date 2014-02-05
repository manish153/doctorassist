<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<jsp:include page="/WEB-INF/views/header.jsp" />
<link href="<c:url value="/resources/css/datepicker.css" />" rel="stylesheet">
<script type="text/javascript" src="<c:url value="/resources/js/bootstrap-datepicker.js" />"></script>
<script type="text/javascript">
    $(function () {
       $('#sdatetimepicker').datepicker();
       $('#edatetimepicker').datepicker();
    });
</script>

<jsp:useBean id="patient" class="com.mycompany.model.Patient" scope="session"/>
<jsp:setProperty name="patient" property="*"/>

<form class="navbar-form pull-left" method="POST" action="/myapp/success">
<div><table>
  <tr><td>Patient ID </td><td> <input name ="pid" type="text" class="form-control" style="width: 200px;" required></td></tr>
  <tr><td>First Name </td><td><input name="first_name" type="text" class="form-control" style="width: 200px;"></td></tr>
  <tr><td>Last Name </td><td><input name="last_name" type="text" class="form-control" style="width: 200px;"></td></tr>
  <tr><td>Age </td><td><input name="age" type="text" class="form-control" style="width: 200px;"></td></tr>
  <tr><td>Start Date </td><td><input name="date" type="text" class="form-control" id='sdatetimepicker' style="width: 200px;" required></td>
  <td>End Date </td><td><input name="date" type="text" class="form-control" id='edatetimepicker' style="width: 200px;"></td>
  </tr>
  <tr><td>Room </td><td><input name="room" type="text" class="form-control" style="width: 200px;"></td></tr>
</table></div>    

<br><hr>
<button type="submit" class="btn btn-default">Save</button>
</form>



 



