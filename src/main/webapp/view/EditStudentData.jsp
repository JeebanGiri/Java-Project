<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Editing Data</title>
<link rel="stylesheet" type="text/css" href="StudentRegister.css" > 
</head>
<body>
    <form action="EditSrudent" method="post" enctype="mulitpart/form-data">
    <div class="division">
    	<div class="first">
    		<p>
    			<label for="studentID">Student-ID: </label>
    			<input type="text" name="myDid" id="studentID" class="studid">
        	</p>

        	<p>
       			<label for="stuedntName">Student-Name: </label>
           		<input type="text" name="myname" id="studentname" class="name">
        	</p>

        	<p>
        		<label for="studentAddress">Student-Address </label>
            	<input type="text" name="myaddress" id="studentaddress" class="address">
        	</p>
    
    	</div>
    	<div class="second">
    		 <p>
        		<label for="studentPassword">Password: </label>
            	<input type="password" name="mypassword" class="password" id="studentpassword">
        	</p>
        
     		<p class="gender">
     			<label for="gender">Gender: </label>
            	Male <input type="radio" name="mygender" value="Male"> Female <input type="radio" name="mygender" value="Female">
            	Other <input type="radio" name="mygender" value="Other">
        	</p>
    	</div>
    </div>
        <p>
            Write about yourself: <br><textarea name="myText" cols="90" rows="10"></textarea>
        </p>	
        <br>
    <div>
    	Upload Image: <input type="file" name = "image" accept="image/*"/>
    </div>
        <div class="submit">
            <input type="submit" value="Submit Now">
            <input type="reset" value="Reset Now">
        </div>
    </form>
</body>
</html>