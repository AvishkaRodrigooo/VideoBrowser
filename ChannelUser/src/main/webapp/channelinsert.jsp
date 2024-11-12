<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>insert</title>
	<link rel="stylesheet" type="text/css" href="chinsertstyle.css">
	<link href="https://fonts.googleapis.com/css?family=Quicksand&display=swap" rel="stylesheet">
	<meta name="viewport" content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0">
</head>
<body>
	<form action="insert" method="post">
	<div class="container">
		<div class="contact-box">
			<div class="left"></div>
			<div class="right">
				<h2>My Channel</h2>
				
				<input type="text" name ="cname"class="field" placeholder="Channel Name">
				<input type="text"name ="owname" class="field" placeholder="Owner Name">
				<input type="text" name ="owemail" class="field" placeholder="Owner Email">
				<input type="text"name ="description" class="field" placeholder="Channel Description">
				<input type="text" name ="cid" class="field" placeholder="Channel ID">
				<input type="text" name="psw" class="field" placeholder="Password">
				<button class="btn">Create Channel</button>
			</div>
		</div>
	</div>
	</form>
</body>
</html>
 