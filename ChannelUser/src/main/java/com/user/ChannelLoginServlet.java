package com.user;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ChannelLoginServlet")
public class ChannelLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String channelid = request.getParameter("cid");            //get jsp input data
		String password = request.getParameter("pass");
		
		try {
			
		    List<Channel> chDetails =ChannelDBUtil.validate(channelid, password);//validate method call
		    request.setAttribute("chDetails", chDetails);
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		RequestDispatcher dis = request.getRequestDispatcher("channelaccount.jsp");
		dis.forward(request, response);
		
		
		
		
		
		
	}

}
