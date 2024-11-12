package com.user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ChannelInsert")
public class ChannelInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	    String cname = request.getParameter("cname");
       String oname = request.getParameter("owname");
       String owemail = request.getParameter("owemail");
       String description= request.getParameter("description");
       String channelid = request.getParameter("cid");
       String password = request.getParameter("psw");
       
       
       boolean isTrue;
       isTrue = ChannelDBUtil.insertchannel(cname, oname, owemail, description, channelid, password);
       
	   if(isTrue==true) {
		   RequestDispatcher dis = request.getRequestDispatcher("CHlogin.jsp");
		   dis.forward(request, response);
	   }
	   else {
		   RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
		   dis2.forward(request, response);
	   }
	}

}
