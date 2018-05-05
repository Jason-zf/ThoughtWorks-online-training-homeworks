<%@page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%@page import="tw.springboot.core.Employee"%>
<%@page import="java.util.Map"%>

<html>
<head>
    <title>Employees</title>
    <style><%@include file="/WEB-INF/css/tableStyle.css"%></style>
</head>
<body>
    <table>
    <tr class="first_tr">
        <td>编号</td>
        <td>姓名</td>
        <td>年龄</td>
        <td>性别</td>
    </tr>
    <%Map<Integer,Employee> map=(Map<Integer,Employee>)request.getAttribute("employees");%>
    <%for(int i=0;i<map.size();i+=2){%>
    <tr class="odd_tr">
        <td><%out.println(map.get(i).getId());%></td>
        <td><%out.println(map.get(i).getName());%></td>
        <td><%out.println(map.get(i).getAge());%></td>
        <td><%out.println(map.get(i).getGender());%></td>
    </tr>
    <tr class="even_tr">
    <%if(i+1<map.size()){%>
            <td><%out.println(map.get(i+1).getId());%></td>
            <td><%out.println(map.get(i+1).getName());%></td>
            <td><%out.println(map.get(i+1).getAge());%></td>
            <td><%out.println(map.get(i+1).getGender());%></td>
    <%}%>
    </tr>
    <%}%>
    </table>
</body>

</html>