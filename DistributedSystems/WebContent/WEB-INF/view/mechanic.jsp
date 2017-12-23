<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<div class="ui segment">
	<h2>Calculate</h2>
	<form action="${pageContext.request.contextPath}/calculate"
		method="post">
		<br />AFM:<input type="text" name="afm">		  <br />
		   <input type="submit" value="Calculate">
	</form>

</div>