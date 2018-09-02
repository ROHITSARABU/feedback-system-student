<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>

	<div class="container">

		<h2>Admin Page</h2>
		<p>Welcome To Admin Page. Please Enter the UserName and Password</p>
		
		<br>
		
		<hr color="blue">
		<div class="container">

			<form class="form-inline" action="${contextRoot}/adminarea.jsp">
				<div class="form-group">
					<label for="uname">UserName:</label> <input type="text"
						class="form-control" id="uname" placeholder="Enter Username"
						name="email">
				</div>
				<br>
				<div class="form-group">
					<label for="pwd">Password:</label> <input type="password"
						class="form-control" id="pwd" placeholder="Enter password"
						name="pwd">
				</div>
				<br>
				<div class="checkbox">
					<label><input type="checkbox" name="remember">
						Remember me</label>
				</div>
				<button type="submit" class="btn btn-default">Submit</button>
			</form>
		</div>
<hr>
	</div>

</body>
</html>
