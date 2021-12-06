
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SangmOne Form</title>
<style>
h1{
text-align:center;
color:red;
background-color:black
}
body{
background:teal;
color:black;
background-repeat:no repeat;
background-position : top center
}
p{
font-style:italic;
}


</style>

<script>
function myFunction(browser) {
	
  document.getElementById("eresult").value = browser;
}
</script>

</head>
<body>
<h1>SangamOne Registration Form</h1>
<form action="saveInfoSangamOne">
<p>Company Name<br>
<input type="text" name="ecompany" id="SangamOne" value="SangamOne" readonly>
</p>
<p>
Enter Your Full Name:<br>
<input type="text" name="ename" id="ename" value="" required>
</p>
<p>
Enter your Email Address: <br>
<input type="email" name="email"></p>
<p>
Enter Valid Contact No: <br>
<input type="number" name="econtactno" required></p>
<p>

<p>
Select Your Course:<br>
<input type="radio" name="Course" onClick="myFunction(this.value)" value="Mobile App Developer" required>Mobile App Developer</input>
<input type="radio" name="Course" onClick="myFunction(this.value)" value="Fullstock Developer" required>Fullstock Developer</input>
<input type="radio" name="Course" onClick="myFunction(this.value)" value="AI- Computer Vision" required>AI- Computer Vision</input>

</p>
<p>Selected Grade:
<input type="text" name="egrade" id="eresult" required>
</p>
<p>

Enter Message:<br>
<textarea rows="5" cols="30" name="emessage" required></textarea><br><br>

<input type="submit" name="Submit">
<input type="reset" name="Reset">

</form>
</body>
</html>
