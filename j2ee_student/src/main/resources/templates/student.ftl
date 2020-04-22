<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>分数</td>
        <td>地址</td>
        <td>班级</td>
    </tr>
    <#list studentList as s>
        <tr>
            <td>${s.id}</td>
            <td>${s.name}</td>
            <td>${s.score}</td>
            <td>${s.address}</td>
            <td>${s.clazz.cname}</td>
        </tr>
    </#list>
</table>

</body>
</html>