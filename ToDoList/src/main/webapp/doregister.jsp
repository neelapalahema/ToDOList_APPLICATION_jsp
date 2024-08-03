<%@page import="p1.DAO"%>
<%
    String email=request.getParameter("email");
    String password=request.getParameter("password");
    String mobile=request.getParameter("mobile");
    String address=request.getParameter("address");
    DAO dao=new DAO();
    if(dao.doRegister(email, password, mobile, address))
    {
        response.sendRedirect("login.jsp?msg=RegistrationSuccessfull");
    }else{
        response.sendRedirect("register.jsp?msg=RegistrationFailed");
    }
%>

