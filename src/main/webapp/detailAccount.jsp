<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h1>DETAIL ACCOUNT</h1>
		<div class="mb-3 mt-3">
			<label for="Id" class="form-label">Id:</label> <b>${a.id}</b>
		</div>
		<div class="mb-3 mt-3">
			<label for="fullName" class="form-label">Full Name:</label> <b>${a.fullName}</b>		
		</div>
		<div class="mb-3 mt-3">
			<label for="gender" class="form-label">Gender:</label> <b>${a.gender?"Male":"Female"}</b>		
		</div>
		<div class="mb-3 mt-3">
			<label for="birthday" class="form-label">Birthday:</label> <b>${a.birthday}</b>		
		</div>
		<div class="mb-3 mt-3">
			<label for="address" class="form-label">Address:</label> <b>${a.address }</b>
		</div>
		<div class="mb-3 mt-3">
			<label for="email" class="form-label">Email:</label> <b>${a.email }</b>
		</div>
		<div class="mb-3 mt-3">
			<label for="phone" class="form-label">Phone:</label> <b>${a.phone }</b>
		</div>
		<br/>
		<a href="index.jsp">Back</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	</div>
</body>
</html>