<%@page contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="timetable.*"%>
 
<jsp:useBean id="adminDao" type="timetable.AdminDao" scope="request" />
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
    
    Welcome, <%= session.getAttribute("name") %><br/>
    <hr><br/>
    
        <form action="signup.html">
        	<input type="submit" value="Sign Up for Session" />
        </form>
 		<br/>
 		<form action="view.html">
    		<input type="submit" value="View Session">
		</form>
 

     </body>
 </html>