<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<div class="ui segment">
	<h2>Login form</h2>
	<h3>
		<font color="red">Wrong ID or Password! Try again!</font>
	</h3>
	<form action="/DistributedSystems/checking" method="post">
		<br />ID:<input type="number" name="id"> Password:<input
			type="password" name="password"> <br /> <input type="submit"
			value="Submit">
	</form>
</div>

