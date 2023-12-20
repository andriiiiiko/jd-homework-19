# REST API for Notes

The goal of this homework is to create a simple REST API for handling notes with four main actions: create, read, 
update, and delete. The API should be built using the Spring Boot framework with Spring Data and Spring MVC modules. 
The application should utilize a relational database (in-memory H2 or others such as PostgreSQL/MariaDB) and include 
at least one migration using the Flyway database migration framework.

## API Features

- **Create a Note**
  - **Method:** POST
  - **Endpoint:** `/api/notes`
  - **Description:** Create a new note.

- **Retrieve a Note**
  - **Method:** GET
  - **Endpoint:** `/api/notes/{id}`
  - **Description:** Retrieve a specific note by ID.

- **Update a Note**
  - **Method:** PUT
  - **Endpoint:** `/api/notes/{id}`
  - **Description:** Update an existing note.

- **Delete a Note**
  - **Method:** DELETE
  - **Endpoint:** `/api/notes/{id}`
  - **Description:** Delete a note by ID.

### Additional Endpoints

- **Create a Note (Alternative)**
  - **Method:** POST
  - **Endpoint:** `/api/v1/notes/create`
  - **Description:** Create a new note using an alternative endpoint.

- **Update a Note (Alternative)**
  - **Method:** POST
  - **Endpoint:** `/api/v1/notes/update/{id}`
  - **Description:** Update an existing note using an alternative endpoint.

- **Delete a Note (Alternative)**
  - **Method:** POST
  - **Endpoint:** `/api/v1/notes/delete/{id}`
  - **Description:** Delete a note by ID using an alternative endpoint.

## General Requirements

- Utilize Spring Boot framework
- Use Spring Data and Spring MVC modules
- Employ a relational database
- Include at least one migration using the Flyway database migration framework
- Implement validation for request fields during the creation and updating of a note

## Technologies Used

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Data](https://spring.io/projects/spring-data)
- [Spring MVC](https://docs.spring.io/spring-framework/docs/current/reference/html/web.html)
- [Flyway](https://flywaydb.org/)

## How to Run

1. Clone the repository.
2. Configure the database settings in the application.yml file.
3. Run the application.