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
    Welcome, <%= session.getAttribute("name") %><br/><br/>
    View Session
    <br/><hr><br/>
    
    <form action="weeklyview.html">
   		<input type="submit" value="Weekly View">
	</form>

	<form action="todayview.html">
   		<input type="submit" value="Today View">
	</form>
    
    <form action="user.html">
   		<input type="submit" value="Back to User Homepage">
	</form>
    
    <br/><hr><br/>
    
 		<%for (int i=0; i<UserList.userList.size(); i++){
			if (UserList.userList.get(i).getUsername().equals(session.getAttribute("name"))){
				for (int j=0;j<UserList.userList.get(i).getAllSession().size();j++){ 
					Long a = UserList.userList.get(i).getAllSession().get(j);
					Admin result = adminDao.viewSession(a);
					
					%>
					<%= result %><br/>
				<%}
			}
		}%>
		
		
		

     </body>
 </html>