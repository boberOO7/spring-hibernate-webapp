<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin Panel</title>
</head>
<body>
    <html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href="../../../../favicon.ico">

        <title>Admin Panel</title>

        <link rel="canonical" href="https://getbootstrap.com/docs/4.0/examples/grid/">

        <!-- Bootstrap core CSS -->
        <link href="<c:url value="/resources/static/bootstrap/css/bootstrap.min.css"/>" rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="<c:url value="/resources/static/bootstrap/css/grid.css"/> " rel="stylesheet">
    </head>

    <body>
        <div class="container">

            <h1>Admin Panel</h1>
            <p>You can change there user's role</p>
            <h3>Users</h3>
            <div class="row">
                <div class="col-md-4"><strong>User name</strong></div>
                <div class="col-md-8"><strong>Role</strong></div>
            </div>
            <c:forEach items="${users}" var="u">
                <div class="row">
                    <div class="col-md-4"><c:out value="${u.username}"/></div>
                    <div class="col-md-8">
                        <select name="roles">
                            <option value="${u.role.id}" selected="selected">${u.role.roleName}</option>
                            <c:forEach items="${roles}" var="r">
                                <option value="${r.id}">${r.roleName}</option>
                            </c:forEach>
                        </select>
                    </div>
                </div>
            </c:forEach>

        </div>
    </body>
</html>
