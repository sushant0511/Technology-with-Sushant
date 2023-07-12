<%@ page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String namevalue=request.getParameter("t1");

try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
	Statement statement=connection.createStatement(); 
	String query="insert into user(`name`) values('"+namevalue+"')";
	int i=0;
	i=statement.executeUpdate(query);
	if(i!=0)
	{
		response.sendRedirect("displaydata.html");
	}
	else
	{
		response.sendRedirect("insertdata.html");
	}
	
} catch (Exception e) {
	
	System.out.println(e);
}

%>



</body>
</html>