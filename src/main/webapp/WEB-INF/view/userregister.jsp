<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
    <h2>Enter the userdetails to register:</h2>
    <form action="/api/vehicleloans/userregister/r" method="post">
    
     <label for="userId">User Id:</label><br>
    <input type="number" id="userId" name="userId"><br>
    
    <label for="name">Name:</label><br>
    <input type="text" id="name" name="name"><br>
    
    <label for="email">Email</label><br>
    <input type="email" id="email" name="email"><br>
    
    <label for="mobile">Mobile Number</label><br>
    <input type="number" id="mobno" name="mobile"><br> <br>
    
    <legend>Choose your gender:</legend><br>
    <label for="male">Male</label>
    <input type="radio" name="gender" id="male" value="male" checked>
    <label for="female">Female</label>
    <input type="radio" name="gender" id="female" value="female"><br>
    
    <label for="password">Password:</label><br>
    <input type="text" id="password" name="password"><br>
    
    <label for="age">Age </label><br>
    <input type="number" id="age" name="age"><br>

    <br>
    <input type="submit" id="sub" name="sub"><br>

</form>
    

</body>
</html>
