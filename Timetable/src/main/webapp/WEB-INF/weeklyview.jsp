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
    
    <form action="view.html">
   		<input type="submit" value="All View">
	</form>
	
	<form action="todayview.html">
   		<input type="submit" value="Today View">
	</form>
    
    <form action="user.html">
   		<input type="submit" value="Back to User Homepage">
	</form>
    
    <br/><hr><br/>
    
 		<%
		String[] d = new String[7];
    	d = UserList.getDatesOfWeek();
		for (int i=0; i<UserList.userList.size(); i++){
			if (UserList.userList.get(i).getUsername().equals(session.getAttribute("name"))){
				for (int j=0;j<UserList.userList.get(i).getAllSession().size();j++){ 
					for (int k=0; k<7;k++){
						String date = d[k];
						Long a = UserList.userList.get(i).getAllSession().get(j);
						for(Admin admin : adminDao.viewWeeklySession(a, date)) { %>
							<%= admin %><br/>
						<%}
					}
				}
			}
		}%>

     </body>
 </html>