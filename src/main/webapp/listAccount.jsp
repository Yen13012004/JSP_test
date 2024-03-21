<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Account Page</title>
<link rel="stylesheet" type="text/css" href="resources/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<h1 class="text-center">LIST ACCOUNT</h1>
		<h3 style="color:green">${success }</h3>
		<h3 style="color:red">${error }</h3>
		<a class="btn btn-primary mb-1" href="insertAccount.jsp" >ADD NEW ACCOUNT</a>
		
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>ID</th>
	                <th>Full Name</th>
	                <th>Gender</th>
	                <th>Birthday</th>
	                <th>Address</th>
	                <th>Email</th>
	                <th>Phone</th>
	                <th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="a">
					<tr>
						<td>${a.id}</td>
	                    <td>${a.fullName}</td>
	                    <td>${a.gender?"Nữ":"Nam"}</td>
	                    <td>${a.birthday}</td>
	                    <td>${a.address}</td>
	                    <td>${a.email}</td>
	                    <td>${a.phone}</td>
	                    <td>
	                    	<a name="" id="" class="btn btn-success " href="detailAccount?id=${a.id}">Detail</a>
	                    	<a name="" id="" class="btn btn-primary " href="doUpdateAccount?id=${a.id}">UPDATE</a>
	                    	<a name="" id="" class="btn btn-danger " href="deleteAccount?id=${a.id}" onclick="return confirm('sure?')">DELETE</a>
	                    	
	                    </td>
					</tr> 
				</c:forEach>
			</tbody>
		</table>
	</div>
	<script type="text/javascript" src="resources/js/bootstrap.bundle.min.js"></script>
</body>
</html>