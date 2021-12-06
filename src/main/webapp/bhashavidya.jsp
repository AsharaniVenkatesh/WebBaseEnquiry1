
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BhashaVidyaForm</title>
<style>
h1{
text-align:center;
color:red;
background-color:black
}
body{
background:#A569BD;
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
<h1>Bhashavidya Registration Form</h1>

<form action="saveInfoBhashaVidya">
<p>Company Name<br>
<input type="text" name="ecompany" id="ecompany" value="BhashaVidya"  readonly>
</p>
<p>
Enter Your Full Name:<br>
<input type="text" name="ename" id="ename" value="" required>
</p>
<p>
Enter your Email Address: <br>
<input type="email" name="email" id="email" value="" required></p>
<p>
Enter Valid Contact No: <br>
<input type="number" name="econtactno" id="econtactno" value="contactno" required></p>
<p>
Select Your Grade:<br>
<input type="radio" name="Grade" onClick="myFunction(this.value)" value="Below 16 Years" required>Below 16 Years<br>
<input type="radio" name="Grade" onClick="myFunction(this.value)" value="Above 16 Years" required>Above 16 Years<br>
</p>
<p>Selected Courses:
<input type="text" name="egrade" id="eresult" required>
</p>
<p>
Enter Message:<br>
<textarea rows="5" cols="30" name="emessage" id="emessage" value="" required></textarea><br><br>

<input type="submit" name="Register">
<input type="reset" name="Reset">

</form>
</body>
</html>