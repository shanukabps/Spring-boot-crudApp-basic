
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>Add Student</title>
 <link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
 <script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
 <script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>
<body>

<%@ include file="navBar.jsp"%>




    <div align="center" class="m-5">
        <h1>Add Employee</h1>
    </div>
<div class="m-5">
<div class="ml-5 mr-5 mb-5">
 <spring:url value="/addEmployee" var="addURL" />

    <form:form modelAttribute="EmployeeForm" method="post" action="${addURL}" cssClass="form" >
     <div class="form-group">
 <form:input type="text" path="empId" placeHolder="Employee Id" cssClass="form-control" id="empId"/>
    </div>
   <div class="form-group">
 <form:input type="text" path="depId" placeHolder="department Id" cssClass="form-control" id="depId"/>
   <small id="passwordHelp" class="text-danger">
        Valied Department Td types {d1,d2.d3.d4,d5}
        </small>
   </div>
   <div class="form-group">
<form:input type="text" path="name" placeHolder=" name" cssClass="form-control" id="name"/>

   </div>
      <div class="form-group">
      <form:input type="text" path="nic" placeHolder="NIC" cssClass="form-control" id="nic"/>

      </div>
            <div class="form-group">
                <form:input type="date" path="joinDate" placeHolder="Join Date" cssClass="form-control" id="joinDate"/>

            </div>
                  <div class="form-group">
                      <form:input type="text" path="department"  placeHolder="Department"  cssClass="form-control" id="department" />

    <small id="passwordHelp" class="text-danger">
         Department Id and Department value must be same
        </small>
                  </div>
   <button type="submit" class="btn btn-success">Add Employee</button>
  </form:form>
</div>

</div>
</div>
<%@ include file="footer.jsp"%>