<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>GET and POST request calculator</title>
</head>

<body>
	<h1>GET and POST Request representation</h1>
	<h2>Current Thread name: ${threadName}</h2>

	<p>Common requests Information:</p>
	<ul>
		<li>Common requests number: ${allQuantity}</li>
	</ul>

	<p>Get requests Information:</p>
	<ul>
		<li>Quantity of income get requests: ${getQuantity}</li>
	</ul>

	<p>POST requests Information:</p>
	<ul>
		<li>Quantity of income POST requests: ${postQuantity}</li>
	</ul>

	<a href="index">Back to index page</a>
</body>
</html>