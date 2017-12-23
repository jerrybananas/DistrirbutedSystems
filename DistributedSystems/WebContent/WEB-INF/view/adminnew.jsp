<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<div class="ui segment">
	<h1>New User</h1>
	
	<form action="${pageContext.request.contextPath}/newemp" method="post">

		<div class="form-group">
			<label for="exampleInputID">ID</label> <input type="number"
				class="form-control" name="exampleInputID">
		</div>
		<div class="form-group">
			<label for="exampleInputName">Name</label> <input type="text"
				class="form-control" name="exampleInputName">
		</div>
		<div class="form-group">
			<label for="exampleInputSubmit">Submit</label> <input
				type="checkbox" class="form-control" name="exampleInputSubmit">
		</div>
		<div class="form-group">
			<label for="exampleInputCalculate">Calculate</label> <input
				type="checkbox" class="form-control" name="exampleInputCalculate">
		</div>
		<div class="form-group">
			<label for="exampleInputPassword">Password</label> <input type="text"
				class="form-control" name="exampleInputPassword">
		</div>
		<h4>Role</h4>
		<div class="form-group">
			<select  name="exampleInputRole">
				<option value="admin">Admin</option>
				<option value="mechanic">Mechanic</option>
				<option value="employee">Employee</option>
			</select>
		</div>
		<button type="submit" class="btn btn-default">Create</button>
	</form>
	

</div>