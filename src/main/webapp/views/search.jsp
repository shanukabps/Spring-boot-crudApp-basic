<%@ include file="header.jsp"%>
<%@ include file="navBar.jsp"%>





<div class="mr-5 ml-5 mb-5 mt-5">

<div align="center" >
    <h2>Search Employees</h2>
</div>
<div class="m-5">
<table class="table">
<tr>
<td>  <form action="/search">
             <input type="text" placeHolder="Search By EmployeeId" name="empId"></input>
    <button type="submit" class="btn btn-primary">Search</button>

       </form>
</td>
<td>  <form action="/SearchMethodNic">
             <input type="text" placeHolder="Nic Start with" name="nicStart"></input>
    <button type="submit" class="btn btn-primary">Search</button>

       </form>
</td>
<td>  <form action="/searchDep">
             <input type="text" placeHolder="by DepartmentID" name="depId"></input>
    <button type="submit" class="btn btn-primary">Search</button>

       </form>
</td>

</tr>
</table>



  <table class="table table-striped mt-5">


   <thead class="thead-dark">
    <th scope="row">Employee ID</th>
    <th scope="row">Department ID</th>
    <th scope="row">Name</th>
    <th scope="row">NIC NUmber</th>
        <th scope="row">Department</th>
    <th scope="row">Join Date</th>
      <th scope="row">Update</th>
        <th scope="row">Delete</th>

   </thead>
   <tbody>
    <c:forEach items="${employeeList}" var="employee" >
     <tr>
      <td>${employee.empId}</td>
      <td>${employee.depId}</td>
      <td>${employee.name}</td>
       <td>${employee.nic}</td>
            <td>${employee.department.depName}</td>
        <td>${employee.joinDate}</td>
      <td>
        <spring:url value="/updateEmployee/${employee.empId}/${employee.depId}" var="deleteURL" />
             <a class="btn btn-info" href="${deleteURL}" role="button" >Update</a>
      </td>
      <td>
            <spring:url value="/deleteEmployee/${employee.empId}/${employee.depId}" var="editURL" />
            <a class="btn btn-danger" href="${editURL}" role="button" >Delete</a>

      </td>
     </tr>
    </c:forEach>
   </tbody>
  </table>
</div>
</div>
<%@ include file="footer.jsp"%>