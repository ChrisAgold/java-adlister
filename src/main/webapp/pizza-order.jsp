<%--
  Created by IntelliJ IDEA.
  User: csa116
  Date: 3/8/21
  Time: 12:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order</title>
    <link rel="stylesheet" href="css/pizzaorder.css">
</head>
<body>
<h1>Pizza Form</h1>
<form action="/pizza-order" method="POST">
    <br>
    <label for="crust_types">Crust</label><select name="crust_type" id="crust_types">
    <option value="rising_crust">rising</option>
    <option value="thin_crust">thin</option>
    <option value="stuffed_crust">stuffed</option>
</select>
    <br>
    <label for="sauce_types">Sauce</label><select name="sauce_type" id="sauce_types">
    <option value="pesto">pesto</option>
    <option value="three_cheese">3 cheese</option>
    <option value="marinara">marinara</option>
    <option value="bbq">bbq</option>
</select>
    <br>
    <label for="size">Size</label><select name="size" id="size">
    <option value="small">Small</option>
    <option value="medium">Medium</option>
    <option value="large">Large</option>
    <option value="extra-large">X-Large</option>
</select>
    <br>
    <label for="sausage">sausage</label><input name="toppings" id="sausage" type="checkbox" value="sausage">
    <br>
    <label for="pineapple">pineapple</label><input name="toppings" id="pineapple" type="checkbox" value="pineapple">
    <br>
    <label for="olive">olive</label><input name="toppings" id="olive" type="checkbox" value="olive">
    <br>
    <label for="basil">basil</label><input name="toppings" id="basil" type="checkbox" value="basil">
    <br>
    <label for="anchovies">anchovies</label><input name="toppings" id="anchovies" type="checkbox" value="anchovies">
    <br>
    <label for="mushroom">mushroom</label><input name="toppings" id="mushroom" type="checkbox" value="mushroom">
    <br>

    <label for="address">Address</label>
    <input id="address" name="address" type="text">
    <br>

    <input type="submit" value="order">

</form>
</body>
</html>
