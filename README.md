# Workshop MongoDB

A simple project developed as a workshop to learn the fundamentals of Spring Boot with MongoDB. This application is a small blog system where users can be created, and they can create posts and comment on them.

## Features

-   **User Management:**
    -   Create, retrieve, update, and delete users.
    -   View all posts by a specific user.
-   **Post Management:**
    -   Retrieve posts by ID.
    -   Search for posts by title.
    -   Full-text search in post titles, bodies, and comments within a date range.

## Technologies Used

-   **Java 21**
-   **Spring Boot 3.5.6**
-   **Maven**
-   **MongoDB**
-   **Spring Web**
-   **Spring Data MongoDB**

## API Endpoints

### User Endpoints

| Method | Endpoint | Description |
| --- | --- | --- |
| `GET` | `/users` | Retrieves a list of all users. |
| `GET` | `/users/{id}` | Retrieves a specific user by their ID. |
| `POST` | `/users` | Creates a new user. |
| `PUT` | `/users/{id}` | Updates an existing user. |
| `DELETE` | `/users/{id}` | Deletes a user. |
| `GET` | `/users/{id}/posts` | Retrieves all posts from a specific user. |

### Post Endpoints

| Method | Endpoint | Description |
| --- | --- | --- |
| `GET` | `/posts/{id}` | Retrieves a specific post by its ID. |
| `GET` | `/posts/titlesearch?text=<text>` | Searches for posts by title. |
| `GET` | `/posts/fullsearch?text=<text>&minDate=<yyyy-MM-dd>&maxDate=<yyyy-MM-dd>` | Performs a full search on posts. |

## How to Run

1.  **Clone the repository:**
    ```bash
    git clone <repository-url>
    ```
2.  **Navigate to the project directory:**
    ```bash
    cd workshopmongodb
    ```
3.  **Run the application using Maven:**
    ```bash
    ./mvnw spring-boot:run
    ```
    The application will start on `http://localhost:8080`.

## Database Configuration

The application is configured to connect to a local MongoDB instance. You can change the database URI in the `src/main/resources/application.properties` file:

```properties
spring.data.mongodb.uri=mongodb://localhost:27017/workshop_mongo
