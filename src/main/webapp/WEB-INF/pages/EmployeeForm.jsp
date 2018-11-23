<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New/Edit Contact</title>
</head>
<body>
    <div align="center">
        <h1>New/Edit Employee</h1>
        
        <form action="open" method="post">
  <div class="container">
    <h1>Open a savings account</h1>
    <p>Personal details</p>
    <hr>

<!--     <label for="Title"><b>Title</b></label>
    <input type="text" placeholder="Enter title" name="Title" required> -->

  <label for="First Name"><b>First Name</b></label>
    <input type="text" placeholder="Enter First Name" name="first_name" required>

    <label for="Middle Name"><b>Middle Name</b></label>
    <input type="text" placeholder="Enter Middle Name" name="middle_name" required>

<label for="Last Name"><b>Last Name</b></label>
    <input type="text" placeholder="Enter Last Name" name="last_name" required>

 <!-- <label for="Father's Name"><b>Father's Name</b></label>
    <input type="text" placeholder="Enter Father's Name" name="father_name" required>

<label for="Email Id"><b>Email Id</b></label>
    <input type="text" placeholder="Enter email Id" name="email_id" required> 

 <label for="Mobile No"><b>Mobile Number</b></label>
    <input type="number" placeholder="Enter Mobile Number" name="mobile_number" required><br><br>

<label for="Aadhar Card No"><b>Aadhar Card No</b></label>
    <input type="number" placeholder="Enter Aadhar No" name="aadhar_card" required><br><br>


<label for="Date Of Birth"><b>Date Of Birth</b></label>
    <input type="date"  name="date_of_birth" required><br><br>



  <p>Address</p>
<input type="checkbox" name="Permanent address" value="Permanent_address">Permanent address same as residential address<br>
  <label for="Address Line 1"><b>Address Line 1</b></label>
    <input type="text"  name="address_line_1" required><br><br>
<label for="Address Line 2"><b>Address Line 1</b></label>
    <input type="text"  name="address_line_2" required><br><br>




<label for="City"><b>City</b></label>
    <input type="text"  name="city" required><br><br>

<label for="State"><b>State</b></label>
   <select value="state">
        <option value="select">select</option>
        <option value="Andhra Pradesh">Andhra Pradesh</option>
        <option value="Arunachal Pradesh">Arunachal Pradesh</option>
        <option value="Assam">Assam</option>
        <option value="Bihar">Bihar</option>
        <option value="Chattisgarh">Chattisgarh</option>
        <option value="Goa">Goa</option>
        <option value="Gujrat">Gujrat</option>
        <option value="Haryana">Haryana</option>
 <option value="Himachal Pradesh">Himachal Pradesh</option>
        <option value="Jammu & Kashmir">Jammu & Kashmir</option>
        <option value="Jharkhand">Jharkhand</option>
        <option value="Karnatka">Karnatka</option>
<option value="Kerala">Kerala</option>
        <option value="Madhya Pradesh">Madhya Pradesh</option>
        <option value="Maharashtra">Maharashtra</option>
        <option value="Manipur">Manipur</option>
<option value="Meghalaya">Meghalaya</option>
        <option value="Mizoram">Mizoram</option>
        <option value="Nagaland">Nagaland</option>
        <option value="Orissa">Orissa</option>
<option value="Punjab">Punjab</option>
        <option value="Rajasthan">Rajasthan</option>
        <option value="Sikkim">Sikkim</option>
        <option value="Tamil Nadu">Tamil Nadu</option>
<option value="Telangana">Telangana</option>
        <option value="Tripura">Tripura</option>
        <option value="Uttarakhand">Uttarakhand</option>
        <option value="Uttar Pradesh">Uttar Pradesh</option>
<option value="West Bengal">West Bengal</option> <br> <br>

        

      </select><br><br>
<label for="Pincode"><b>Pincode</b></label>
    <input type="number"  name="pin_code" required><br><br>
  <p1>Debit/ATM Card</p1><br> <br>
  <p2>Do you want a debit card ?</p>
<input type="checkbox" name="Net Banking" value="Net banking">Opt for Net Banking<br>
<input type="checkbox" name="Agree" value="Agree">I agree<br>
   
    <hr>
    <p>By creating an account you agree to our terms and conditions.</p>
 -->
    <input type="submit" class="registerbtn" value="Register">
  </div>
  </form>
  <div class="container Login">
    <p>Already have an account? <a href="#">Log in</a>.</p>
  </div>

        
     <%--    <form:form action="saveEmployee" method="post" modelAttribute="employee">
        <table>
            <form:hidden path="id"/>
            <tr>
                <td>Name:</td>
                <td><form:input path="name" /></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><form:input path="email" /></td>
            </tr>
            <tr>
                <td>Address:</td>
                <td><form:input path="address" /></td>
            </tr>
            <tr>
                <td>Telephone:</td>
                <td><form:input path="telephone" /></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
        </form:form> --%>
        
        <a href="open">click here</a>
        
         <form action="open">
            <label for="First Name"><b>First Name</b></label>
    <input type="text" placeholder="Enter First Name" name="first_name" required>
        <input type="text" placeholder="address" name="address_line_1" required>
    
        <input type="submit" value="submit">
        </form> 
    </div>
</body>
</html>