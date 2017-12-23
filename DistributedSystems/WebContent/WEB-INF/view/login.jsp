<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<div class="ui segment">
	<h2>Login form</h2>
	<form action="${pageContext.request.contextPath}/checking"
		method="post">
		<br />ID:<input type="number" name="id"> Password:<input
			type="password" name="password"> <br /> <input type="submit"
			value="Submit">
	</form>

</div>

