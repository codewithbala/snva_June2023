<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Session Demo</title>
<style>
		body {
  				background-color: #f2f2f2;
  				font-family: Arial, sans-serif;
  				color: #333333;
  				margin: 0;
  				padding: 0;
		}
		h1 {
  			color: #333333;
  			font-size: 24px;
  			font-weight: bold;
  			margin: 0;
  			padding: 10px;
		}

        table {
            border-collapse: collapse;
            width: 100%;
            align: center;
        }

        th, td {
            padding: 8px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }

        th {
            background-color: #f2f2f2;
        }

        tr:hover {
            background-color: #f5f5f5;
        }
    </style>
</head>
<body>
	<h1>Personal Details </h1>
	<form method="post" action="FirstServlet">
		<table>
			<tr>
				<td> Enter Name </td>
				<td> <input type="text" name="name" > </td>
			</tr>
			<tr>
				<td> Enter Address </td>
				<td> <input type="text" name="address" > </td>
			</tr>
			<tr>
				<td> Enter Age </td>
				<td> <input type="number" name="age" > </td>
			</tr>
			<tr>
				<td> <input type="submit" value ="Continue">  </td>
				<td> <input type="reset" > </td>
			</tr>
		</table>
	</form>
</body>
</html>
