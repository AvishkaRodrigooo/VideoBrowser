package com.user;

import java.io.IOException; 
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ChannelUpdateServlet")
public class ChannelUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		  String channellist =  request.getParameter("chlist");
		  String cname = request.getParameter("chname");
		  String owname =request.getParameter("owname");
		  String owemail =request.getParameter("owemail");
		  String description =request.getParameter("description");
		  String channelid =request.getParameter("channelid");
		  String password =request.getParameter("pass");
		
		  boolean isTrue;//boolen variable data pass
		  
		  
		  isTrue =ChannelDBUtil.updatechannel(channellist, cname, owname, owemail, description, channelid, password);
		  //updatechannel method databse connection create update data channellist
	      
		  if(isTrue==true) {           //if true navigate page success
			                          //Dbutil create list call
			  List<Channel> chDetails = ChannelDBUtil.getChannelDetails(channellist);
			  request.setAttribute("chDetails",chDetails);         //dat servlet----jsp file send data
			  
			  RequestDispatcher  dis = request.getRequestDispatcher("CHlogin.jsp");
		       dis.forward(request, response);
	       }
	      else {
	    	  
	    	  List<Channel> chDetails = ChannelDBUtil.getChannelDetails(channellist);
			  request.setAttribute("chDetails",chDetails);     //dat servlet----jsp file send data
			  
	        	 RequestDispatcher dis= request.getRequestDispatcher("channelaccount.jsp");
			      dis.forward(request, response);
	        	 
	         }
	//servlet--webxml-->jsp connect
	
	}

}
