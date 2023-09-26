<!DOCTYPE html>
<html>
<head>
 <title>BUYSELL</title>
</head>
<body>
<h1>BUYSELL</h1><hr>
<h4>подробная информация о товаре</h4>
<#list images as img>
<img src="/images/${img.id}" height="360px"/><br><br>
</#list>
<b>название товара: </b>${product.title}<br>
<b>описание товара: </b>${product.description}<br>
<b>цена товара: </b>${product.price}<br>
<b>город: </b>${product.city}<br>
<b>автор: </b>${product.user.name}<br>
<b>Номер телефона: </b>${product.user.phoneNumber}<br>
</body>
</html>