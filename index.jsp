<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cookie 1</title>
<style>
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
	<form method="get" action="FirstServlet">
		<table>
			<thead>
			<tr>
				<th> Personal Details </th>
			</tr>
			</thead>
			<tbody>
				<tr>
					<td>Name</td>
					<td><input type ="text" name ="tname"> </td>
				</tr>
				<tr>
					<td>Father Name</td>
					<td><input type ="text" name ="tfname"> </td>
				</tr>
				<tr>
					<td><input type="submit" value ="Continue"></td>
					<td><input type="reset" value ="Reset"></td>
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>
