# Spring Data Rest Sample
Sample project with spring boot, spring data rest and spring security

# USAGE

This project saves data in memory with the H2 Database.

Run this project and access `http://localhost:8080/` to see endpoints availables.

List authors (public)

`curl -X GET http://localhost:8080/authors`

List books (public)

`curl -X GET http://localhost:8080/books`

Delete Book with ID 10 (private)

`curl -X DELETE http://localhost:8080/books/10 -u admin:admin`

Add new Author (private)

`curl -X POST -H "Content-type: application/json" -d '{"name": "Zefinha"}' http://localhost:8080/authors -u admin:admin`


