<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Account</title>
<link rel="stylesheet" type="text/css" href="resources/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<h1>UPDATE ACCOUNT</h1>
		<h3 style="color:red">${err }</h3>
		
		<form action="UpdateAccount" method="post">
		<input type="hidden" name = "id" value="${a.id}">
			<div class="mb-3 mt-3">
				<label for="id" class="form-label">Id:</label> <input
					type="text" readonly="readonly" class="form-control" id="id" name="id" value="${a.id}">
			</div>
			
			<div class="mb-3 mt-3">
				<label for="fullName" class="form-label">Full Name:</label> <input
					type="text" class="form-control" id="fullName" name="name" value="${a.fullName}">
			</div>			
			<label for="gender" class="form-label">Gender:</label>
			<div class="form-check mb-3">				
				<label class="form-check-label"> <input
					class="form-check-input" type="radio" name="gender" value="true" ${a.gender?"checked":""}>
					Male					
				</label>	
			</div>
			<div class="form-check mb-3">
				
				<label class="form-check-label"> <input
					class="form-check-input" type="radio" name="gender" value="false" ${!a.gender?"checked":""}>
					Female					
				</label>	
			</div>
			<div class="mb-3 mt-3">
				<label for="birthday" class="form-label">Birthday:</label> <input
					type="date" class="form-control" id="birthday" name="birthday" value="${a.birthday}">
			</div>	
			<div class="mb-3 mt-3">
				<label for="address" class="form-label">Address:</label> <textarea
					class="form-control" id="address" name="address">${a.address}</textarea>
			</div>		
			<div class="mb-3 mt-3">
				<label for="email" class="form-label">Email:</label> <input
					type="text" class="form-control" id="email" name="email" value="${a.email}">
			</div>	
			<div class="mb-3 mt-3">
				<label for="phone" class="form-label">Phone:</label> <input
					type="number" class="form-control" id="phone" name="phone" value="${a.phone}">
			</div>								
			<button type="submit" class="btn btn-primary">Update</button>
			<input type="reset" class="btn btn-danger" value="Clear">
		</form>
	</div>
	<script type="text/javascript" src="resources/js/bootstrap.min.js"></script>
</body>
</html>