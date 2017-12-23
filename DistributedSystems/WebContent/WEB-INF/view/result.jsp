<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<div class="ui segment">
	<h3>List of Customers</h3>

	<!--  add our html table here -->
	<table class="ui celled  striped table">
		<thead>
			<th>Money</th>
		</thead>
		<!-- loop over and print our customers -->
		<c:forEach var="tempEmployee" items="${money}">

			<tr>
				<td>${tempEmployee.money}</td>
			</tr>
		</c:forEach>
	</table>
</div>