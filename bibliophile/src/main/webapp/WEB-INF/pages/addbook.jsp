<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Add new book Form</title>

        <style>

            .error {
                color: #ff0000;
            }
        </style>

    </head>

    <body>

        <h2>Registration Form</h2>

    <form:form method="POST" modelAttribute="book" action="AddView">
        <form:input type="hidden" path="id" id="id"/>
        <table>
            <tr>
                <td><label for="title">TITLE: </label> </td>
                <td><input path="title" name="title" id="title"/></td>
            <td><form:errors path="title" cssClass="error"/></td>
            </tr>

            <tr>
                <td><label for="author">AUTHOR: </label> </td>
                <td><input path="author" name="author" id="author"/></td>
            <td><form:errors path="author" cssClass="error"/></td>
            </tr>

            <tr>
                <td><label for="category">CATEGORY: </label> </td>
                <td><input path="category" name="category" id="category"/></td>
            <td><form:errors path="category" cssClass="error"/></td>
            </tr>


            <tr>
                <td colspan="2">
                    <input type="submit" value="Submit"/>
                </td>
            </tr>
        </table>  
    </form:form>
    <br/>
    <br/>
    Go back to <a href="/bibliophile/books">List of All Books</a>
</body>
</html>