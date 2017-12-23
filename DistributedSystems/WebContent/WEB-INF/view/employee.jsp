<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<div class="ui segment">
	<h1>Employee</h1>
	<form action="${pageContext.request.contextPath}/SubmitCustomer" method="post" style="width: 990px; ">
		<div class="form-group">
			<label for="exampleInputName">Name</label> <input type="text"
				class="form-control" id="exampleInputName">
		</div>
		<div class="form-group">
			<label for="exampleInputAFM">AFM</label> <input type="text"
				class="form-control" id="exampleInputAFM">
		</div>
		<div class="form-group">
			<label for="exampleInputModel">Model</label> <input type="text"
				class="form-control" id="exampleInputModel">
		</div>
		<div class="form-group">
			<label for="exampleInputPlateNumber">Plate Number</label> <input
				type="text" class="form-control" id="exampleInputPlateNumber">
		</div>
		<div class="form-group">
			<label for="exampleInputYear">Year</label> <input type="date"
				class="form-control" id="exampleInputYear">
		</div>
		<h4>Type of fuel</h4>
		<div class="form-group">
			<select name="cartype" id="cartype">
				<option value="petrol">Petrol</option>
				<option value="gasoline">Gasoline</option>
				<option value="gas">Gas</option>
			</select>
		</div>
		<h4>Condition</h4>
		<div class="form-group">
			<select name="condition" id="carcondition">
				<option value="bad">Bad</option>
				<option value="medium">Medium</option>
				<option value="good">Good</option>
			</select>
		</div>
		<button type="submit" class="btn btn-default">Submit</button>
	</form>


	<form action="/DistributedSystems/SubmitCustomer" method="post">
		<div class="form-group">
			<label for="exampleInputAFMRE">AFM that given receipt</label> <input
				type="text" class="form-control" id="exampleInputAFMRE"
				placeholder="afmre">
		</div>
		<button type="submit" class="btn btn-default">Submit</button>
	</form>

</div>