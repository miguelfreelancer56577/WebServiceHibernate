<%@page import="com.mangelt.movies.manager.dao.MovieDao"%>
<%@page import="com.mangelt.movies.manager.model.Movie"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div>Create Movie</div>
        <%
            Movie pelicula = new  Movie("ant-man", "desconocido", "el hombre hormiga.");
            out.print(pelicula);
            MovieDao crud = new MovieDao();
//            save 
            crud.createMovie(pelicula);
        %>
    </body>
</html>
