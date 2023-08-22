 <%@ page import="com.marline.cart.model.Login"%>
  
<p>You are successfully logged in!</p>  
<%
 Login bean=(Login)request.getAttribute("bean");  
out.print("Welcome, "+bean.getName());   
%>  