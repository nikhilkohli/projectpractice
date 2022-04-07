<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        
    </head>
    <body>
       
          
          <h2>Enter Admin login details :</h2>
          <form action="/api/vehicleloans/adminlogin/{adminEmail}/{password} method="post">

        <label for="adminEmail">Admin Email:</label><br>
        <input type="text" id="adminEmail" name="adminEmail"><br>
        <label for="password">Password</label><br>
        <input type="password" id="password" name="password">
        
         <br>
            <br>
          <button type="submit" value="Submit">Submit</button>
          <br>
          
      </form>
          
           
    </body>
</html>