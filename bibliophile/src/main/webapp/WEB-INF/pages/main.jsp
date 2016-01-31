<%@page import="com.softserve.siniaieva.bibliophile.models.Book"%>
<%@page import="com.softserve.siniaieva.bibliophile.entities.MappedBook"%>
<%@page import="com.softserve.siniaieva.bibliophile.models.Reader"%>
<%@ page import="com.softserve.siniaieva.bibliophile.*,java.util.*" %>

<!DOCTYPE HTML>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>My Books List</title>
<style>
		tr:first-child{
			font-weight: bold;
			background-color: #C6C9C4;
		}
	</style>

</head>
<body>
<p>
<h3>Books</h3>

<table>
<tr><th>TITLE</th><th>AUTHOR</th><th>CATEGORY</th></tr>
<% 
	List<Book> books = (List<Book>)request.getAttribute("books");
	for (Book s : books) {
		out.print("<tr><td>"+s.getTitle()+"</td><td>"+s.getAuthor()+"</td><td>"+s.getCategory()+"</td></tr>");
	}

%>
</table>
<a target="_blank" href="/bibliophile/new" style="font-size: 8pt; text-decoration: none">add new book</a>
</body>
</html>
