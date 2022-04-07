<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Registration</title>
</head>
<body>


        <h2>Enter admin Registration details :</h2>
        <form action="/api/vehicleloans/admin/r" method="post">
        
            <label for="name">Name:</label><br>
            <input type="text" id="name" name="name"><br>
            
            <label for="email">Admin Email</label><br>
            <input type="text" id="email" name="email"><br>
            
            <label for="password">Password</label><br>
            <input type="password" id="password" name="password">
            <br>
            <br>
          <button type="submit" value="Submit">Submit</button>
          <br>
          </form>


</body>
</html>