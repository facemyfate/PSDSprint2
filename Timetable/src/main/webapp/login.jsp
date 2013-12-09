<%@page contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="timetable.*"%>
 
<!DOCTYPE html>
 
<html>
    <head>
        <title>JPA Timetable Web Application Tutorial</title>
    </head>
 
 	
 
    <body>
		<%		
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        
        if((username.equals("admin") && password.equals("admin")))
            {
            response.sendRedirect("admin.html");
            }
        else if((username.equals("user1") && password.equals("user1")))
        	{
        	session.setAttribute("name", username);
        	/* for (int i = 0; i < ul.getUserList().size(); i++){
        		if (ul.getUserList().get(i).getUsername().equals(username)){
        			response.sendRedirect("user.html");
        		}
        	} */
        	
        	User user = new User(username, password);
        	UserList.userList.add(user);
        	/*ul.addUser(user);*/
        	response.sendRedirect("user.html");
        	}
        else if((username.equals("user2") && password.equals("user2")))
        {
        	session.setAttribute("name", username);
        	User user = new User(username, password);
        	UserList.userList.add(user);
        	//ul.addUser(user);
        	response.sendRedirect("user.html");
        	}
        else
        	response.sendRedirect("error.jsp");
        %>

    </body>
 </html>