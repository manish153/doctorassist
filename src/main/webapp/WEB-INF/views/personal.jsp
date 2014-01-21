<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<jsp:include page="/WEB-INF/views/header.jsp" />

<form class="navbar-form pull-left" method="POST" action="/myapp/success">
<p>SEND EMAIL</p>
 <div><table>
  <tr><td>TO : </td><td> <input name ="pid" type="text" class="form-control" style="width: 200px;" required></td></tr>
  <tr><td>CC :</td><td><input name="first_name" type="text" class="form-control" style="width: 200px;"></td></tr>
  <tr><td>BCC :</td><td><input name="last_name" type="text" class="form-control" style="width: 200px;"></td></tr>
  <tr><td></td><td><input name="attachment" type="checkbox" value="attachment">attachment </td></tr>
  <tr><td><button type="submit" class="btn btn-default">Submit</button></td></tr>
 </table></div> 
</form>



 