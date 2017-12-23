<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<div class="ui segment">
	<h3>List of Customers</h3>

	<!--  add our html table here -->
	<table class="ui celled  striped table">
		<thead>
			<th>ID</th>
			<th>Name</th>
			<th>Role</th>
			<th>Submit</th>
			<th>Calculate</th>
			<th>Password</th>
		</thead>
		<!-- loop over and print our customers -->
		<c:forEach var="tempEmployee" items="${employees}">

			<tr>
				<td>${tempEmployee.id}</td>
				<td>${tempEmployee.name}</td>
				<td>${tempEmployee.role}</td>
				<td>${tempEmployee.sumbit}</td>
				<td>${tempEmployee.calculate}</td>
				<td>${tempEmployee.password}</td>
			</tr>
		</c:forEach>
	</table>
</div>

