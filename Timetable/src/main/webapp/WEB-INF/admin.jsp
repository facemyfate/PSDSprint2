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
        <form method="POST" action="admin.html">
        <table>
        
        <tr>
        	<td>Course:
        	<td><select name="course">
				<option value="Professional Software Development 3">Professional Software Development 3</option>
				<option value="Algorithmic 3">Algorithmic 3</option>
				<option value="Advanced Programming 3">Advanced Programming 3</option>
				<option value="Interactive Systems 3">Interactive Systems 3</option>
				<option value="Programming Language 3">Programming Language 3</option>
				</select>
        <tr>
        	<td>Date:
        	<td><input type ="date" name="date" />
        <tr>
        	<td>Time:
        	<td><input type ="time" name="time" />
        <tr>
        	<td>Duration:
        	<td><select name="duration">
        		<option value="1">1</option>
        		<option value="2">2</option>
        		<option value="3">3</option>
        		<option value="4">4</option>
        		<option value="5">5</option>
        		</select>
        <tr>
        	<td>Repeat Frequency:
        	<td><select name="repeatFreq">
				<option value="Once">Once</option>
				<option value="Weekly">Weekly</option>
				</select>
        <tr>
        	<td>Lecturer:
        	<td><select name="lecturer">
        		<option value="Dr Liew Pak San">Dr Liew Pak San</option>
        		<option value="Dr Loo Poh Kok">Dr Loo Poh Kok</option>
        		<option value="Mr Frankie Cha">Mr Frankie Cha</option>
        		<option value="Dr Keoh Sye Loong">Dr Keoh Sye Loong</option>
        		<option value="Dr Steven Wong">Dr Steven Wong</option>
        		</select>
        <tr>
        	<td>Max Attendance:
        	<td><input type ="text" name="maxAtt" />
        <tr>
        	<td>Compulsory:
        	<td><input type ="radio" name="compulsory" value="Yes"/>Yes<br/>
        	<input type ="radio" name="compulsory" value="No"/>No
        <tr>
        	<td>Venue:
        	<td><select name="venue">
				<option value="Lecture Room">Lecture Room</option>
				<option value="Laboratory">Laboratory</option>
				</select>
        </table>
        <br/><input type="submit" value="Add" />
        </form>
 
 		<form action="index.jsp">
    		<input type="submit" value="Logout">
		</form>
 
        <hr><ol> 
        
        <% for (Admin admin : adminDao.getAllSession()) { %>
            <li> <%= admin %> </li>
        <% } %>
        </ol><hr>
     </body>
 </html>