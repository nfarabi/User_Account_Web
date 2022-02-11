<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<body>
<h2>Spring Controller Example</h2>

<table>
<tr>
<td>First Name :</td><td>${user.firstName}</td>
</tr>

<tr>
<td>Last Name :</td><td>${user.lastName}</td>
</tr>


<tr>
<td>Middle Name :</td><td>${user.middleName}</td>
</tr>
</table>
<table>
<tr>
<td>Street :</td><td>${user.streetName}</td>
</tr>

<tr>
<td>City :</td><td>${user.cityName}</td>
</tr>


<tr>
<td> State :</td><td>${user.stateName}</td>
</tr>

<tr>
<td> Country :</td><td>${user.countryName}</td>
</tr>
</table>
<table>
<tr>
<td>Bank Name :</td><td>${user.bankName}</td>
</tr>

<tr>
<td>Account Number :</td><td>${user.accountNumber}</td>
</tr>


<tr>
<td> SSN Number :</td><td>${user.ssnNumber}</td>
</tr>

</table>


</body>
</html>