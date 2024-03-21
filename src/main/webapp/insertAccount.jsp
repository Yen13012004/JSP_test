<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert Account</title>
<link rel="stylesheet" type="text/css" href="resources/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
	    <h1 class="text-center">Add New Account</h1>
	    <form action="InsertAccount" method="post">
	    	<div class="mb-3 mt-3">
	            <label for="name">Password</label>
	            <input type="password" name="password" class="form-control" placeholder="Password..">
	        </div>
	        
	        <div class="mb-3 mt-3">
	            <label for="name">Full Name</label>
	            
	            <input type="text" name="name" class="form-control" placeholder="Full Name..">
	        </div>
	
	        <div class="mb-3 mt-3">
	        	<label for="gender">Gender</label></br>
	            <label for="form-check-label">
	            <input type="radio" name="gender" class="form-check-input" value="true">Male
	            <input type="radio" name="gender" class="form-check-input" value="false">Female
	            </label>
	            
	        </div>
	
	        <div class="mb-3 mt-3">
	            <label for="birthday">Birthday</label>
	            <input type="date" name="birthday" class="form-control">
	        </div>
	
	        <div class="mb-3 mt-3">
	            <label for="address">Address</label>
	            <input type="text" name="address" class="form-control" placeholder="Address..">
	        </div>
	        
	        <div class="mb-3 mt-3">
	            <label for="email">Email</label>
	            <input type="text" name="email" class="form-control" placeholder="Email...">
	        </div>
	
	        <div class="mb-3 mt-3">
	            <label for="phone">Phone</label>
	            <input type="number" name="phone" class="form-control" placeholder="Phone...">
	        </div>
	
	        <button type="submit" class="btn btn-primary">Submit</button>
	        <input type="reset" class="btn btn-danger" value="Clear">
	    </form>
	</div>
</body>
</html>