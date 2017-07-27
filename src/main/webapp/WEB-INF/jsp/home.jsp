
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List book</title>
        <link rel="stylesheet" href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />
        <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/bootstrap.min.css">
    </head>
    <body>
        <a href="jsp/newBook">create new user</a>
        <h2>Search user</h2>
        <form:form action="search" method="get">
            <input type="text" name="searchinput"/>
            <input type="submit" value="search"/>
        </form:form>
        <h2>List of user</h2>
        <c:if test="${not empty listuser}">
            <table>
                <thead>
                    <tr>
                        <th style="width: 200px">
                            ID
                        </th>
                        <th style="width: 200px">
                            Name
                        </th>
                        <th style="width: 200px">
                            age
                        </th>
                        <th style="width: 200px">
                            birthday
                        </th>

                    </tr>
                </thead>
                <c:forEach var="list" items="${listuser}">
                    <tr>

                        <td>
                            ${list.id}
                        </td>
                        <td>
                            ${list.name}
                        </td>
                        <td>
                            ${list.age}
                        </td>
                        <td>
                            ${list.birthday}

                        </td>

                        <td>
                            <button onclick="location.href = 'jsp/edit/${list.id}'">
                                Edit
                            </button>

                        </td>
                        <td>
                            <button onclick="location.href = 'delete/${list.id}'">
                                Delete
                            </button>

                        </td>
                    </tr>
                </c:forEach>


            </table>
        </c:if>
        <c:if test="${listuser==null}">
            list is empty
        </c:if>

    </body>
</html>
