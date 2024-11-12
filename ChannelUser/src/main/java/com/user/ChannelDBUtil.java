package com.user;

import java.sql.Connection; 

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class ChannelDBUtil {
	
	private static Connection con= null;
	private static Statement stmt=null;
	private static ResultSet rs =null;
	
    
	
	public static List<Channel>validate(String channelId,String password){//channel id,password if correct navigate ,channelaccout
	
		  ArrayList<Channel> CHA_U= new ArrayList<>();
		
		  try {
			 
			  con =DBConnect.getConnection();
			  stmt = con.createStatement();
			  String sql ="select*from channeluser where channelid='"+channelId+"' and password='"+password+"'";
			  
			   rs = stmt.executeQuery(sql);
			 
			  if(rs.next()) {//pass tha data
				  
				  int channelList=rs.getInt(1);
				  String chname = rs.getString(2);
				  String owname = rs.getString(3);
				  String owemail =rs.getString(4);
				  String description= rs.getString(5);
				  String channelU=rs.getString(6);
				  String passU= rs.getString(7);
				  
				  Channel c = new Channel(channelList,chname,owname, owemail,description,channelU, passU);//create object,paramete pass
				  CHA_U.add(c);//arryalist pass
				  
			  }
			  
		  }
		  catch(Exception e) {
			  e.printStackTrace();
		  }
		  
		  return CHA_U;
}

	
	//-------------------insert channel-------------------
	public static boolean insertchannel(String cname,String oname,String owemail,String description,String channelid,String password) {
		
		      boolean isSuccess = false;
		      
			  
			  try {
				  
				  
				  con = DBConnect.getConnection();
				  stmt =con.createStatement();
				  String sql ="insert into channeluser values(0,'"+cname+"','"+oname+"','"+owemail+"','"+description+"','"+channelid+"','"+password+"')";
				  int rs =stmt.executeUpdate(sql);
				  
				  
				  if(rs > 0) {
					  
					  isSuccess = true;
				  }
				  else {
					  isSuccess = false;
				  }
			  }
			  catch(Exception e) {
				  e.printStackTrace();
			  }
		        
		        
		      return isSuccess;
	}
	//----------updatechannel details-------------------
	public static boolean updatechannel(String channellist,String cname,String owname,String owemail,String description, String channelid, String password ) {
		                  
		   boolean isSuccess = false;
	     
		   try {
			   //data base connection
			   con = DBConnect.getConnection();
			   stmt = con.createStatement();
			   
			   
			   String sql = "update channeluser set chname='"+cname+"',owname='"+owname+"',owemail='"+owemail+"',description='"+description+"',channelid='"+channelid+"',password='"+password+"'"
			   +"where channelList='"+channellist+"' ";
			   //sql query excute 
			   int rs = stmt.executeUpdate(sql);//sql excute
			   //condition update if success print
			   
			   if(rs>0) {
				   
				   isSuccess = true;
			   }
			   else {
				   isSuccess  = false;
			   }
			   
			   
		   }catch(Exception e){
			   e.printStackTrace();
		   }
		
		return isSuccess;
	}

	//
	public static List<Channel> getChannelDetails(String ChannelList){
		
		    //String value convert integer
		int convertedChannelList = Integer.parseInt(ChannelList);
		
		ArrayList<Channel> CHA_U = new ArrayList<>();
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from channeluser where channelList='"+convertedChannelList+"' ";
			
			rs = stmt.executeQuery(sql);
			while(rs.next());//boolean value return,true and false   query check
			{    
				
				int channelList= rs.getInt(1);
				String chname= rs.getString(2);
				String owname= rs.getString(3);
				String owemail= rs.getString(4);
				String description= rs.getString(5);
				String channelid= rs.getString(6);
				String password= rs.getString(7);
				
				//Channel pass variables
				
				Channel c = new Channel(channelList,chname,owname,owemail,description,channelid,password);
				CHA_U.add(c);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return CHA_U;
		
	}
	
	//channel delete-------------------
	
	
	public static boolean deletechannel(String channelList) {
		boolean isSuccess = false;
		int convId = Integer.parseInt(channelList);
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "delete from channeluser where channelList='"+convId+"'";
			
			int r= stmt.executeUpdate(sql);
			
			if(r>0) {
				
				isSuccess = true;
			}
			else {
				
				isSuccess = false;
			}
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
		
		return isSuccess;
	}
	
	
	
}




