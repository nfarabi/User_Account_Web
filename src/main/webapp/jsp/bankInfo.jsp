<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bank Info Page</title>
</head>
<body>
<center><h1>Bank Info Page</h1></center>
<form:form method="post" modelAttribute = "user" action = "/user-web/processUser.do">

      <table>
          <tr>
              <td>Bank Name:</td>
              <td><form:input path="bankName" /></td>
          </tr>
          <tr>
              <td>Account Number:</td>
              <td><form:input path="accountNumber" /></td>
          </tr>
          
          <tr>
              <td>SSN Number:</td>
              <td><form:input path="ssnNumber" /></td>
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