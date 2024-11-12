<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
                                         
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="cstyle.css">
   <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <title>Login hgfg</title>
</head>
<body>
  <div class="wrapper">
    <div class="container main">  
        <div class="row">
            <div class="col-md-6 side-image">
                       
                <!-------------      image     ------------->
                
                <img src="imges/white.png" alt="">
                <div class="text">
                    <p>Flickflock<i>-ludiflex</i></p>
                </div>
                
            </div>

            <div class="col-md-6 right">
                
                <div class="input-box">
                                    <form action="log" method="post">
                   <header>YOUR CHANNEL</header>
                   <div class="input-field">
                        <input type="text" class="input" name="cid" required autocomplete="off">
                        <label for="email">Channel ID</label> 
                    </div> 
                   <div class="input-field">
                        <input type="password" class="input" id="pass" name="pass" required>
                        <label for="pass">Password</label>
                    </div> 
                   <div class="input-field">
                        
                        <input type="submit" class="submit" value="Login">
                   </div> 
                   <div class="signin">
                    <span>Do you want create channel? <a href="channelinsert.jsp">Create Channel</a></span>
                    
                   </div>
                   </form>
                </div>  
            </div>
        </div>
    </div>
</div>
</body>
</html>