<%@page contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="timetable.*"%>
 
<!DOCTYPE html>
 
<html>
    <head>
        <title>JPA Timetable Web Application Tutorial</title>
        <style>
        th, td { padding: 5px; }
        th, td { vertical-align: top; }
        table { border: 0; }
        </style>
    </head>
 
 	
 
    <body>
        <form method="POST" action="login.jsp">
        <table>
        
        <tr>
        	<td>Username:
        	<td><input type="text" name="username" />
        <tr>
        	<td>Password:
        	<td><input type ="password" name="password" />
        
        </table>
        <br/><input type="submit" value="Login" />
        </form>

     </body>
 </html>