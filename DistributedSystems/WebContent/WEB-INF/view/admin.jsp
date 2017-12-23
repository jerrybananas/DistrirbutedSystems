<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<div class="ui segment">

	<h1>New User</h1>
	<form action="${pageContext.request.contextPath}/admin/newuser">
		<input type="submit" value="newuser" />
	</form>
	<h1>Existing User</h1>
	<form action="${pageContext.request.contextPath}/admin/existinguser">
		<input type="submit" value="existinguser" />
	</form>

</div>