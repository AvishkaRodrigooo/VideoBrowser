<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<title>CSS User Profile Card</title>

    <link rel="stylesheet" type="text/css" href="CHupstyle.css">
   

	<script src="https://kit.fontawesome.com/b99e675b6e.js"></script>
</head>
<body>


   <%
        String channelList = request.getParameter("channelList");
        String chname = request.getParameter("chname");
        String owname = request.getParameter("owname");
        String owemail = request.getParameter("owemail");
        String description = request.getParameter("description");
        String channelId = request.getParameter("channelId");
        String password =request.getParameter("password");

%>

 <form action="update" method ="post">
<div class="wrapper">
    <div class="left">
        <img src="images/bg.jpg" 
        alt="user" width="90%">
        <h4>Flick flock</h4>
         <p>Channel</p>
    </div>
    <div class="right">
       
        <div class="info">
            <h3>MY CHANNEL</h3>
            <div class="info_data">
                 <div class="data">
                    <h4>Chanel List</h4>
                    <p><input type="text" name="chlist" value="<%=channelList%>"readonly class="input"></p>
                    <hr>
                 </div>
                
            </div>
        </div>
      


      <div class="projects">
           
            <div class="projects_data">
                 <div class="data">
                    <h4>Channel Name</h4>
                    <p><input type="text" name="chname" value="<%=chname%>" class="input"></p>
                    <hr>
                 </div>
                
            </div>
        </div>

        <div class="projects">
           
            <div class="projects_data">
                 <div class="data">
                    <h4>Owner Name</h4>
                    <p><input type="text" name="owname" value="<%= owname%>"class="input"></p>
                    <hr>
                 </div>
                
            </div>
        </div>
        <div class="projects">
           
            <div class="projects_data">
                 <div class="data">
                    <h4>Owner Email</h4>
                    <p><input type="text" name="owemail" value="<%=owemail%>"class="input"></p>
                    <hr>
                 </div>
                
            </div>
        </div>
        <div class="projects">
           
            <div class="projects_data">
                 <div class="data">
                    <h4>Channel Description</h4>
                    <p><input type="text" name="description" value="<%=description%>"class="input"></p>
                    <hr>
                 </div>
                
            </div>
        </div>
        <div class="projects">
           
            <div class="projects_data">
                 <div class="data">
                    <h4>Channel ID</h4>
                    <p><input type="text" name="channelid" value="<%=channelId%>"class="input"></p>
                    <hr>
                 </div>
                
            </div>
        </div>
        <div class="projects">
           
            <div class="projects_data">
                 <div class="data">
                    <h4>Password</h4>
                    <p><input type="password" name="pass" value="<%=password%>"class="input"></p>
                    <hr>
                 </div>
                
            </div>
            <br><br>
             <input button class="btn1" type="submit" name="submit" value="Update Channel Details"><br>
        </div><ul>
        <a href ="http://localhost:8090/ChannelUser/CHlogin.jsp">
                <input button class="btn2" name="update" value="back">
               
                </a></ul>
        
</form>
      
     

     
    </div>
</div>

</body>
</html>