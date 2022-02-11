<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Contact Info Page</title>
</head>
<body>
<center><h1>Contact Info Page</h1></center>
<form:form method="post" modelAttribute = "user" action = "/user-web/processAddBank.do">

      <table>
          <tr>
              <td>Street:</td>
              <td><form:input path="streetName" /></td>
          </tr>
          <tr>
              <td>City:</td>
              <td><form:input path="cityName" /></td>
          </tr>
          
          <tr>
              <td>State:</td>
              <td><form:input path="stateName" /></td>
          </tr>
          <tr>
              <td>Country:</td>
              <td><form:input path="countryName" /></td>
          </tr>
          
          <tr>
              <td colspan="2">
                  <input type="submit" value="Save Changes" />
              </td>
          </tr>
      </table>

</form:form>
</body>
</html>