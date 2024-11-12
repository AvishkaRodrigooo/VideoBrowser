<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
    
    <meta charset="ISO-8859-1">
	<title>insert</title>
	<link rel="stylesheet" type="text/css" href="CHAccstyle.css">
   
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>CSS User Profile Card</title>
	<link rel="stylesheet" href="CHstyles.css">
	<script src="https://kit.fontawesome.com/b99e675b6e.js"></script>
</head>
<body>
    <c:forEach var="CHA_U" items="${chDetails}">
  
     <c:set var="channelList" value= "${CHA_U.channelList}" />
    <c:set var="chname" value=  "${CHA_U.chname}"/>
      <c:set var="owname" value="${CHA_U.owname}"/>
     <c:set var="owemail" value ="${CHA_U.owemail}"/>
       <c:set var="description" value="${CHA_U.description}"/>
      <c:set var="channelId" value="${CHA_U.channelId}"/>
   
    <c:set var="password" value="${CHA_U.password}"/>

<div class="wrapper">
    <div class="left">
        <img src="images/mm.jpg" 
        alt="user" width="100">
        <h4>Flick Flock</h4>
         <p>Channel</p>
    </div>
    <div class="right">
        <div class="info">
            <h3>MY CHANNEL</h3>
            <div class="info_data">
                 <div class="data">
                    <h4>Channel List</h4>
                    <p>${CHA_U.channelList}</p>
                    <hr>
                 </div>
                
            </div>
        </div>
      
      <div class="projects">
           
            <div class="projects_data">
                 <div class="data">
                    <h4>Channel Name</h4>
                    <p>${CHA_U.chname}</p>
                    <hr>
                 </div>
                
            </div>
        </div>

        <div class="projects">
           
            <div class="projects_data">
                 <div class="data">
                    <h4>Owner Name</h4>
                    <p>${CHA_U.owname}</p>
                    <hr>
                 </div>
                
            </div>
        </div>
        <div class="projects">
           
            <div class="projects_data">
                 <div class="data">
                    <h4>Owner Email</h4>
                    <p>${CHA_U.owemail}</p>
                    <hr>
                 </div>
                
            </div>
        </div>
        <div class="projects">
           
            <div class="projects_data">
                 <div class="data">
                    <h4>Channel Description</h4>
                    <p>${CHA_U.description}</p>
                    <hr>
                 </div>
                
            </div>
        </div>
        <div class="projects">
           
            <div class="projects_data">
                 <div class="data">
                    <h4>Channel ID</h4>
                    <p>${CHA_U.channelId}</p>
                    <hr>
                 </div>
                
            </div>
        </div>
        <div class="projects">
           
            <div class="projects_data">
                 <div class="data">
                    <h4>Password</h4>
                    <p>${CHA_U.password}</p>
                    <hr>
                 </div>
                
            </div>
        </div>


        <c:url value="updatechannel.jsp" var ="chaupdate">
    
        <c:param name="channelList" value="${channelList}"/>
        <c:param name="chname" value="${chname}"/>
        <c:param name="owname" value="${owname}"/>
        <c:param name="owemail" value="${owemail}"/>
        <c:param name="description" value="${description}"/>
        <c:param name="channelId" value="${channelId}"/>
         <c:param name="pass" value="${password}"/>
 
  
  </c:url>
  
  <br>
  
  <c:url value ="deletechannel.jsp" var="chadelete">
           
  <c:param name="channelList" value="${channelList}"/>
  <c:param name="chname" value="${chname}"/>
  <c:param name="owname" value="${owname}"/>
  <c:param name="owemail" value="${owemail}"/>
  <c:param name="description" value="${description}"/>
  <c:param name="channelId" value="${channelId}"/>
   <c:param name="pass" value="${password}"/>

</c:url>
        <div class="social_media">
            <ul>
                
              <li><a href="https://www.facebook.com/login/"><i class="fab fa-facebook-f"></i></a></li>
              <li><a href="https://www.twitch.tv/login"><i class="fab fa-twitter"></i></a></li>
              <li><a href="https://www.instagram.com/accounts/login/"><i class="fab fa-instagram"></i></a></li>
            <br>
            <br> 
              <a href ="${chadelete}">
                <input button class="btn1" name="delete" value="Remove">
            </a>
            <a href ="${chaupdate}">
                <input button class="btn2" name="update" value="Update">
               
                </a>
            </ul>

      </div>
    </div>
</div>
</c:forEach>
</body>
</html>