package com.user;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ChannelDeleteServlet")
public class ChannelDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String channelist = request.getParameter("chlist");
		boolean isTrue;
		
		isTrue = ChannelDBUtil.deletechannel(channelist);
		if(isTrue==true) {
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("channelinsert.jsp");
			dispatcher.forward(request, response);
			
		}
		else {
			List<Channel>  chDetails = ChannelDBUtil.getChannelDetails(channelist);
			request.setAttribute("chDetails",chDetails);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("channelaccount.jsp");
			dispatcher.forward(request, response);
		}
		
	}

}
