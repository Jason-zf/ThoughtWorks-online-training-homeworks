<%@page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%@page import="tw.springboot.core.Employee"%>
<%@page import="java.util.Map"%>

<html>
<head>
<title>Employees</title>
</head>
<body>
    <table>
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>年龄</td>
        <td>性别</td>
    </tr>
    <%Map<Integer,Employee> map=(Map<Integer,Employee>)request.getAttribute("employees");%>
    <%for(int i=0;i<5;i++){%>
    <tr>
        <td><%out.println(map.get(i).getId());%></td>
        <td><%out.println(map.get(i).getName());%></td>
        <td><%out.println(map.get(i).getAge());%></td>
        <td><%out.println(map.get(i).getGender());%></td>
    </tr>
    <%}%>
    <%map.size();%>
    </table>
</body>

</html>