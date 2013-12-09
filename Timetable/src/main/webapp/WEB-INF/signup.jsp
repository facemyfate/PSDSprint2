<%@page contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="timetable.*"%>

<jsp:useBean id="adminDao" type="timetable.AdminDao" scope="request" />

<!DOCTYPE html>

<html>
<head>
<title>JPA Timetable Web Application Tutorial</title>
<style>
th,td {
	padding: 5px;
}

th,td {
	vertical-align: top;
}

table {
	border: 0;
}
</style>
</head>



<body>
	Welcome, <%= session.getAttribute("name") %><br/><br/>
    Sign Up for Session
    <br/><hr><br/>

	<form method="POST">
		<% for (Admin admin : adminDao.getAllSession()) { %>
		<input type="checkbox" name="id" value="<%= admin.getId() %>" /><br/>
		<%= admin %>
		<% } %>
		<input type="submit" value="Sign Up for Session">
	</form>
	<br />
	<form action="user.html">
		<input type="submit" value="Back to User Homepage">
	</form>

	<br />
	<hr>
	<br />


	<%
		String ids[] = request.getParameterValues("id");
			
    	if(ids != null)
    	{
    		for (int i=0; i<UserList.userList.size(); i++){
    			if (UserList.userList.get(i).getUsername().equals(session.getAttribute("name"))){
    				for (int j=0; j<ids.length;j++){
    					Long a = Long.parseLong(ids[j]);
    					if(!UserList.userList.get(i).getAllSession().contains(a)){
    					UserList.userList.get(i).addToSession(a);
    					}
    				}
    			}
    		}
    	}

		%>




</body>
</html>