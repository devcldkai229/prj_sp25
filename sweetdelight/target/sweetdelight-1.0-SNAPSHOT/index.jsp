<%@ page import="devcldkai.sweetdelight.model.Products" %>
<%@ page import="java.sql.Date" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>

<%
    Products product = new Products();
        product.setId(1000L);
        product.setName("Deluxe Pizza");
        product.setPrice(199.99);
        product.setDescription("A delicious pizza with premium toppings.");
        product.setCreatedAt(Date.valueOf("2025-01-09")); // Set thời gian hiện tại
        product.setImageUrl("https://example.com/images/deluxe-pizza.jpg");
        product.setCategoryId(6); // Ví dụ: 1 đại diện cho danh mục Pizza
        product.setStoreId(4);  // ID của cửa hàng bán sản phẩm
    request.setAttribute("product", product);
%>
<table class="table caption-top">
    <caption>List of users</caption>
    <thead class="table-dark">
    <tr>
        <th scope="col">Id</th>
        <th scope="col">Name</th>
        <th scope="col">Price</th>
        <th scope="col">Date</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <th scope="row">${product.id}</th>
        <td>${product.name}</td>
        <td>${product.price}$</td>
        <td>${product.createdAt}</td>
    </tr>
    <tr>
        <th scope="row">${product.id}</th>
        <td>${product.name}</td>
        <td>${product.price}$</td>
        <td>${product.createdAt}</td>
    </tr>
    <tr>
        <th scope="row">${product.id}</th>
        <td>${product.name}</td>
        <td>${product.price}$</td>
        <td>${product.createdAt}</td>
    </tr>
    <tr>
        <th scope="row">${product.id}</th>
        <td>${product.name}</td>
        <td>${product.price}$</td>
        <td>${product.createdAt}</td>
    </tr>
    <tr>
        <th scope="row">${product.id}</th>
        <td>${product.name}</td>
        <td>${product.price}$</td>
        <td>${product.createdAt}</td>
    </tr>
    <tr>
        <th scope="row">${product.id}</th>
        <td>${product.name}</td>
        <td>${product.price}$</td>
        <td>${product.createdAt}</td>
    </tr>
    <tr>
        <th scope="row">${product.id}</th>
        <td>${product.name}</td>
        <td>${product.price}$</td>
        <td>${product.createdAt}</td>
    </tr>
    <tr>
        <th scope="row">${product.id}</th>
        <td>${product.name}</td>
        <td>${product.price}$</td>
        <td>${product.createdAt}</td>
    </tr><tr>
        <th scope="row">${product.id}</th>
        <td>${product.name}</td>
        <td>${product.price}$</td>
        <td>${product.createdAt}</td>
    </tr>
    
    </tbody>
</table>

</body>
</html>